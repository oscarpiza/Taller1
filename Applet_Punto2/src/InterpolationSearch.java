/**
 * 
 */

/**
 * @author Oscar
 *
 */
public class InterpolationSearch {
	public static int inter(int[] vector, int encontrar) {

        int alto = vector.length - 1;
        int bajo = 0;
        int medio;

        while ((vector[bajo] <= encontrar) && (vector[alto] >= encontrar)) {

            if (vector[alto] - vector[bajo] == 0) {
                return (bajo + alto) / 2;
            }

            medio = bajo + ((encontrar - vector[bajo]) * (alto - bajo)) / (vector[alto] - vector[bajo]);

            if (vector[medio] < encontrar) {
                bajo = medio + 1;
            } else if (vector[medio] > encontrar) {
                alto = medio - 1;
            } else {
                return medio;
            }
        }

        if (vector[bajo] == encontrar) {
            return bajo;
        } else {
            return -1;
        }
    }
}
