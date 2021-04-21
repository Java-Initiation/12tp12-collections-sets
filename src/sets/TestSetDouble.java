package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

    public static void main(String args[]) {
        HashSet<Double> mySet = new HashSet<>();
        mySet.add(1.5);
        mySet.add(8.25);
        mySet.add(-7.321);
        mySet.add(13.3);
        mySet.add(-12.45);
        mySet.add( 48.5);
        mySet.add(0.01);

        for (Double aDouble : mySet) {
            System.out.println(aDouble);
        }

        System.out.println("*****************");
        Double plusGrandElement = 0d;
        for (Double var1 : mySet) {
            System.out.println(var1);
            if (var1 > plusGrandElement) {
                plusGrandElement = var1;
            }
        }
        System.out.println("plus Grand Element = " + plusGrandElement);
        System.out.println("*****************");
        Double plusPetitElement = 0d;
        for (Double var1 : mySet) {
            System.out.println(var1);
            if (var1 < plusPetitElement) {
                plusPetitElement = var1;
            }
        }
        System.out.println("*****************");
        System.out.println("plus Petit Element = " + plusPetitElement);
        mySet.remove(plusPetitElement);
        for (Double aDouble : mySet) {
            System.out.println(aDouble);
        }

    }

}
