package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "listaNumeros= {" + listaNumeros +
                '}';
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (int n : listaNumeros) {
                soma += n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (int n : listaNumeros) {
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (int n : listaNumeros) {
                if (n < menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }
    public List<Integer> exibirNumeros(){
        return listaNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println( somaNumeros.encontrarMaiorNumero());
        System.out.println( somaNumeros.encontrarMenorNumero());

    }
}
