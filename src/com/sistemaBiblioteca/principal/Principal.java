package com.sistemaBiblioteca.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Scanner leitura = new Scanner(System.in);
        String escolha;
        do {
            System.out.println("Titulo do livro: ");
            String titulo = leitura.nextLine();
            System.out.println("Autor(a) do livro: ");
            String autor = leitura.nextLine();
            System.out.println("Editora: ");
            String editora = leitura.nextLine();
            System.out.println("Isbn: ");
            String isbn = leitura.nextLine();

            Livro livro = new Livro(titulo, autor, editora, isbn);
            biblioteca.cadastrarLivros(livro);

            System.out.println("Deseja cadastrar mais algum livro? (y or n)");
            escolha = leitura.nextLine();
        } //fim do do-while
        while (escolha.equalsIgnoreCase("y"));

        System.out.println("Livros Cadastrados:\n");
        biblioteca.listarLivros();

    }
}
