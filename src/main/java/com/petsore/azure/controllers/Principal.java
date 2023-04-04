package com.petsore.azure.controllers;
import com.petsore.azure.domain.Articulo;
import com.petsore.azure.services.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class Principal {
    /*@Autowired
    ArticuloService service;

    @RequestMapping("/")
    public String listarArticulos(Model model){
        model.addAttribute("articulos", service.listar());
        return "lista de articulos";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarArticulo(Articulo articulo, BindingResult result, Model model){
        service.insertarArticulo(articulo);
        return "index";
    }*/
}