package Stalls;

import Interfaces.IReviwed;

public abstract class Stall implements IReviwed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getRating() {
        return rating;
    }
}
