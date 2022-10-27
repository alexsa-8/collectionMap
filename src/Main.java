import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> numberOfDays = new HashMap<>();
        numberOfDays.put("Июнь", 30); //1
        numberOfDays.put("Июнль", 31); //2
        numberOfDays.put("Август", 31); //3
        Collection avgust = new Collection("Август", 31); //4
        System.out.println(numberOfDays.values());

        for (Map.Entry<String, Integer> month : numberOfDays.entrySet())
            if (!month.getKey().equals(avgust.getMonth())) numberOfDays.put("Август", 31);
            else if ((month.getKey().equals(avgust.getMonth()))
                    && (month.getValue() == Collection.getNumberDays())) System.out.println("Исключение");
            else numberOfDays.remove("Август", 31);
        System.out.println(numberOfDays.values());

    }
}