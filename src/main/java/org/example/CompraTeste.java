package org.example;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraTeste {

    @Test
    public void testeCalcularValorVendaComItens() {
        ItemVenda item1 = new ItemVenda("Produto1", 25.0, 2);
        ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3);

        ArrayList<ItemVenda> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        Venda venda = new Venda("Cliente1", itens, 5.0);

        assertEquals(115.0, venda.getValorVenda(), 0.01);
    }

    @Test
    public void testeCalcularValorVendaSemItens() {
        ArrayList<ItemVenda> itens = new ArrayList<>();

        Venda venda = new Venda("Cliente2", itens, 0.0);

        assertEquals(0.0, venda.getValorVenda(), 0.01);
    }

    @Test
    public void testeGetItens() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2);
        ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3);

        ArrayList<ItemVenda> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        Venda venda = new Venda("Cliente3", itens, 0.0);

        assertEquals(itens, venda.getItens());
    }
}
