package simpleobject.task04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private String destination;
    private int trainNumber;
    private int depTime;

    public Train(String destination, int trainNumber, int depTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.depTime = depTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepTime() {
        return depTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepTime(int depTime) {
        this.depTime = depTime;
    }

    @Override
    public String toString() {
        return "пункт назначения - " + destination + ", номер поезда - " + trainNumber +", время отправления - " + depTime;
    }
}
