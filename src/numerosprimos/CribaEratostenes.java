/**
 * Clase para generar todos los números primos desde 2 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * El algoritmo es bastante simple: Dado un array de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;

public class CribaEratostenes {

    /**
     * Generar números primos de 2 a numeroMaximo
     *
     * @param numeroMaximo es el valor máximo
     * @return Array de números primos
     */
    public static int[] generarPrimos(int numeroMaximo) {

        if (numeroMaximo < 2) {
            return new int[0]; // Devuelve array vacío
        } else {

            int dimensionArray = numeroMaximo + 1; // +1 porque en java los arrays empiezan en 0
            boolean[] numeros = new boolean[dimensionArray];

            for (int i = 0; i < dimensionArray; i++) { // Inicializamos todos los números del array
                numeros[i] = true;
            }

            numeros[0] = numeros[1] = false; // Eliminamos el 0 y el 1, que no son primos

            // Empezamos a cribar por el primer número primo que es i = 2
            // Repetimos hasta que i > raiz cuadrada de la dimension del array
            for (int i = 2; i <= Math.sqrt(dimensionArray); i++) {
                if (numeros[i]) {
                    // Eliminamos los múltiplos de i
                    for (int j = 2 * i; j < dimensionArray; j += i) {
                        numeros[j] = false;
                    }
                }
            }

            // Los números restantes son los primos, creamos un array a su medida para guardarlos
            int cantidadPrimos = 0;
            for (int i = 0; i < dimensionArray; i++) {
                if (numeros[i]) {
                    cantidadPrimos++;
                }
            }
            int[] numerosPrimos = new int[cantidadPrimos];

            // Rellenamos el array con los números primos
            for (int i = 0, j = 0; i < dimensionArray; i++) {
                if (numeros[i]) {
                    numerosPrimos[j++] = i;
                }
            }
            return numerosPrimos;
        }
    }
}
