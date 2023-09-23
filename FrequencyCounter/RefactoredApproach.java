package AlgorithmsJava.FrequencyCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RefactoredApproach {
     public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,2,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(9,1,4,4,11));
        System.out.println(same(arr1, arr2));
    }

    public static boolean same(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
       if(arr1.size() != arr2.size()){
        return false;
       }
       HashMap<Integer, Integer> frequencyCounter1 = new HashMap<Integer, Integer>();
       HashMap<Integer, Integer> frequencyCounter2 = new HashMap<Integer, Integer>();
       for(int i: arr1) {
        frequencyCounter1.put(i, frequencyCounter1.containsKey(i) ? frequencyCounter1.get(i) + 1 : 0);
       }
       for(int i: arr2) {
        frequencyCounter2.put(i, frequencyCounter2.containsKey(i) ? frequencyCounter2.get(i) + 1 : 0);
       }
       for(int i: frequencyCounter1.keySet()) {
        if(!(frequencyCounter2.containsKey(i*i))) {
            return false;
        }
         if(frequencyCounter2.get(i * i) != frequencyCounter1.get(i)) {
            return false;
        }
       }
       return true;
    }
}
