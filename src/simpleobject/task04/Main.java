package simpleobject.task04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    /*
    Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    назначения должны быть упорядочены по времени отправления.
    */

    private static Train[] trains;

    public static void main(String[] args) {

        boolean cycle = true;
        while (cycle) {
            int actionIndex = chooseAction();
            init();

            switch (actionIndex) {
                case 1:
                    showAllList();
                    break;
                case 2:
                    sortByTrain();
                    showAllList();
                    break;
                case 3:
                    showTrainNumber();
                    infoByNumber();
                    break;
                case 4:
                    //Видимо этот вариант сортировки нужно делать через коллекцию, что-то не выходит.
                    Train temp;
                    for ( int i = 0; i < trains.length - 1; i++ ) {
                        for ( int j = 0; j < trains.length - i - 1; j++ ) {
                            if (trains[i].getDestination() == trains[i].getDestination() & trains[i].getDepTime() > trains[j + 1].getDepTime()) {
                                temp = trains[j];
                                trains[j] = trains[j + 1];
                                trains[j + 1] = temp;
                            }

                        }
                    }
                    showAllList();
                    break;
                case 5:
                    cycle = false;
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте еще раз");
            }
        }
    }

    public static void init() {
        trains = new Train[5];
        Train train0 = new Train("Москва", 153, 1744);
        Train train1 = new Train("Витебск", 148, 1400);
        Train train2 = new Train("Москва", 156, 1551);
        Train train3 = new Train("Киев", 108, 1015);
        Train train4 = new Train("Москва", 94, 1010);

        trains[0] = train0;
        trains[1] = train1;
        trains[2] = train2;
        trains[3] = train3;
        trains[4] = train4;
    }

    public static void sortByTrain() {
        Train temp;
        for ( int i = 0; i < trains.length - 1; i++ ) {
            for ( int j = 0; j < trains.length - i - 1; j++ ) {
                if (trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()) {
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                }
            }
        }
    }

    public static void showTrainNumber() {
        for ( int i = 0; i < trains.length; i++ ) {
            System.out.println(trains[i].getTrainNumber());
        }
    }

    public static void infoByNumber() {
        int numb = inputNumber("Введите номер поезда:");
        for ( int i = 0; i < trains.length; i++ ) {
            if (numb == trains[i].getTrainNumber()) {
                System.out.println("Поезд " + (i + 1) + ": " + trains[i]);
            }
        }
    }


    public static void showAllList() {
        for ( int i = 0; i < trains.length; i++ ) {
            System.out.println("Поезд " + (i + 1) + ": " + trains[i]);
        }
    }

    public static int chooseAction() {
        menuAction();

        return inputNumber("Выберите действие: ");
    }

    public static void menuAction() {
        System.out.println();
        System.out.println("1. Показать расписание поездов.");
        System.out.println("2. Показать расписание по возрастанию номера поездов.");
        System.out.println("3. Показать информацию по номеру поезда.");
        System.out.println("4. Сортировка по пункту назаначения.");
        System.out.println("5. Выход");
    }

    public static int inputNumber(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
