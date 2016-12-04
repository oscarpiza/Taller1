
public class ShellSort 
{
	 public int[] shell(int[] numeros) 
	 {
	       
	        int incremento = numeros.length/2;
	        
	        do {
	        	
	            incremento = incremento / 2;

	            for (int k = 0; k < incremento; k++) {
	                for (int i = incremento + k; i < numeros.length; i += incremento) {
	                    int j = i;
	                    while (j - incremento >= 0 && numeros[j] < numeros[j - incremento]) {
	                        int tmp = numeros[j];
	                        numeros[j] = numeros[j - incremento];
	                        numeros[j - incremento] = tmp;
	                        j -= incremento;
	                    }
	                }
	            }
	            
	        } while (incremento > 1);
	        
	        return numeros;
	  }
}
