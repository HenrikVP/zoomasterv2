package com.example.zoomaster.repository;

import com.example.zoomaster.model.Creature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatureRepository extends JpaRepository<Creature, Integer> {}