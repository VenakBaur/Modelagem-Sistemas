package com.emprestimo.emprestimolivro.repository;

import com.emprestimo.emprestimolivro.ClasseUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<ClasseUsuario, int> {
}
