package Stalls;

import Visitor.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, int parkingSlot) {
        super(name, ownerName, parkingSlot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }

}
