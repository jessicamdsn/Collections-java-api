package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        List<Item> tarefasParaRemover = new ArrayList<>();
        for(Item t : carrinhoDeCompras){
            if (t.getNome().equalsIgnoreCase(nome)){
                tarefasParaRemover.add(t);
            }
        }
        carrinhoDeCompras.removeAll(tarefasParaRemover);
    }

    public int calcularValorTotal(){
        return carrinhoDeCompras.size();
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("tarefa 1", 3.5,5);
        carrinhoDeCompras.adicionarItem("tarefa 2",15,2);
        carrinhoDeCompras.adicionarItem("tarefa 3",2.99,5);

        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
