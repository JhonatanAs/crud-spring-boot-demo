package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class GameModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;

     private String name;
     private String description;
     private float qualification;

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public float getQualification(){
        return this.qualification;
    }

}
