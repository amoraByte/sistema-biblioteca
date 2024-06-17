package com.sistemaBiblioteca.principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
    }
    public void cadastrarLivros(Livro livro) {
        livros.add(livro);
        //System.out.println("Livro cadastrado.");
    }
    public void listarLivros() {
        if(livros.isEmpty()){
            System.out.println("nenhum livro cadastrado.");
        }
        else{
            livros.sort(new Comparator<Livro>() {
                @Override
                public int compare(Livro o1, Livro o2) {
                    return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
                }
            });

            for(Livro livro : livros){
                System.out.println(livro);
            }
        }
    }
}
