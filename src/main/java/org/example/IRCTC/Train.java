package org.example.IRCTC;

public class Train {
    public String trainname;
    public Integer noofBookings;

    public Train(String trainname, Integer noofBookings) {
        this.trainname = trainname;
        this.noofBookings = noofBookings;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public Integer getNoofBookings() {
        return noofBookings;
    }

    public void setNoofBookings(Integer noofBookings) {
        this.noofBookings = noofBookings;
    }
}