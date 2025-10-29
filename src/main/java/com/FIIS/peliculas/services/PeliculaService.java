package com.FIIS.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.FIIS.peliculas.dao.IPeliculaRepository;
import com.FIIS.peliculas.entities.Pelicula;

@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private IPeliculaRepository repo;

    @Override
    public void save(Pelicula pelicula) {
        repo.save(pelicula);
    }

    @Override
    public Pelicula findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public Page<Pelicula> findAll(Pageable pegable) {
    	return repo.findAll(pegable);
    }
}