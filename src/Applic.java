import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by IT Class on 26.10.2017.
 */
public class Applic {
    public static void main(String[] args) {

        //мар - ключевой интерфейс для хранения пар "ключ-значение"
        //явл обобщенным и в качестве обобщения указ-ся типы ключа и значения
        Map<String, Float> money = new TreeMap<>();

        //путь по ключу, если оно есть, то происх его замена
        money.put("петров", 100.5f);
        money.put("Сидоров", 220.5f);

        //обойти все пары в карте
        //1.через ключи
        System.out.println("Обход через все ключи");
        for (String key : money.keySet()){
            System.out.printf("%s -> %s", key, money.get(key));
        }

        Set<String> keys = new HashSet<>();
        keys.add("Петров");
        keys.add("Иванов");

        //удаление
        money.remove("Петров");
        money.put("Сидоров", 250f);

        //2.через пары ключ-значение
        System.out.println("Обход через собственный набор ключей");
        for (Map.Entry<String, Float> entry : money.entrySet()){
            System.out.printf("%s -> %s", entry.getKey(), entry.getValue());
        }

    }
}
