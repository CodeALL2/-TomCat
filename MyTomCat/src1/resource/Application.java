package resource;

import java.util.HashMap;
import java.util.Objects;

public class Application {
    //公共资源区,其实就是一个HashMap...

    private final static HashMap<String, Object> hashMap = new HashMap<>();

    public void addValue(String key, Object value){
        hashMap.put(key, value);
    }
    public Object getValue(String key){
        Object value = null;
        if (hashMap.containsKey(key)){
            value = hashMap.get(key);
        }
        return value;
    }

    public void removeValue(String key){
        if (hashMap.containsKey(key)){
            hashMap.remove(key);
        }
    }

}
