package simpleobject.task05;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        if (value > 9) {
            this.value = 9;
        } else if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public void plusOne() {
        value++;
        if (value > 9) {
            value = 0;
        }
    }

    public void minusOne() {
        value--;
        if (value < 0) {
            value = 9;
        }
    }

    public int position() {
        return value;
    }
}
