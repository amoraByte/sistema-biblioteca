package com.sistemaBiblioteca.principal;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Livro> livros;

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
            for(Livro livro : livros){
                System.out.println(livro);
            }
        }
    }
}
