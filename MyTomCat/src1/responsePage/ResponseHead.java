package responsePage;

public class ResponseHead {
    //状态行
    private String version = "HTTP/1.1"; //版本信息
    private int status = 404;  //状态码默认服务器上不存在
    private String statusDes; //状态码描述信息

    //响应报头
    private String contentType;
    private int contentLength;
    private String charset = "UTF-8";

    //body
    private String body;

    public void setVersion(String version) {
        this.version = version;
    }

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getResponseMessage(){
        return  version + " " + status + " " +  statusDes + "\n" +
                "Content-Type:" + contentType + ";charset=" + charset + "\n" +
                "\n" + body;
    }
}
