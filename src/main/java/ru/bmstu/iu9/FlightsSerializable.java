package ru.bmstu.iu9;

import java.io.Serializable;

public class FlightsSerializable implements Serializable {

    private int airportIDFrom;
    private int airportIDTo;
    private float delayTime;
    private float cancelled;

    public FlightsSerializable() {}

    public FlightsSerializable(int airportIDFrom, int airportIDTo,
                               float delayTime, float cancelled){

        this.airportIDFrom = airportIDFrom;
        this.airportIDTo = airportIDTo;
        this.delayTime = delayTime;
        this.cancelled = cancelled;

    }

    public float getDelayTime(){
        return delayTime;
    }

    public float getCancelled(){
        return cancelled;
    }
}
