package com.petsore.azure.repo;
import com.petsore.azure.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepo extends JpaRepository<Articulo, Integer> {
    //
}
