//Создайте класс Cat унаследуйте его от Animal
public class Cat extends Animal {
    //Переопределить метод Say(Вывод на экран: "Мяу")
    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.print("Мяу\n");
    }
}
