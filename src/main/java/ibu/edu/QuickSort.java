package ibu.edu;

import java.util.Random;

public class QuickSort {
    public static void sort(Comparable[] elements){
        shuffle(elements);
        sort(elements,0, elements.length-1);
    }

    private static void sort(Comparable[] elements, int low, int high){
        if(low >= high){
            return;
        }

        Comparable pivot = elements[high];

        int leftP = low;
        int rightP = high;

        while(leftP < rightP){
            while(elements[leftP].compareTo(pivot)<=0 && leftP < rightP){
                leftP++;
            }
            while(elements[rightP].compareTo(pivot)>=0 && leftP < rightP){
                rightP--;
            }
            swap(elements, leftP, rightP);
        }
        swap(elements, leftP, high);

        sort(elements, low, leftP - 1);
        sort(elements, leftP + 1, high);
    }

    private static void swap(Comparable[] elements, int leftP, int rightP){
        Comparable temp = elements[leftP];
        elements[leftP] = elements[rightP];
        elements[rightP] = temp;
    }

    private static void shuffle(Comparable[] elements){
        Random random = new Random();

        for(int i = elements.length-1; i > 0; i--){
            int randInt = random.nextInt(i+1);

            Comparable temp = elements[randInt];
            elements[randInt] = elements[i];
            elements[i] = temp;
        }
    }
}
