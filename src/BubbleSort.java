import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] myArray = {20, 103, 1000, 3, 5, 7, 15, -5, 0, 12, 3, 50, -10};

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    isSorted = false;
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

}
