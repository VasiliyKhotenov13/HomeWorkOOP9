import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<FullName, String > phoneBookMap = new HashMap<>();

    public void addPhone(FullName fullName, String number) {
        phoneBookMap.put(fullName, number);
    }

    public Set<Map.Entry<FullName, String>> getPhone() {
        return phoneBookMap.entrySet();

    }
}
