package com.company;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        //Multiplying by -1 flips everything in the reverse order
        return  Integer.compare(left.getAge(), right.getAge());
    }
}
