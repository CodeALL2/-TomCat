package responsePage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ResponsePage {
    public static String rsPage(String pagePath) {
        File jsonFile = new File("./config/" + pagePath);
        String currentPath = System.getProperty("user.dir");
        // 打印当前工作目录
        System.out.println("当前的工作目录是: " + currentPath);
        String pageData = "";
        try {
            FileReader fileReader = new FileReader(jsonFile);
            BufferedReader reader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();

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
            pageData = sb.toString();
        } catch (IOException e) {
        }
        return pageData;
    }
}
