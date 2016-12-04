/**
 * 
 */

/**
 * @author Oscar
 *
 */
public class LinealSearch {

	public static int lineal(int[] vec, int buscar) {

		for (int i = 0; i < vec.length; i++) {
			if (vec[i] == buscar) {
				return i;
			}
		}
		return -1;
	}

}

