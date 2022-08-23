import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static String enteredText, name, color;
    public static int age, weight;

    public static boolean exit;
    public static Scanner scan1, scan2, scan3, scan4, scan5, scan6;
    public static ArrayList<Animal> animal;

    public static void main(String[] args) throws Exception {

        animal = new ArrayList();

        scan1 = new Scanner(System.in);
        scan2 = new Scanner(System.in);
        scan3 = new Scanner(System.in);
        scan4 = new Scanner(System.in);
        scan5 = new Scanner(System.in);
        scan6 = new Scanner(System.in);

        do {
            try {
                System.out.println("Для добавления животного введите ADD\nДля вывода информации о всех животных введите LIST\nДля вывода из программы введите EXIT");
                enteredText = scan1.nextLine().toLowerCase().trim();
                switch (enteredText) {
                    case "add":
                        createAnimal();
                        break;
                    case "list":
                        System.out.println(animal);
                        break;
                    case "exit":
                        exit = true;
                        break;
                    default:
                        System.out.println("Неизвестная команда, допустимо только ADD, DOG, DUCK");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода, начните заново");
            }

        } while (exit != true);
    }

    public static void createAnimal() {
        System.out.println("Какое животное вы хотите добавить? Можно выбрать из Dog, Cat, Duck");
        String ani = scan2.nextLine().toLowerCase().trim();
        switch (ani) {
            case "cat":
                System.out.println("Как зовут ваше животное?");
                name = scan3.nextLine().toLowerCase().trim();
                System.out.println("Сколько лет вашему животному?");
                age = scan4.nextInt();
                System.out.println("Сколько весит ваше животное?");
                weight = scan5.nextInt();
                System.out.println("Какого цвета ваше животное?");
                color = scan6.nextLine().toLowerCase().trim();
                Cat cat = new Cat(name, age, weight, color);
                cat.setAge(age);
                animal.add(cat);
                cat.say();
                break;

            case "dog":
                System.out.println("Как зовут ваше животное?");
                name = scan3.nextLine().toLowerCase().trim();
                System.out.println("Сколько лет вашему животному?");
                age = scan4.nextInt();
                System.out.println("Сколько весит ваше животное?");
                weight = scan5.nextInt();
                System.out.println("Какого цвета ваше животное?");
                color = scan6.nextLine().toLowerCase().trim();
                Dog dog = new Dog(name, age, weight, color);
                dog.setAge(age);
                animal.add(dog);
                dog.say();
                break;

            case "duck":
                System.out.println("Как зовут ваше животное?");
                name = scan3.nextLine().toLowerCase().trim();
                System.out.println("Сколько лет вашему животному?");
                age = scan4.nextInt();
                System.out.println("Сколько весит ваше животное?");
                weight = scan5.nextInt();
                System.out.println("Какого цвета ваше животное?");
                color = scan6.nextLine().toLowerCase().trim();
                Duck duck = new Duck(name, age, weight, color);
                duck.setAge(age);
                animal.add(duck);
                duck.say();
                break;

            default:
                System.out.println("Неизвестное животное, допустимо только cat, dog, duck");
        }
    }
}


