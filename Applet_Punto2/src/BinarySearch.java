/**
 * 
 */

/**
 * @author Oscar
 *
 */
public class BinarySearch {

	public static int binaria(int[] vec, int buscar) {

		int inicio = 0;
		int fin = vec.length - 1;
		int medio;

		while (inicio <= fin) {

			medio = (inicio + fin) / 2;

			if (vec[medio] == buscar) {
				return medio;
			} else if (vec[medio] < buscar) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}
		return -1;
	}
}

