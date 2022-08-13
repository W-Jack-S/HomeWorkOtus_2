//Создайте класс Duck унаследуйте его от Animal
public class Duck extends Animal implements Flying{

    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    //Переопределить метод Say(Вывод на экран: "Кря")
    @Override
    public void say() {
        System.out.print("Кря\n");
    }

    @Override
    public void fly() {
        System.out.print("Я лечу");
    }
}
