
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
    if (texto == null) return 0;
    int cont = 0;
    for (int i = 0; i < texto.length(); i++) {
        char c = Character.toLowerCase(texto.charAt(i));
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            cont++;
    }
    return cont;
}
    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        throw new UnsupportedOperationException("En construcción.");
    }

}
