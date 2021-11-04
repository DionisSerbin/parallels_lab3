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

        

    }
}
