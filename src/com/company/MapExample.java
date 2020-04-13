package com.company;

import java.util.*;

//Maps contain key value pairs

public class MapExample {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy olson", 68);
        Map<String, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyOlson.getName(), peggyOlson);

        //looping over madMen and returning the Keys
        for (String name: madMen.keySet()){
            System.out.println(name);
        }
        //looping and returing the person
        for (Person person: madMen.values()){
            System.out.println(person);
        }

        //looping and returning both. We use the Entry element
        for (Map.Entry<String, Person> entry: madMen.entrySet()){
            System.out.println(entry);

        }


//        Set<Person> madMen = new HashSet<>();
//        madMen.contains(donDraper); // returns boolean
//
//        madMen.add(donDraper);
//        madMen.add(peggyOlson);
//        madMen.add(donDraper);
//        for (Person person: madMen){
//            System.out.println(person);
//        }

//       List is an interface and ArrayList implements it(List)
//        List<Person> madMen = new ArrayList<Person>();
//        madMen.add(donDraper);
//        madMen.add(peggyOlson);
//
//        System.out.println(madMen);
//        madMen.add(new Person("Book Kepper", 100));
//        System.out.println();
//
//        System.out.println("Using the forEach loop of arrow function: ");
//        madMen.forEach((n) -> System.out.println(n));
//
//        System.out.println("Using the forEach loop normal: ");
//        for (Person person: madMen){
//            System.out.println(person);
//        }
//
//
//
//        System.out.println("Using the Iterator: ");
//
//        Iterator<Person> iterator = madMen.iterator();
//        while (iterator.hasNext()){
//            Person person = iterator.next();
//            System.out.println(person);
//        }

//        for ( i : madMen){
//           // Person person = madMen.get(i);
//            System.out.println(i);
//        }


//        Person[] madMen = {donDraper, peggyOlson};
//        System.out.println(Arrays.toString(madMen));
//
//        Person bertCooper = new Person("Bert Cooper", 100);
//        // adds 1 person to the array
//        madMen= add(bertCooper, madMen);
//
//        System.out.println(Arrays.toString(madMen));
//
//    }
//
//    private static Person[] add(final Person person, Person[] array) {
//       final int length = array.length;
//        array = Arrays.copyOf(array, length + 1); //increases the length of the array by 1
//        array[length] = person; //assigns person to the last index
//        return array;
//
//    }
    }

}