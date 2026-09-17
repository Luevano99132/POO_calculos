
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
        throw new UnsupportedOperationException("En construcción.");
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
    if (texto == null) return null;
    String[] palabras = texto.split(" ", -1);
    String resultado = "";
    for (int i = 0; i < palabras.length; i++) {
        String p = palabras[i];
        String invertida = "";
        for (int j = p.length() - 1; j >= 0; j--)
            invertida += p.charAt(j);
        resultado += invertida;
        if (i < palabras.length - 1) resultado += " ";
    }
    return resultado;
}

}
