package com.FIIS.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.FIIS.peliculas.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {
}