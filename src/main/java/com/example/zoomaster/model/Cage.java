package com.example.zoomaster.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Cage implements Serializable {
    @Id
    @GeneratedValue
    int id;
    String name;
}
