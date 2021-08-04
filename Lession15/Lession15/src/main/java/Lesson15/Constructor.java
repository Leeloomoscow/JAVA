package Lesson15;

public class Constructor {
    public void foo(){
        Flower flower = new Flower(); //Конструктор по умолчанию, который не принимает в себя никакие параметры
        flower.name = "Ромашка";
        flower.color = "Белая";

        Flower flower2 = new Flower("Роза", "Красный"); //Конструктор, который принимает параметры
        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower2.name + " " + flower2.color);

    }

}
