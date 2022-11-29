import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Геннадий0", "Галкин0"), "13-13-13-13");
        phoneBook.addPhone(new FullName("Геннадий1", "Галкин1"), "111-111-11");
        phoneBook.addPhone(new FullName("Геннадий2", "Галкин2"), "222-222-222");
        phoneBook.addPhone(new FullName("Геннадий3", "Галкин3"), "333-333-333");
        phoneBook.addPhone(new FullName("Геннадий4", "Галкин4"), "444-444-444");
        phoneBook.addPhone(new FullName("Геннадий5", "Галкин5"), "555-555-555");
        phoneBook.addPhone(new FullName("Геннадий6", "Галкин6"), "666-666-666");
        phoneBook.addPhone(new FullName("Геннадий7", "Галкин7"), "777-777-777");
        phoneBook.addPhone(new FullName("Геннадий8", "Галкин8"), "888-888-888");
        phoneBook.addPhone(new FullName("Геннадий9", "Галкин9"), "999-999-999");
        phoneBook.addPhone(new FullName("Василий1", "Алибабаевич1"), "123-123-111");
        phoneBook.addPhone(new FullName("Василий2", "Алибабаевич2"), "123-123-222");
        phoneBook.addPhone(new FullName("Василий3", "Алибабаевич3"), "123-123-333");
        phoneBook.addPhone(new FullName("Василий4", "Алибабаевич4"), "123-123-444");
        phoneBook.addPhone(new FullName("Василий5", "Алибабаевич5"), "123-123-555");
        phoneBook.addPhone(new FullName("Василий6", "Алибабаевич6"), "123-123-666");
        phoneBook.addPhone(new FullName("Василий7", "Алибабаевич7"), "123-123-777");
        phoneBook.addPhone(new FullName("Василий8", "Алибабаевич8"), "123-123-888");
        phoneBook.addPhone(new FullName("Василий9", "Алибабаевич9"), "123-123-999");
        phoneBook.addPhone(new FullName("Сан", "Саныч"), "111-111-111");

        System.out.println("Телефонный справочник:");
        for (Map.Entry<FullName, String> phone : phoneBook.getPhone()) {
            System.out.println("Абонент - " + phone.getKey() +
                    " , номер телефона: " + phone.getValue());
            System.out.println("---------------------------------------------" +
                    "--------------------------------");
        }
    }
}