package Atractions;

import Visitor.Visitor;

public class Playground extends Atraction {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 15) {
            return true;
        } else {
            return false;
        }
    }

}
