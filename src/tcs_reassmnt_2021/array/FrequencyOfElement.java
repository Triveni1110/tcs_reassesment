package tcs_reassmnt_2021.array;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String args[]) {
		int[] a1 = { 10, 20, 10, 20, 20, 30, 30, 40, 50, 10, 60, 70 };
		Arrays.sort(a1);
		int[][] freqArray = new int[a1.length][a1.length];
		int k = 0;
		for (int i = 0; i < a1.length; i++) {

			int count = 0;
			int elemnt = a1[i];
			if (elemnt != -1) {
				count = 1;
				for (int j = i + 1; j < a1.length; j++) {
					if (a1[i] == a1[j]) {
						a1[j] = -1;
						count++;
					}
				}
				freqArray[k][0] = elemnt;
				freqArray[k][1] = count;
				System.out.println("" + elemnt + "," + count);
				k++;
			}

		}
		for (int i = 0; i < freqArray.length; i++) {
			if (freqArray[i][0] != 0 && freqArray[i][1] >1)
				System.out.println(" " + freqArray[i][0] + "  " + freqArray[i][1]);
		}
	}

}
