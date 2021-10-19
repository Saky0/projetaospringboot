package com.example.projetaospringboot.repository;

import com.example.projetaospringboot.model.Evento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String>{


    
}
