package ch.edueptm.thisch.p0210;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thisch on 09.09.16.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        ArrayList<String> brands = new ArrayList<>();
        switch (color){
            case "light":
                brands.add("Leffe Blonde");
                brands.add("Kirin Light");
                brands.add("Labatt Blue Light");
                break;
            case "amber":
                brands.add("Tocobaga Red Ale");
                brands.add("YuleSmith");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("Moe Beer");
                brands.add("French Toast");
                break;
            case "dark":
                brands.add("Noire de Chambly");
                brands.add("Black Cat");
                break;
        }
        return brands;
    }
}
