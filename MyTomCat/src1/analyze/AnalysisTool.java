package analyze;

//解析包信息
public class AnalysisTool{

    private static String data;
    public static void anaLysis(String s, MyRequest request){
        //分割请求行、头
        String[] lines = s.split("\n", 3);
        String requestLine = lines[0];
        String hostLine = lines[1];

        int index1 = requestLine.indexOf(' ');
        int index2 = requestLine.indexOf(' ', index1 + 1);

        //提取method， url, http版本,Host
        String method = requestLine.substring(0, index1);
        String url = requestLine.substring(index1 + 1, index2);
        String httpVersion = requestLine.substring(index2 + 1);
        String host = hostLine.substring("Host: ".length()).trim();

        request.setHost(host);
        request.setRequestMethod(method);
        request.setURL(url);
        request.setHttpVersion(httpVersion);
    }
}
