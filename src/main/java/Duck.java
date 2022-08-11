//Создайте класс Duck унаследуйте его от Animal
public class Duck extends Animal implements Flying{

    //Переопределить метод Say(Вывод на экран: "Кря")
    @Override
    public void say() {
        System.out.print("Кря");
    }

    @Override
    public void fly() {
        System.out.print("Я лечу");
    }
}
