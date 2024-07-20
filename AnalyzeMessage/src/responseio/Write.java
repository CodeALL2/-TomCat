package responseio;

public class Write {
    private StringBuffer buffer;

    public Write(StringBuffer buffer){
        this.buffer = buffer;
    }

    public void out(String b){
        buffer.append(b);
    }
}
