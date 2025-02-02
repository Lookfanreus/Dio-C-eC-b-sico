import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bancario.model.Cliente;
import com.bancario.service.ClienteService;

class ClienteServiceTest {

    private ClienteService clienteService;

    @BeforeEach
    void setUp() {
        clienteService = new ClienteService();
    }

    @Test
    void testAdicionarCliente() {
        Cliente cliente = new Cliente("João Silva");
        clienteService.adicionarCliente(cliente);
        assertNotNull(clienteService.buscarCliente(cliente.getId()));
    }

    @Test
    void testBuscarCliente() {
        Cliente cliente = new Cliente("Maria Oliveira");
        clienteService.adicionarCliente(cliente);
        Cliente clienteBuscado = clienteService.buscarCliente(cliente.getId());
        assertEquals(cliente.getNome(), clienteBuscado.getNome());
    }

    @Test
    void testRemoverCliente() {
        Cliente cliente = new Cliente("Carlos Pereira");
        clienteService.adicionarCliente(cliente);
        clienteService.removerCliente(cliente.getId());
        assertNull(clienteService.buscarCliente(cliente.getId()));
    }
}