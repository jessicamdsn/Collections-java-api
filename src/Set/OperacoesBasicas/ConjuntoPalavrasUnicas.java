package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        String palavraParaRemover = "";
        for (String p : palavrasSet){
            if (Objects.equals(p, palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        boolean palavraExiste = false;
        for (String p : palavrasSet){
            if (Objects.equals(p, palavra)){
                palavraExiste = true;
            }
        }
        return palavraExiste;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cp = new ConjuntoPalavrasUnicas();
        cp.adicionarPalavra("carro");
        cp.adicionarPalavra("festa");
        cp.adicionarPalavra("animal");
        cp.adicionarPalavra("rosa");

        cp.exibirPalavrasUnicas();
        System.out.println(cp.verificarPalavra("rosa"));
        cp.removerPalavra("festa");
        cp.exibirPalavrasUnicas();
    }
}
