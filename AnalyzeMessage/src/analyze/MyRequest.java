package analyze;

import resource.Application;
import resource.Session;

public class MyRequest {
    private String RequestMethod; //获取请求方法
    private String URL; //获取请求资源定位符号
    private String Host; //获取主机
    private String HttpVersion;
    private Application application;

    private String Head; //获取头部信息

    private Session session;

    public MyRequest(Application application, Session session){
        this.application = application;
        this.session = session;
    }

    public String getHttpVersion() {
        return HttpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        HttpVersion = httpVersion;
    }

    public String getRequestMethod() {
        return RequestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        RequestMethod = requestMethod;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        Head = head;
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "RequestMethod='" + RequestMethod + '\'' +
                ", URL='" + URL + '\'' +
                ", Host='" + Host + '\'' +
                ", HttpVersion='" + HttpVersion + '\'' +
                ", Head='" + Head + '\'' +
                '}';
    }

    public Application getApplication() {
        return application;
    }
}
