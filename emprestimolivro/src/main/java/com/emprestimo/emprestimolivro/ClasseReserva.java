package com.emprestimo.emprestimolivro;

import jakarta.persistence.*;

//Annotation usando JPA para criar a tabela do banco de dados
@Entity
@Table(name = "tabela_reserva")
public class ClasseReserva {

    //Annotation para gerar ID na tabela do banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int IDReserva;
    private int dataReserva;

    //Annotation para receber uma FK
    @ManyToOne
    @JoinColumn(name = "ID_Usuario")
    private ClasseUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_Livro")
    private ClasseLivro livro;

    public ClasseReserva(int IDReserva, int dataReserva) {

        this.IDReserva = IDReserva;
        this.dataReserva = dataReserva;

    }

    //Construtor da classe
    public ClasseReserva() {
    }

    //Getters e setters
    public int getIDReserva() {
        return IDReserva;
    }

    public void setIDReserva(int IDReserva) {
        this.IDReserva = IDReserva;
    }

    public int getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(int dataReserva) {
        this.dataReserva = dataReserva;
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
