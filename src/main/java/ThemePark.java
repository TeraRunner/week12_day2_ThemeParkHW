import Interfaces.IReviwed;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviwed> ratingList;

    public ThemePark() {
        this.ratingList = new ArrayList<>();
    }

    public ThemePark(ArrayList<IReviwed> ratingList) {
        this.ratingList = ratingList;
    }

    public ArrayList<IReviwed> getAllReviewed() {
        return ratingList;
    }

}
