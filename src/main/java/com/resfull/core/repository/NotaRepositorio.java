package com.resfull.core.repository;

import com.resfull.core.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repositorio")
public interface NotaRepositorio extends JpaRepository<Nota, Serializable> {
    public abstract Nota findByNombre(String nombre);
    public abstract List<Nota> findByTitulo(String titulo);
    public abstract Nota findByNombreAndId(String nombre, long id);
}
