package com.petsore.azure;
import com.petsore.azure.domain.Articulo;
import com.petsore.azure.repo.ArticuloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiPetstoreApplication {

    @Autowired
    private ArticuloRepo repo;

    @PostMapping("/addarticulo")
    public Articulo agregarArticulo(@RequestBody Articulo articulo){
        return repo.save(articulo);
    }

    @GetMapping("/articulos")
    public List<Articulo> getArticulos(){
        return repo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiPetstoreApplication.class, args);
    }

}