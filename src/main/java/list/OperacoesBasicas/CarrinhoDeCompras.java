package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItens.add(i);
            }
        }
        itemList.removeAll(removerItens);
    }

    public double calcularValorTotal(){
        double result = 0;
        if (!itemList.isEmpty()){
            for (Item item : itemList){
                result += item.getPreco() * item.getQuantidade();
            }
        }
        return result;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Celular", 1200.90, 2);
        carrinho.adicionarItem("Celular", 1900.20, 1);
        carrinho.adicionarItem("Mesa", 800.10, 3);

        carrinho.removerItem("Mesa");

        carrinho.exibirItens();
        System.out.println("O valor total da compra é de: " + carrinho.calcularValorTotal());
    }
}
