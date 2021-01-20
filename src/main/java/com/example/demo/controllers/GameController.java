package com.example.demo.controllers;

import java.util.Optional;

import com.example.demo.models.GameModel;
import com.example.demo.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/Game")
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Iterable<GameModel> listAll(){
        return this.gameService.listAll();
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public Optional<GameModel> findOne(@RequestParam(value = "id") Integer id){
        return this.gameService.findOne(id);
    }

    @PostMapping(value = "/save")
    public GameModel saveGame(@RequestBody GameModel game) {
        
        return this.gameService.save(game);
    }
    
    @PutMapping(value="/edit/{id}")
    public GameModel putMethodName(@PathVariable Integer id, @RequestBody GameModel game) {
        
        this.gameService.deleteById(id);   
        return this.gameService.save(game);
    }
    @DeleteMapping(value="/delete/{id}")
    public void deleteOne(@PathVariable Integer id){
        this.gameService.deleteById(id);
    }

    
}
