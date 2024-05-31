package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_emprestimo")
public class ClasseEmprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int IDEmprestimo;
    private int dataEmprestimo;
    private int dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "usuario_ID")
    private ClasseUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "livro_ID")
    private ClasseLivro livro;

    public ClasseEmprestimo() {
    }

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
