package com.FIIS.peliculas.services;

import com.FIIS.peliculas.entities.Pelicula;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPeliculaService {
    public void save(Pelicula pelicula);
    public Pelicula findById(Long id);
    public List<Pelicula> findAll();
    public Page<Pelicula> findAll(Pageable pegable);
    public void delete(Long id);
}