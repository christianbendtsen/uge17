package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{76, 43, 245, 65, 62,4 , 87, 234, 432, 275, 23, 43, 643};
        selectionSort(array);
    }

    static void selectionSort(int[] array) {

        int tæller = 1;

        for (int i = 0;i<array.length-1;i++) {
            int current = i;
            for (int j = i+1;j<array.length;j++) {
                if (array[j] < array[current]) {
                    current = j;
                }

                System.out.println("Antal gange løkken kører. "+tæller +": "+ Arrays.toString(array));
                tæller++;
            }
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }
        System.out.println("Færdige Sortering er : "+Arrays.toString(array));
    }

    }

