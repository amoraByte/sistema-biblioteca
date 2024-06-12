package com.sistemaBiblioteca.principal;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editora;

    public Livro(String titulo, String autor, String isbn, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nEditora: " + editora + "\n";
    }
}
