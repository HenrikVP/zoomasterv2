package com.example.zoomaster.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Creature implements Serializable {
    @Id @GeneratedValue
    int id;
    String name;
    String race;
    Keeper keeper;
    Cage cage;
}
