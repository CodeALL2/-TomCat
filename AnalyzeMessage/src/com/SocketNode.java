package com;

import ClassPackeg.TextTomCat;
import StartClassLoad.MyClassLoad;
import analyze.AnalysisTool;
import analyze.MyRequest;
import analyze.MyResponse;
import analyze.MyServlet;
import analyzeurl.AnalyzeUrl;
import resource.Session;
import responsePage.ResponsePage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketNode implements Runnable{

    private Socket s;


    public SocketNode(Socket s){
        this.s = s;
    }

    @Override
    public void run() {

        try {
            OutputStream outputStream = s.getOutputStream();
            InputStream inputStream = s.getInputStream();

            byte buff[] = new byte[1024];
            int len = -1;


            while ((len = inputStream.read(buff)) != -1){
                System.out.println("客户端0接受信息" + new String(buff, 0, len));
                //获取到所有信息
                //将此信息交给工具解析,并且将解析数据返回
                MyRequest myRequest = new MyRequest(Server.getApplication(), new Session());
                MyResponse myResponse = new MyResponse();
                AnalysisTool.anaLysis(new String(buff, 0, len), myRequest);
                //此时开始解析路径
                String servletClass = AnalyzeUrl.analyzeURL(myRequest.getURL());
                if (servletClass.equals("/")){ //默认页面
                    System.out.println("jinru");
                    String pageData = ResponsePage.rsPage("first.html");
                    myResponse.setContentType("text/html");
                    myResponse.setStatus(200);
                    String responseMessage = myResponse.getResponseMessage();
                    System.out.println("===========");
                    System.out.println(responseMessage + pageData);
                    System.out.println("===========");
                    outputStream.write((responseMessage + pageData).getBytes());
                }else {
                    MyServlet myServlet = MyClassLoad.ClassLoad(servletClass);
                    myServlet.service(myRequest, myResponse);
                    //outputStream.write("HTTP/1.1 200 OK\r\nContent-Length: 55\r\nContent-Type: text/html; charset=utf-8\r\n\r\n<html><body><p>1</p></body></html>\n\n".getBytes());
                    outputStream.write(myResponse.getData().getBytes());
                    System.out.println("***********");
                    System.out.println(myResponse.getData());
                    System.out.println("***********");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
