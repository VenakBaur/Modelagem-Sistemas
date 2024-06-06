package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

//Annotation usando JPA para criar a tabela do banco de dados
@Entity
@Table(name = "tabela_usuario")
public class ClasseUsuario {

    //Annotation para gerar ID na tabela do banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int IDUsuario;
    private String StatusUsuario;

    public ClasseUsuario( int IDUsuario, String StatusUsuario) {

        this.IDUsuario = IDUsuario;
        this.StatusUsuario = StatusUsuario;

    }

    //Construtor da classe
    public ClasseUsuario() {
    }

    //Getters e Setters
    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getStatusUsuario() {
        return StatusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        StatusUsuario = statusUsuario;
    }
}