package MyArrays;

public class MyArrays {

    int[] array = new int[3]; //примитивный тип
    Candy[] box = new Candy[5]; //Коробка с конфетами (ссылочный тип). Создание и инициализация массива

    int[] array2 = {10, 3, 7};

    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird}; // Создание и инициализация массива

    Candy[] box3; // Объявление ссылки на массив (объявление массива)

    public void foo() {
            System.out.println(box[0]);

        }
    }

