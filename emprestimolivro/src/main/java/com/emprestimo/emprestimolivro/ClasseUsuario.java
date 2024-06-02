package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_usuario")
public class ClasseUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int IDUsuario;
    private String StatusUsuario;

    public ClasseUsuario() {
    }

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