import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.bancario.model.Cliente;
import com.bancario.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ClienteTest {

    private Cliente cliente;
    private Conta conta;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("João Silva");
        conta = new Conta("12345", 1000.0);
        List<Conta> contas = new ArrayList<>();
        contas.add(conta);
        cliente.setContas(contas);
    }

    @Test
    public void testGetNome() {
        assertEquals("João Silva", cliente.getNome());
    }

    @Test
    public void testGetContas() {
        assertNotNull(cliente.getContas());
        assertEquals(1, cliente.getContas().size());
        assertEquals(conta, cliente.getContas().get(0));
    }

    @Test
    public void testAdicionarConta() {
        Conta novaConta = new Conta("67890", 500.0);
        cliente.adicionarConta(novaConta);
        assertEquals(2, cliente.getContas().size());
        assertEquals(novaConta, cliente.getContas().get(1));
    }
}