package tcs_reassmnt_2021.array;

public class ArrayOrder {
	public static void main(String args[]) {
		System.out.println("descending order");
		int[] origArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 90, 80, 13, 150 };

		int tempArray[] = new int[origArray.length];
		int max = 0;
		int temp = 0;
		for (int i = 0; i < origArray.length; i++) {
			max = origArray[i];
			for (int j = i + 1; j < origArray.length; j++) {
				if (origArray[j] > max) {
					temp = max;
					max = origArray[j];
					origArray[j] = temp;
				}

			}

			tempArray[i] = max;
		}
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}
	}
}
