package com.petsore.azure.services;

import com.petsore.azure.domain.Articulo;
import com.petsore.azure.repo.ArticuloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticuloService {
    @Autowired
    ArticuloRepo repo;

    public void insertarArticulo(Articulo articulo){
        repo.save(articulo);
    }

    public List<Articulo> listar(){
        return repo.findAll();
    }
}
