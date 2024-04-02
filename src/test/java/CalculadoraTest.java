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

    // Teste scriptado por: João Vitorino.
    @Test
    void dividirPorZero() {
        Assertions.assertThrows(Exception.class, ()->{ calc.dividir(0); }, "Não foi retornada a Exception esperada.\nClasse: Calculadora"); 
    }

    // Teste scriptado por: João Vitorino.
    @Test
    void dividir() throws Exception {
        calc.dividir(2);
        double resultadoEsperando = 1.5;
        
        int resultadoObtido = calc.getMemoria();
        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
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
}
