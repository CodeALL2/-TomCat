package StartClassLoad;
import ClassPackeg.TextTomCat;
import analyze.MyServlet;

public class MyClassLoad {
    public static MyServlet ClassLoad(String path){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = null;
        MyServlet servlet = null;
        try {
            aClass = systemClassLoader.loadClass(path);
            servlet = (MyServlet) aClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return servlet;
    }
}
