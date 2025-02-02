import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bancario.model.Conta;
import com.bancario.service.ContaService;

class ContaServiceTest {

    private ContaService contaService;
    private Conta conta;

    @BeforeEach
    void setUp() {
        contaService = new ContaService();
        conta = new Conta("12345", 1000.0);
    }

    @Test
    void testDeposito() {
        contaService.depositar(conta, 500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void testSaqueComSaldoSuficiente() {
        boolean resultado = contaService.sacar(conta, 500.0);
        assertTrue(resultado);
        assertEquals(500.0, conta.getSaldo());
    }

    @Test
    void testSaqueComSaldoInsuficiente() {
        boolean resultado = contaService.sacar(conta, 1500.0);
        assertFalse(resultado);
        assertEquals(1000.0, conta.getSaldo());
    }
}