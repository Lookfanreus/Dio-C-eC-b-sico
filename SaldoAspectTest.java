import static org.junit.jupiter.api.Assertions.*;
import org.aspectj.testing.Tester;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bancario.model.Conta;
import com.bancario.aspect.SaldoAspect;

public class SaldoAspectTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta("12345", 100.0);
    }

    @Test
    public void testSaqueComSaldoSuficiente() {
        double valorSaque = 50.0;
        conta.sacar(valorSaque);
        assertEquals(50.0, conta.getSaldo());
    }

    @Test
    public void testSaqueComSaldoInsuficiente() {
        double valorSaque = 150.0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(valorSaque);
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }

    @Test
    public void testAspectoVerificaSaldo() {
        // Simula a chamada do aspecto
        SaldoAspect aspecto = new SaldoAspect();
        assertTrue(aspecto.verificaSaldo(conta, 50.0));
        assertFalse(aspecto.verificaSaldo(conta, 150.0));
    }
}