import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bancario.model.Conta;

class ContaTest {
    private Conta conta;

    @BeforeEach
    void setUp() {
        conta = new Conta("12345", 1000.0);
    }

    @Test
    void testDeposito() {
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void testSaqueComSaldoSuficiente() {
        boolean resultado = conta.sacar(300.0);
        assertTrue(resultado);
        assertEquals(700.0, conta.getSaldo());
    }

    @Test
    void testSaqueComSaldoInsuficiente() {
        boolean resultado = conta.sacar(1200.0);
        assertFalse(resultado);
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    void testGetNumeroConta() {
        assertEquals("12345", conta.getNumeroConta());
    }

    @Test
    void testGetSaldo() {
        assertEquals(1000.0, conta.getSaldo());
    }
}