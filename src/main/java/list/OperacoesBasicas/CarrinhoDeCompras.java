package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;
    private double precoTotalCompra;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public double getPrecoTotalCompra() {
        return precoTotalCompra;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
        this.calcularValorTotal();
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i :  itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double precoTotalItens = 0;
        for (Item i : itemList){
            precoTotalItens += i.getPreco() * i.getQtd();
        }
        this.precoTotalCompra = precoTotalItens;
    }

    public void exibirItens(){
        System.out.println("Carrinho de Compras");
        System.out.println("------------------------------------------");
        System.out.println(itemList.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Sapato", 200.00, 1);
        carrinhoDeCompras.adicionarItem("Meia", 20.00, 2);
        carrinhoDeCompras.adicionarItem("Calça", 100.00, 2);

        carrinhoDeCompras.exibirItens();

        System.out.println("Total da Compra: R$" + carrinhoDeCompras.getPrecoTotalCompra());
    }
}
