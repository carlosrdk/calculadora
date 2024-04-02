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
    
    // Teste scriptado por: João Vitorino.
    @Test
    void dividir() throws Exception {
        int valor = 5;
        int resultadoEsperando = 1;
        calc.dividir(valor);
        
        int resultadoObtido = calc.getMemoria();
        Assertions.assertEquals(resultadoEsperando, resultadoObtido);
    }

    // Teste scriptado por: João Vitorino.
    @Test
    void dividirPorZero() throws Exception {
        int valor = 5;
        double resultadoEsperando = 1;
        calc.dividir(valor);

        int resultadoObtido = calc.getMemoria();
        Assertions.assertThrows(Exception.class, ()->{ calc.dividir(0); }, "Não foi retornada a Exception esperada.\nClasse: Calculadora"); 
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
