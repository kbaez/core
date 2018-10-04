package com.resfull.core.service;

import com.resfull.core.converter.Convertidor;
import com.resfull.core.entity.Nota;
import com.resfull.core.model.MNota;
import com.resfull.core.repository.NotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("servicio")
public class NotaService {
    @Autowired
    @Qualifier("repositorio")
    private NotaRepositorio repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(Nota nota){
        try{
            repositorio.save(nota);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Nota nota){
        try{
            if(nota.getId() == 0){
                repositorio.save(nota);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean borrar(String nombre, long id){
        try{
            Nota nota = repositorio.findByNombreAndId(nombre,id);
            repositorio.delete(nota);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<MNota> obtener(){
        return convertidor.convertirLista(repositorio.findAll());
    }
}
