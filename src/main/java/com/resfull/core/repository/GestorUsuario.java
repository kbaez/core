package com.resfull.core.repository;

import com.resfull.core.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("gestorUsuario")
public class GestorUsuario extends JpaRepository<Usuario, Serializable> {

}
