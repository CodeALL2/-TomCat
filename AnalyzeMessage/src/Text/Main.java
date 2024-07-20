package Text;

import ClassPackeg.TextTomCat;
import analyze.MyRequest;
import analyze.MyServlet;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import responsePage.ResponseHead;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        String classPath = "ClassPackeg.TextTomCat";
        try {
            Class<?> aClass = systemClassLoader.loadClass(classPath);
            Object o = aClass.newInstance();
            MyServlet m = (MyServlet) o;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
         */
        /*
        File jsonFile = new File("src/config/first.html");
        try {
            FileReader fileReader = new FileReader(jsonFile);
            BufferedReader reader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            String string = "";
            while (true) {
                int ch = reader.read();
                if (ch != -1) {
                    sb.append((char) ch);
                } else {
                    break;
                }
            }
            fileReader.close();
            reader.close();
            string = sb.toString();
            System.out.println(string);
        } catch (IOException e) {

        }

         */
        ResponseHead responseHead = new ResponseHead();
        responseHead.setStatus(200);
        responseHead.setContentType("text/html");
        responseHead.setBody("<html><body><p>1</p></body></html>");
        System.out.println(responseHead.getResponseMessage());
    }
}
