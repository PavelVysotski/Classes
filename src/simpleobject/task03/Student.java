package simpleobject.task03;

import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int[] markProgress = new int[5];

    public Student(String name, int group, int[] markProgress) {
        this.name = name;
        this.group = group;
        this.markProgress = markProgress;
    }

    public boolean excellentMark() {
        for ( int i = 0; i < markProgress.length; i++ ) {
            if (markProgress[i] < 9) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getMarkProgress() {
        return markProgress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setMarkProgress(int[] markProgress) {
        this.markProgress = markProgress;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "имя - " + name + ", группа - " + group +
                ", успеваемость - " + Arrays.toString(markProgress) +
                '}';
    }
}
