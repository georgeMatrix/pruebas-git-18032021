package com.formatoweb.pruebasgit18032021.repository;

import com.formatoweb.pruebasgit18032021.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
