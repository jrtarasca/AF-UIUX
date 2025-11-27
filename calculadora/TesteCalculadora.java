/**
 * <p>
 * <strong>Classe de Teste da Calculadora</strong>
 * </p>
 *
 * <p>
 * Esta classe executa testes simples utilizando a classe {@code Calculadora},
 * demonstrando o funcionamento dos métodos de operações matemáticas e o
 * tratamento
 * de exceções para casos inválidos.
 * </p>
 *
 * <p>
 * Os testes realizados incluem:
 * </p>
 * <ul>
 * <li>Operações válidas: soma, subtração, multiplicação e divisão</li>
 * <li>Tratamento de divisão por zero</li>
 * <li>Tratamento de operador inválido</li>
 * </ul>
 *
 * <p>
 * O objetivo desta classe é validar o comportamento da calculadora e garantir
 * que exceções sejam lançadas corretamente quando necessário.
 * </p>
 *
 * @author José Roberto Tarasca Junior
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>
     * Método principal que executa os testes da classe {@code Calculadora}.
     * </p>
     *
     * @param args argumentos de linha de comando 
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
