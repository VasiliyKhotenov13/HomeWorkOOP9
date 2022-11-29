import java.util.HashMap;
import java.util.Map;

public class RandomNum {
    public Map<String, Integer> random = new HashMap<>();

    public void addRandom(String string, Integer integer) {
        if (random.containsKey(string)) {
            if (integer.equals(random.get(string))) {
                throw new RuntimeException("Данный объект существует!");
            }
        } else {
            random.put(string, integer);
        }
    }


    public void printAllRandomNum() {
        for (Map.Entry<String, Integer> entry : random.entrySet()) {
            System.out.printf("%s : %d%n", entry.getKey(), entry.getValue());
        }
    }

    public Map<String, Integer> getRandom() {
        return random;
    }

    @Override
    public String toString() {
        return "Random{}";
    }
}
