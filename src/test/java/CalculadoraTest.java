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
        calc = new Calculadora(5);
    }

    @Test
    void somar() {
        System.out.println("Teste de soma!");

        int valor = -5;
        int resultadoEsperando = 0;
        calc.somar(valor);

        int resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
    }

    @Test
    void subtrair() {
        int valor = 10;
        int resultadoEsperando = -5;
        calc.subtrair(valor);

        int resultadoObtido = calc.getMemoria();

        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
    }

    @Test
    void exponenciar() {
    }

    @Test
    void zerarMemoria() {
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
