import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RadixSort {
	private int[][] Numbers;

	protected String radixSort(String array) {
		String S = "";
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter Bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] Input = array.split(" ");
			int Max = 0;
			for (int i = 0; i < Input.length; i++)
				Max = Input[i].length() > Max ? Input[i].length() : Max;
			Numbers = new int[Input.length][Max];
			for (int i = 0; i < Input.length; i++)
				for (int j = 0; j < Input[i].length(); j++)
					Numbers[i][Max - 1 - j] = Integer
							.parseInt(Input[i].substring(Input[i].length() - 1 - j, Input[i].length() - j));
			Bw.flush();
			MergeSort mergeSort = new MergeSort();

			for (int i = Max - 1; i >= 0; i--)
				Numbers = mergeSort.sortByColumn(Numbers, i);
			for (int i = 0; i < Input.length; i++) {
				for (int j = 0; j < Max; j++)
					S += Numbers[i][j] + "";
				S += " - ";
			}
			Bw.flush();
		} catch (IOException | NumberFormatException ex) {
		}
		return S;
	}
}
