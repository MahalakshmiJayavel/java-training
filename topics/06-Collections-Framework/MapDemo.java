import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> info = new HashMap<>();
        info.put("maha",1);
        info.put("shamee",2);
        info.put("shwe",3);
        System.out.println(info.get("maha"));
        System.out.println(info.containsValue(2));
        System.out.println(info);
    }
}
