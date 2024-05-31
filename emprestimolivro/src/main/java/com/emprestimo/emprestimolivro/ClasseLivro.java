package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_livro")
public class ClasseLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int IDLivro;
    private String Nome;
    private String Titulo;
    private String Autor;
    private String Editora;
    private String Status;
    private String Edicao;

    public ClasseLivro() {
    }

    public int getIDLivro() {
        return IDLivro;
    }

    public void setIDLivro(int IDLivro) {
        this.IDLivro = IDLivro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String edicao) {
        Edicao = edicao;
    }
}
