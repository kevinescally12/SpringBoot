package com.FIIS.peliculas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import com.FIIS.peliculas.dao.IActorRepository;
import com.FIIS.peliculas.entities.Actor;
import java.util.List;

@Service
public class ActorService implements IActorService {
    
    @Autowired
    private IActorRepository repo;
    
    @Override
    public List<Actor> findAll() {
        return (List<Actor>) repo.findAll();
    }
    
    @Override
    public List<Actor> findAllById(List<Long> ids) {
        return (List<Actor>) repo.findAllById(ids);
    }
}