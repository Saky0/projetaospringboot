package com.example.projetaospringboot.controller;

import com.example.projetaospringboot.model.Evento;
import com.example.projetaospringboot.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {
    
    @Autowired
    private EventoRepository repo;

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form() {
        return "evento/formEvento";
    }

    // Requisição Para salvar no BD
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento) {

        repo.save(evento);
        
        return "redirect:/cadastrarEvento";
    }

    @RequestMapping("/eventos")
    public ModelAndView listaEventos() {
        
        ModelAndView mv = new ModelAndView("index");

        Iterable<Evento> eventos = repo.findAll();

        /*
            1. A primeira palavra é nome do objeto especificado na View ${eventos}, no qual vai ser renderizado
            2. A lista de Objetos Iterator
        */
        mv.addObject("eventos", eventos);

        return mv;
    }


}
