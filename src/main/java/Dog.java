//Создайте класс Dog унаследуйте его от Animal
public class Dog extends Animal {
    //Переопределить метод Say(Вывод на экран: "Гав")
    @Override
    public void say() {
        System.out.print("Гав");
    }
}
