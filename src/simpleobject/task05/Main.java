package simpleobject.task05;

import simpleobject.task04.Train;

public class Main {
    /*
    Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
    */

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Увеличение:");
        for (int i = 0; i < 15; i++) {
            System.out.print(counter.position() + " ");
            counter.plusOne();
        }
        System.out.println();

        System.out.println("Уменьшение:");
        for (int i = 0; i < 35; i++) {
            System.out.print(counter.position() + " ");
            counter.minusOne();
        }
        System.out.println();

        System.out.println("Установка значения:");
        Counter counter2 = new Counter(8);
        System.out.println(counter2.position());

    }
}
