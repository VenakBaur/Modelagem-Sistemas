package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

//Annotation usando JPA para criar a tabela do banco de dados
@Entity
@Table(name = "tabela_emprestimo")
public class ClasseEmprestimo {

    //Annotation para gerar ID na tabela do banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atributos
    private int IDEmprestimo;
    private int dataEmprestimo;
    private int dataDevolucao;

    //Annotation para receber uma FK
    @ManyToOne
    @JoinColumn(name = "usuario_ID")
    private ClasseUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "livro_ID")
    private ClasseLivro livro;

    public ClasseEmprestimo(int IDEmprestimo, int dataEmprestimo, int dataDevolucao) {

        this.IDEmprestimo = IDEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;

    }

    //Construtor da classe
    public ClasseEmprestimo() {
    }

    //Getters e setters
    public int getIDEmprestimo() {
        return IDEmprestimo;
    }

    public void setIDEmprestimo(int IDEmprestimo) {
        this.IDEmprestimo = IDEmprestimo;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ClasseUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(ClasseUsuario usuario) {
        this.usuario = usuario;
    }

    public ClasseLivro getLivro() {
        return livro;
    }

    public void setLivro(ClasseLivro livro) {
        this.livro = livro;
    }
}
