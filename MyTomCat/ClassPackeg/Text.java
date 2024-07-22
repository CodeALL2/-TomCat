import analyze.MyRequest;
import analyze.MyResponse;
import analyze.MyServlet;
import resource.Application;
import responseio.Write;

public class Text implements MyServlet {
    @Override
    public void init() {
                System.out.println(text());
    }
    @Override
    public void service(MyRequest request, MyResponse response) {

    }

    public String text(){
        return "123";
    }
}
