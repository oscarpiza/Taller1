
public class InsertionSort {

	public InsertionSort() {
	}

	public int[] insertionsort(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			int temp = numeros[i];
			int j;

			for (j = i - 1; j >= 0 && temp < numeros[j]; j--) {
				numeros[j + 1] = numeros[j];

			}

			numeros[j + 1] = temp;

		}

		return numeros;

	}

}
