package com.company;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {
	// write your code here
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy olson", 68);

        Person[] madMen = {donDraper, peggyOlson};
        System.out.println(Arrays.toString(madMen));

        Person bertCooper = new Person("Bert Cooper", 100);
        // adds 1 person to the array
        madMen= add(bertCooper, madMen);

        System.out.println(Arrays.toString(madMen));

    }

    private static Person[] add(final Person person, Person[] array) {
       final int length = array.length;
        array = Arrays.copyOf(array, length + 1); //increases the length of the array by 1
        array[length] = person; //assigns person to the last index
        return array;

    }

}
