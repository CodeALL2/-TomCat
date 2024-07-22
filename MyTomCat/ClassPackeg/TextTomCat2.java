import analyze.MyRequest;
import analyze.MyResponse;
import analyze.MyServlet;
import resource.Application;
import responseio.Write;

public class TextTomCat2 implements MyServlet {
    @Override
    public void init() {

    }

    @Override
    public void service(MyRequest request, MyResponse response) {
        response.setStatus(200);
        response.setContentType("text/html");
        response.setCharset("UTF-8");
        Application application = request.getApplication();
        Object number = application.getValue("number");
        int num = 0;
        if (number != null) {
            num = (Integer) application.getValue("number");
        }
        Write write = response.getWrite();
        write.out("<html><body><p>第二个测试页面" + num+ "</p></body></html>\n");

    }
}
