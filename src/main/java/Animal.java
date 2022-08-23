

//1) Создайте родительский класс Animal
public class Animal {

//Свойства name, age, weight, color
    public String name;
    public int age;
    public int weight;
    public String color;
    public String year;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    //Методы Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    //Методы Getter and Setter
    public void setAge(int age) {
        this.age = age;
        //лет или год, или года должно быть выбрано в зависимости от числа


    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Метод Say
    public void say() {
        System.out.print("Я говорю ");
    }

    //Метод Go
    public void go() {
        System.out.print("Я иду ");
    }

    //Метод Drink
    public void drink() {
        System.out.print("Я пью ");
    }

    //Метод Eat
    public void eat() {
        System.out.print("Я ем ");
    }



    //Переопределите метод toString
    @Override
    public String toString() {
        return "\nПривет! меня зовут " + getName() + " мне " + getAge() + " " + year(age) + ", я вешу " + getWeight() + " кг, мой цвет " + getColor();
    }

    public String year(int age)
    {
        if ((age%10 == 1) && (age%100 != 11)) {
            return "год";
        } else if ((age%10 > 1) && (age%10 < 5) && (age%100 != 12) && (age%100 != 13) && (age%100 != 14)){
            return "года";
        } else return "лет";
    }


}
