package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogaLivros {
    private List<Livro> livroList;

    public CatalogaLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List <Livro> pesquisaPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List <Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List <Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
    return livrosPorIntervaloAnos;    
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo))
                    livroPorTitulo = l;
                    break;
            }
        }
                
    return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogaLivros catalogaLivros = new CatalogaLivros();

        catalogaLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogaLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogaLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogaLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogaLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogaLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogaLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogaLivros.pesquisarPorTitulo("Livro 1"));

    }
}
    

