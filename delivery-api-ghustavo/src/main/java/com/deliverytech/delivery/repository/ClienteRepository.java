package com.deliverytech.repository;

import com.deliverytech.model.Cliente;
import org.springframework.data.jpa.repository.JpaReposotory;

import java.util.Optional

public interface UsuarioRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findby(String email);
}