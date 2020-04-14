package com.company;

import java.util.*;

//Maps contain key value pairs

public class SortExample {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy olson", 68);
        Person bertCooper = new Person("Bert Cooper", 10);
        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        final Person youngestCastMember = (Person) min(madMen, new AgeComparator());

           System.out.println(youngestCastMember);
    }


        private static <T> Object min(List<T> values, Comparator<T> comparator) {
            if (values.isEmpty()) {
                throw new IllegalArgumentException("List is empty, can not find min");
            }
            T lowestElement = values.get(0);
            for (int i =1; i<values.size(); i++){
                final T  element = values.get(i);
                if (comparator.compare(element, lowestElement) <0){
                    lowestElement = element;
                }

            }
            return lowestElement;
        }
    }




//        //looping over madMen and returning the Keys
//        for (String name: madMen.keySet()){
//            System.out.println(name);
//        }
//        //looping and returing the person
//        for (Person person: madMen.values()){
//            System.out.println(person);
//        }
//
//        //looping and returning both. We use the Entry element
//        for (Map.Entry<String, Person> entry: madMen.entrySet()){
//            System.out.println(entry);
//
//        }


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



