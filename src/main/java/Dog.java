//Создайте класс Dog унаследуйте его от Animal
public class Dog extends Animal {
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }


    //Переопределить метод Say(Вывод на экран: "Гав")
    @Override
    public void say() {
        System.out.print("Гав\n");
    }
}
