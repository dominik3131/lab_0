package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<String> tailsList = new ArrayList<>(value.length() + 1);

        for (int i = 0; i <= value.length(); i++) {
            tailsList.add(i, value.substring(i));
        }
        return tailsList;
    }

}
