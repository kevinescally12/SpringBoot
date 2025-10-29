package com.FIIS.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.FIIS.peliculas.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long>{
	
}
