package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 *
 * @author Isabelle
 * @version 1.0
 */
public class Calculadora {

    /** Armazena o resultado da operação. */
    private int r;

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operador matemático
     * @return resultado da operação
     */
    public int calc(int a, int b, String op) {

        switch (op) {
            case "+":
                r = a + b;
                break;

            case "-":
                r = a - b;
                break;

            case "*":
                r = a * b;
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Erro: divisao por zero.");
                    r = 0;
                } else {
                    r = a / b;
                }
                break;

            default:
                System.out.println("Erro: operacao invalida.");
                r = 0;
        }

        return r;
    }
}
