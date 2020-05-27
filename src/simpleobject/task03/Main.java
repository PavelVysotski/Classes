package simpleobject.task03;

public class Main {
    /*
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    номеров групп студентов, имеющих оценки, равные только 9 или 10.
    */
    public static void main(String[] args){
        Student[] students = new Student[10];
        int[] rating;

        //Создаем список студентов
        for (int i = 0; i < students.length; i++) {
            rating = new int[5];
            for (int j = 0; j < rating.length; j++) {
                rating[j] = (int) (Math.random() * 3 + 8);
            }
            students[i] = new Student("Student" + (i+1), 123 * i, rating);
        }

        System.out.println("Список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Отличники:");
        for (Student s : students) {
            if (s.excellentMark()) {
                System.out.println(s.getName() + "б группа: " + s.getGroup());
            }
        }
    }
}
