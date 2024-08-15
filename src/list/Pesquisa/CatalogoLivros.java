package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrolist;

    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
       if (!livrolist.isEmpty()){
           for(Livro l : livrolist){
               if (l.getAutor().equalsIgnoreCase(autor)){
                   livrosPorAutor.add(l);
               }
           }
       }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo= l;
                    break;
                }

            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro1", "autor1",2020);
        catalogoLivros.adicionarLivro("livro1", "autor2",2021);
        catalogoLivros.adicionarLivro("livro2", "autor2",2022);
        catalogoLivros.adicionarLivro("livro3", "autor3",2023);
        catalogoLivros.adicionarLivro("livro4", "autor4",1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro1"));
    }
}
