package Atractions;

import Visitor.Visitor;

public class Rollercoaster extends Atraction{

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() >= 145 ) {
            return true;
        } else {
            return false;
        }
    }

}
