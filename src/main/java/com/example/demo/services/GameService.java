package com.example.demo.services;


import java.util.Optional;

import com.example.demo.models.GameModel;
import com.example.demo.reporsitories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public GameModel save(GameModel game) {
        return this.gameRepository.save(game);
    }

    public void deleteById(Integer id) {
        this.gameRepository.deleteById(id);
    }

    public Iterable<GameModel> listAll() {
        return this.gameRepository.findAll();
    }

    public Optional<GameModel> findOne(Integer id) {
        return this.gameRepository.findById(id);
    } 
}
