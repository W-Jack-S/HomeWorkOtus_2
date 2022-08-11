import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> animal = new ArrayList();

        Scanner scan = new Scanner(System.in);

        String enteredText = scan.nextLine().toLowerCase().trim();



            switch (enteredText) {
                case "add":
                    System.out.println("add");
                    String ani = scan.nextLine().toLowerCase().trim();
                    switch (ani) {
                        case "cat":
                            Cat cat = new Cat();
                            cat.setName(scan.nextLine().toLowerCase().trim());
                            System.out.println(cat.getName());
                            cat.setAge(scan.nextInt());
                            System.out.println(cat.getAge());
                            cat.setWeight(scan.nextInt());
                            System.out.println(cat.getWeight());
                            cat.setColor(scan.nextLine().toLowerCase().trim());
                            System.out.println(cat.getColor());
                            break;

                        case "dog":
                            Dog dog = new Dog();
                            dog.setName(scan.nextLine().toLowerCase().trim());
                            System.out.println(dog.getName());
                            dog.setAge(scan.nextInt());
                            System.out.println(dog.getAge());
                            dog.setWeight(scan.nextInt());
                            System.out.println(dog.getWeight());
                            dog.setColor(scan.nextLine().toLowerCase().trim());
                            System.out.println(dog.getColor());
                            break;

                       /* case "duck":
                            Dog  = new Dog();
                            dog.setName(scan.nextLine().toLowerCase().trim());
                            System.out.println(dog.getName());
                            dog.setAge(scan.nextInt());
                            System.out.println(dog.getAge());
                            dog.setWeight(scan.nextInt());
                            System.out.println(dog.getWeight());
                            dog.setColor(scan.nextLine().toLowerCase().trim());
                            System.out.println(dog.getColor());
                            break;*/


                    }
                    break;
                case "list":
                    System.out.println("list");
                    break;
                case "exit":
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("error");
                    break;
            }



        //   dog.setAge(2);
        // System.out.println(dog);



/*        Animal dog = new Animal();
        dog.setName("Бобик");
        dog.setAge(5);
        dog.setWeight(15);
        dog.setColor("чёрный");
        System.out.println(dog);

        for (int n = 0; n < 150; n++) {
            dog.setAge(n);
            System.out.println(dog);
        }*/

        // switch {
        //   dog.setAge(2);
        // System.out.println(dog);
    }
}

