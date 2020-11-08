// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 1 - Main class

package exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static String[] strings = {"Endor", "Luke Hunter", "Princess Kiara",
            "Amidalus", "Daedalus", "Shadow King", "Bale Prime", "Lin Quan"};
    private static int[] numbers = {-1, 0, 2, -7, -5, 6, -8, 9, -3, 4};

    public static void main(String[] args) {

        System.out.println("Original Arrays:");
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(numbers));

        String[] longStrings = filter(strings, new Filter<String>() {
            @Override
            public boolean accept(String x) {
                if (x.length() > 9)
                    return true;
                else return false;
            }
        });

        int[] positiveNumbers = filter(numbers, new Filter<Integer>() {
            @Override
            public boolean accept(Integer x) {
                if (x >= 0)
                    return true;
                else return false;
            }
        });

        System.out.println("\nFiltered Arrays:");
        System.out.println(Arrays.toString(longStrings));
        System.out.println(Arrays.toString(positiveNumbers));

    }

    public static String[] filter(String[] a, Filter<String> f) {
        ArrayList<String> filteredList = new ArrayList<>();
        for (String str: a) {
            if (f.accept(str))
                filteredList.add(str);
        }
        String[] filteredArray = new String[filteredList.size()];
        for (int i = 0; i < filteredArray.length; i++)
            filteredArray[i] = filteredList.get(i);
        return filteredArray;
    }

    public static int[] filter(int[] a, Filter<Integer> f) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int num: a) {
            if (f.accept(num))
                filteredList.add(num);
        }
        int[] filteredArray = new int[filteredList.size()];
        for (int i = 0; i < filteredArray.length; i++)
            filteredArray[i] = filteredList.get(i);
        return filteredArray;
    }

}


// OUTPUT
/*
Original Arrays:
[Endor, Luke Hunter, Princess Kiara, Amidalus, Daedalus, Shadow King, Bale Prime, Lin Quan]
[-1, 0, 2, -7, -5, 6, -8, 9, -3, 4]

Filtered Arrays:
[Luke Hunter, Princess Kiara, Shadow King, Bale Prime]
[0, 2, 6, 9, 4]

 */