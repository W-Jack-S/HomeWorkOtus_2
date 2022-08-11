//Создайте класс Cat унаследуйте его от Animal
public class Cat extends Animal {
    //Переопределить метод Say(Вывод на экран: "Мяу")
    @Override
    public void say() {
        System.out.print("Мяу");
    }
}
