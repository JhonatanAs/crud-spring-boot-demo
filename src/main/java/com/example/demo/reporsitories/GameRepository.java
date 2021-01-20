package com.example.demo.reporsitories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.*;
public interface GameRepository extends CrudRepository<GameModel,Integer> {
    
}
