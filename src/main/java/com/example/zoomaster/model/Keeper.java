package com.example.zoomaster.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.util.IdGenerator;

import java.io.Serializable;

public class Keeper implements Serializable {
    @Id @GeneratedValue
    int id;
    String name;
}
