package org.example;
import java.util.ArrayList;

public class Venda {
    private String cliente;
    private ArrayList<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente, ArrayList<ItemVenda> itens, double valorDesconto) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorDesconto = valorDesconto;
        calcularValorVenda();
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    private void calcularValorVenda() {
        valorVenda = 0;
        for (ItemVenda item : itens) {
            valorVenda += item.getValorTotal();
        }
        valorVenda -= valorDesconto;
    }

    static class ItemVenda {
        private String descricao;
        private double valorUnitario;
        private double quantidade;

        public ItemVenda(String descricao, double valorUnitario, double quantidade) {
            this.descricao = descricao;
            this.valorUnitario = valorUnitario;
            this.quantidade = quantidade;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getValorUnitario() {
            return valorUnitario;
        }

        public double getQuantidade() {
            return quantidade;
        }

        public double getValorTotal() {
            return valorUnitario * quantidade;
        }
    }
}