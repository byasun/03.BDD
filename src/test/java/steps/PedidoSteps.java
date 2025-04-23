package steps;

import com.hamburgueria.Pedido;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class PedidoSteps {
    private Pedido pedido;
    private String resposta;

    @Dado("que o cardápio está carregado")
    public void que_o_cardapio_esta_carregado() {
        pedido = new Pedido();
    }

    @Quando("o cliente pedir o hambúrguer {string}")
    public void o_cliente_pedir_o_hamburguer(String nome) {
        resposta = pedido.realizarPedido(nome);
    }

    @Então("o sistema deve confirmar o pedido de {string}")
    public void o_sistema_deve_confirmar_o_pedido(String nome) {
        assertEquals("Pedido confirmado: " + nome, resposta);
    }

    @Então("o sistema deve informar que o hambúrguer não está disponível")
    public void o_sistema_deve_informar_que_o_hamburguer_nao_esta_disponivel() {
        assertTrue(resposta.contains("não está disponível"));
    }
}
