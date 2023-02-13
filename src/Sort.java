import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which? selection
    public static void selectionSort(int[] elements)
    {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                count++;
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Iterations: " + count);
    }

    public static void insertionSort(int[] elements) //insertion
    {
        int count = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Iterations: " + count);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        /* TO BE IMPLEMENTED IN PART C */
        String temp = null;
        for (int i = 0; i<words.size();i++) {
            for (int a = 0; a<words.size(); a++) {
                if (words.get(a).compareTo(words.get(i)) > 0) {
                    temp = words.get(i);
                    words.set(i,words.get(a));
                    words.set(a,temp);
                }
            }
        }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        /* TO BE IMPLEMENTED IN PART C */

        for (int i = 1; i<words.size(); i++) {
            int idx = i;
            String temp = words.get(i);
            while (idx > 0 && words.get(i).compareTo(words.get(idx-1)) < 0) {
                words.set(idx,words.get(idx-1));
                idx--;
            }
            words.set(idx,temp);
        }
    }
}