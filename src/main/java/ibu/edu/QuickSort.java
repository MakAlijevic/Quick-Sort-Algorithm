package ibu.edu;

import java.util.Random;

public class QuickSort {
    public static void sort(Comparable[] elements){

    }
    private void shuffle(Comparable[] elements){
        Random random = new Random();

        for(int i = elements.length-1; i > 0; i--){
            int randInt = random.nextInt(i+1);

            Comparable temp = elements[randInt];
            elements[randInt] = elements[i];
            elements[i] = temp;
        }
    }
}
