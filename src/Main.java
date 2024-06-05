import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Вызов метода permission 5 раз с различными входными данными
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();
            String result = permission(age, temperature);
            System.out.println("Возраст: " + age + ", Температура: " + temperature + ", Результат: " + result);
        }
    }

    // Метод permission согласно условиям
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    // Метод генерации случайного возраста от 1 до 100
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // Метод генерации случайной температуры от -30 до 40 градусов
    public static int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(71) - 30;
    }
}