package ru.bmstu.iu9;

import java.io.Serializable;

public class StatisticDelay  implements Serializable {

    private int countAllFlights;
    private int countCancelledFlights;
    private int countDelayedFlights;
    private float maxDelayed;

    public StatisticDelay(){}

    public StatisticDelay(int countAllFlights, int countCancelledFlights,
                          int countDelayedFlights, float maxDelayed){

        this.countAllFlights = countAllFlights;
        this.countCancelledFlights = countCancelledFlights;
        this.countDelayedFlights = countDelayedFlights;
        this.maxDelayed = maxDelayed;
    }

    public int getCountAllFlights(){
        return countAllFlights;
    }

    public int getCountCancelledFlights(){
        return countCancelledFlights;
    }

    public int getCountDelayedFlights(){
        return countDelayedFlights;
    }

    public float getMaxDelayed(){
        return maxDelayed;
    }

    public void setCountAllFlights(int countAllFlights) {
        this.countAllFlights = countAllFlights;
    }

    public void setCountCancelledFlights(int countCancelledFlights) {
        this.countCancelledFlights = countCancelledFlights;
    }

    public void setCountDelayedFlights(int countDelayedFlights) {
        this.countDelayedFlights = countDelayedFlights;
    }

    public void setMaxDelayed(float maxDelayed) {
        this.maxDelayed = maxDelayed;
    }

    public static addStatistic(StatisticDelay )

    @Override
    public String toString() {
        return
                "StatisticDelay{" +
                        "countAllFlights=" + countAllFlights +
                        ", countCancelledFlights=" + countCancelledFlights +
                        ", countDelayedFlights=" + countDelayedFlights +
                        ", maxDelayed=" + maxDelayed +
                        '}';
    }
}
