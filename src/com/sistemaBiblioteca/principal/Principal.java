package com.sistemaBiblioteca.principal;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Ums pitada de sorte", "GBaldassari","9132339432","NaCi");
        Livro livro2 = new Livro("Mrs Dalloway","Virginia Woolf", "913220100806","Penguim");

        biblioteca.cadastrarLivros(livro1);
        biblioteca.cadastrarLivros(livro2);

        System.out.println("Livros Cadastrados:\n");
        biblioteca.listarLivros();
    }
}
