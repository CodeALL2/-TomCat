package analyze;

public interface MyServlet {
    //初始化一些信息
    public void init();
    //正式调用
    public void service(MyRequest request, MyResponse response); //无论什么请求都会发给它
}
