import java.util.HashMap;
import java.util.Map;
public class Main {
    private static Map<String, Integer> number=new HashMap<>();

    public static void main(String[] args) {
        number.put("Июнь", 30); //1
        number.put("Июнль", 31); //2
        number.put("Август", 31); //3
        number.put("Сентябрь", 30);//4
        System.out.println(number.values());
        System.out.println(number.keySet());
        checkingKey("Август", 31);//5
        System.out.println(number.values());
        System.out.println(number.keySet());

    }
    public static void checkingKey(String string, Integer integer) {
        if (number.containsKey(string) && number.get(string).equals(integer)) {
                throw new RuntimeException("Такой вариант уже существует.");
        }
        number.put(string, integer);
    }
}