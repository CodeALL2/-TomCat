package analyzeurl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AnalyzeUrl {
    public static String analyzeURL(String url){
        if (url.equals("/")){
            return "/";
        }
        File jsonFile = new File("src/config/ServletINF/package.json");
        String string = "";
        String path = "";
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
            string = sb.toString();
            JSONObject parse = JSON.parseObject(string);
            JSONObject o = (JSONObject)parse.get(url);

            Object o1 = o.get("ServletClass");
            path = o1.toString();
            System.out.println(string);
            System.out.println(o1);
        } catch (IOException e) {
            //Response 返回错误信息
        }
        catch (NullPointerException ne) {
            //Response返回错误信息
        }
        return path;
    }
}
