package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randNumbers = new ArrayList<>();
        fillArrayListWithRandomNumbers(randNumbers);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        arrayListWithOddNumbers(oddNumbers, randNumbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        arrayListWithEvenNumbers(evenNumbers, randNumbers);

        printElementsOfArrayList(randNumbers, oddNumbers, evenNumbers);

    }
    public static void printElementsOfArrayList (ArrayList<Integer> randNumbers,
                                                 ArrayList<Integer> oddNumbers,
                                                 ArrayList<Integer> evenNumbers) {
        System.out.println("Random numbers: ");
        for(int i: randNumbers) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\nOdd numbers of the array: ");
        for (int i : oddNumbers) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\nEven numbers of the array");
        for (int i : evenNumbers) {
            System.out.print(i + ", ");
        }
    }

    public static void arrayListWithEvenNumbers(ArrayList<Integer> evenNumbers, ArrayList<Integer> randNumbers) {
        for(int i: randNumbers) {
            if(i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
    }

    public static void arrayListWithOddNumbers(ArrayList<Integer> oddNumbers, ArrayList<Integer> randNumbers) {
        for(int i: randNumbers) {
            if(i % 2 == 1) {
                oddNumbers.add(i);
            }
        }
    }

    public static void fillArrayListWithRandomNumbers(ArrayList<Integer> numbers) {
        Random random = new Random();
        for(int i = 0; i < 50; i++) {
            numbers.add(i, random.nextInt(1,100));
        }

    }
}
