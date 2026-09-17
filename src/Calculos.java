
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
    if (x > y) {
        int temp = x;
        x = y;
        y = temp;
    }
    int suma = 0;
    for (int i = x; i <= y; i++)
        suma = suma + i;
    return suma;
}

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */

    float absoluto(float num) {
    float res = Math.abs(num);
    return res;
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
