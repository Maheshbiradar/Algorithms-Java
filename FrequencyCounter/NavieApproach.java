package AlgorithmsJava.FrequencyCounter;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given the two arrays check if the second array contains the square of array elements of array 1
 * order does not matter
    * [1, 2, 3] -> [1, 4, 9] -> true
    * [1, 3, 1] -> [9, 1, 1] -> true
    * [1, 2, 3] -> [1, 4, 1] -> false
 */

public class NavieApproach {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,4,9));
        System.out.println(same(arr1, arr2));
    }

    public static boolean same(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if(arr1.size() !=  arr2.size()) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            int correctIndex = arr2.indexOf(arr1.get(i) * arr1.get(i));
            if(correctIndex == -1) {
                return false;
            }   
            try {
                arr2.remove(correctIndex);
            } catch (Exception e) {
                System.out.println(e);
            }        
        
        }
        return true;
    }
}
