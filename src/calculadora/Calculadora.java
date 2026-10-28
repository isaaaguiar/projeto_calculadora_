
package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 *
 * @author Isabelle
 */
public class Calculadora {
    /**
     * Cria uma nova calculadora.
     */
    public Calculadora() {
    }

    /** Armazena o resultado da operação. */
    private int r;

    /**
     * Calcula o resultado de acordo com o operador informado.
     *
     * @param a primeiro número inteiro
     * @param b segundo número inteiro
     * @param op operador matemático (+, -, *, /)
     * @return resultado da operação ou zero se a operação for inválida
     */
    public int calc(int a, int b, String op) {
        if (op == null) {
            System.out.println("Erro: operacao invalida.");
            r = 0;
            return r;
        }

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
                r = dividir(a, b);
                break;
            default:
                System.out.println("Erro: operacao invalida.");
                r = 0;
        }

        return r;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão ou zero quando o divisor é zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisao por zero.");
            return 0;
        }

        return a / b;
    }
}
