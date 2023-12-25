package task02;

import java.util.function.Supplier;

public class Main02 {

    public static void main(String[] args) {

        // Виклик дефолтного конструктора
        User user1 = getUser(User::new);
        user1.setName("Tom");
        user1.setPhone("555 123-8596");
        System.out.println("User name is " + user1.getName() +
                ", phone " + user1.getPhone());
    }

    // Створюємо об'єкт класу через інтерфейс Supplier
    public static User getUser(Supplier<User> supplier) {
        return supplier.get();
    }
}