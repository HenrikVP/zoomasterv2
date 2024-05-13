package com.example.zoomaster.controller;

import com.example.zoomaster.model.Creature;
import com.example.zoomaster.repository.CreatureRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creature")
public class CreatureController {

    CreatureRepository repository;

    CreatureController(CreatureRepository creatureRepository) {
        this.repository = creatureRepository;
    }

    //TODO jsonbackreference for recursion
    @GetMapping()
    List<Creature> getAllCreatures() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Creature read(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping()
    void create(@RequestBody Creature creature) {
        repository.save(creature);
    }

    @PutMapping()
    void update(@RequestBody Creature creature) {
        repository.save(creature);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}