package ClassPackeg;

import analyze.MyRequest;
import analyze.MyResponse;
import analyze.MyServlet;
import resource.Application;
import responseio.Write;

public class TextTomCat implements MyServlet {
    @Override
    public void init() {
    }
    @Override
    public void service(MyRequest request, MyResponse response) {
        response.setContentType("text/html");
        response.setStatus(200);
        Write write = response.getWrite();
        Application application = request.getApplication();
        application.addValue("number", 1);
        write.out("<html><body><p>Hello CodeBo_TomCat</p></body></html>\n");
    }

    public String text(){
        return "123";
    }
}
