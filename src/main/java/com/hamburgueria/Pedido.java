package com.hamburgueria;

import java.util.Arrays;
import java.util.List;

public class Pedido {
    private final List<String> cardapio = Arrays.asList(
        "Cheddar Bacon", "X-Salada", "X-Burguer", "Veggie"
    );

    public boolean itemDisponivel(String nome) {
        return cardapio.contains(nome);
    }

    public String realizarPedido(String nome) {
        if (itemDisponivel(nome)) {
            return "Pedido confirmado: " + nome;
        } else {
            return "Desculpe, o hambúrguer " + nome + " não está disponível";
        }
    }
}
