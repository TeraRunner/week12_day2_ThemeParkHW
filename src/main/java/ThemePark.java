import Atractions.Atraction;
import Interfaces.IReviwed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviwed> ratingList;
    private ArrayList<Atraction> atractionsList;

    public ThemePark() {
        this.ratingList = new ArrayList<>();
        this.atractionsList = new ArrayList<>();

    }

    public ArrayList<IReviwed> getAllReviewed() {
        return ratingList;
    }

}
