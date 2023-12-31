package com.crud.demo.servicio;

import com.crud.demo.entidad.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.demo.repositorio.EventoRepositorio;

import java.util.List;

@Service
public class EventoServicioImpl implements EventoServicio{

    @Autowired
    private EventoRepositorio repositorio;
    @Override
    public List<Evento> listarEventos(){
        return repositorio.findAll();
    }

    @Override
    public Evento guardarEvento(Evento evento) {
        return repositorio.save(evento);
    }

    @Override
    public Evento obtenerEventoPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Evento actualizarEvento(Evento evento) {
        return repositorio.save(evento);
    }

    @Override
    public void eliminarEvento(Long id) {
        repositorio.deleteById(id);
    }

}
