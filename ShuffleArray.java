import java.util.Random;
import java.util.Arrays;
public class ShuffleArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
	}
	 public static void shuffle(int[] arr) {
	        Random random = new Random();
	        for (int i = arr.length - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1);
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
}
