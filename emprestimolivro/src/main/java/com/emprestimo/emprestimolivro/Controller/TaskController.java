package com.emprestimo.emprestimolivro.Controller;

import com.emprestimo.emprestimolivro.ClasseEmprestimo;
import com.emprestimo.emprestimolivro.ClasseUsuario;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @GetMapping("/Create")
    public String Homepage() {

        return "Homepage";

    }

    @PostMapping("/Create")
    public void create(ClasseUsuario ClasseUsuario) {

        System.out.println("Insira o ID Usuario" + ClasseUsuario.getIDUsuario());

    }

}
