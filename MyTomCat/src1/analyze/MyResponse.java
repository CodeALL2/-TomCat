package analyze;

import responseio.Write;

public class MyResponse {
    private String version = "HTTP/1.1"; //版本信息
    private int status = 200;  //状态码
    private String statusDes = "0K"; //状态码描述信息

    //响应报头
    private String contentType;
    private int contentLength;
    private String location;
    private String charset = "UTF-8";

    //body
    public void setVersion(String version) {
        this.version = version;
    }

    private StringBuffer buffer = new StringBuffer();


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDes() {
        return statusDes;
    }

    public void setStatusDes(String statusDes) {
        this.statusDes = statusDes;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public String getCharset() {
        return charset;
    }


    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResponseMessage(){
        return  version + " " + status + " " +  statusDes + "\n" +
                "Location:" + location + "\n" +
                "Content-Type:" + contentType + ";charset=" + charset + "\n" +
                "\n";

    }
    public Write getWrite(){
        return new Write(buffer);
    }

    public StringBuffer getBuffer(){
        return buffer;
    }

    public String getData(){
        return getResponseMessage() + getBuffer();
    }
}

