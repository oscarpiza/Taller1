public class CountingSort {

	public static int[] CountingSort(int[] Arreglo_Inicial) {
		int[] Arreglo_Final = new int[Arreglo_Inicial.length];
		int Maximo = 0, Tamano = Arreglo_Inicial.length, Index = 0;
		for (int i = 0; i < Tamano; i++)
			Maximo = Arreglo_Inicial[i] > Maximo ? Arreglo_Inicial[i] : Maximo; // Calcular
																				// maximo.
		int[] Aux = new int[Maximo + 1]; // Para solucionar el inicio en 0 , se
											// suma 1 al tamaño.
		for (int i = 0; i < Tamano; i++)
			Aux[Arreglo_Inicial[i]] += 1; // Llenar el auxiliar
		for (int i = 0; i <= Maximo; i++)
			for (int j = 0; j < Aux[i]; j++, Index++)
				Arreglo_Final[Index] = i;
		return Arreglo_Final;
	}
}
