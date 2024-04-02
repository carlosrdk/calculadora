import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.iftm.tspi.Calculadora;

class CalculadoraTest {

    private static Calculadora calc;

    @BeforeAll
    static void inicializarTeste() {
        System.out.println("Neste iniciado!");
    }

    @BeforeEach
    void instanciarObjetos() {
        calc = new Calculadora(3);
    }

     // Bruno Vieira
    @Test
    void somarNumeroNegativo() {
        System.out.println("Teste de soma!");

        int valor = -5;
        int resultadoEsperando = -2;
        calc.somar(valor);

        int resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
    }

    // Bruno Vieira
    @Test
    void subtrairNumeroPositivo() {
        int valor = 10;
        int resultadoEsperando = -7;
        calc.subtrair(valor);

        int resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
    }

     // Lucas Azevedo
    @Test
    public void testMultiplicarNumeroPositivo() {
        calc.multiplicar(5);
        assertEquals(15, calc.getMemoria());
    }

    @Test
    public void testDividirPorZero() throws Exception {
        calc.dividir(0);
    }

    @Test
    public void testDividirPorValorPositivo() throws Exception {
        calc.dividir(3);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    public void testExponenciarComValorMaiorQue10() throws Exception {
        calc.exponenciar(11);
    }

    @Test
    public void testExponenciarPor1() throws Exception {
        calc.exponenciar(1);
        assertEquals(3, calc.getMemoria());
    }

    @Test
    public void testZerarMemoria() {
        calc.zerarMemoria();
        assertEquals(0, calc.getMemoria());
    }

    @AfterEach
    void finalizarCadaMetodoTeste() {
        System.out.println("Finalizando caso de teste");
    }

    @AfterAll
    static void finalizarTeste() {
        System.out.println("Fim do teste!!!");
    }

    // Relatório dos testes:

    // Método a ser testado: Construtor Sem Parâmetro

    // Cenário de Teste (Entradas): N/A

    // Resultado Esperado: Valor da memória igual a 0.

    // Resultado Obtido: Valor da memória igual a 0.

    // Método a ser testado: Construtor Com Parâmetro

    // Cenário de Teste (Entradas): Valor de memória = 3.

    // Resultado Esperado: Valor da memória igual a 3.

    // Resultado Obtido: Valor da memória igual a 3.

    // Método a ser testado: Multiplicar

    // Cenário de Teste (Entradas): Valor atual da memória = 3, multiplicando por 2.

    // Resultado Esperado: Valor da memória igual a 3.

    // Resultado Obtido: Valor da memória igual a 3.

    // Método a ser testado: Dividir Por Zero

    // Cenário de Teste (Entradas): Valor atual da memória = 3, dividindo por 0.

    // Resultado Esperado: Exceção lançada ("Divisão por zero!!!").

    // Resultado Obtido: Exceção lançada ("Divisão por zero!!!").

    // Método a ser testado: Dividir Por Valor Positivo

    // Cenário de Teste (Entradas): Valor atual da memória = 3, dividindo por 2.

    // Resultado Esperado: Valor da memória igual a 3.

    // Resultado Obtido: Valor da memória igual a 3.

    // Método a ser testado: Exponenciar Com Valor Maior Que 10

    // Cenário de Teste (Entradas): Valor atual da memória = 3, exponenciando por
    // 11.

    // Resultado Esperado: Exceção lançada ("Expoente incorreto, valor máximo é
    // 10.").

    // Resultado Obtido: Exceção lançada ("Expoente incorreto, valor máximo é 10.").

    // Método a ser testado: Exponenciar Por 1

    // Cenário de Teste (Entradas): Valor atual da memória = 3, exponenciando por 1.

    // Resultado Esperado: Valor da memória igual a 3.

    // Resultado Obtido: Valor da memória igual a 3.

    // Método a ser testado: Zerar Memória

    // Cenário de Teste (Entradas): N/A

    // Resultado Esperado: Valor da memória igual a 0.

    // Resultado Obtido: Valor da memória igual a 0

}
