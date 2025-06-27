package com.bestiary.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestiary.api.model.Creature;
import com.bestiary.api.repository.CreatureRepository;

@RestController
@RequestMapping("/creatures")
public class CreatureController {

    private final CreatureRepository repo;

    public CreatureController(CreatureRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Creature> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Creature getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Creature create(@RequestBody Creature creature) {
        return repo.save(creature);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Creature> update(@PathVariable Long id, @RequestBody Creature updatedData) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setName(updatedData.getName());
                    existing.setOrigin(updatedData.getOrigin());
                    existing.setDescription(updatedData.getDescription());
                    existing.setDangerLevel(updatedData.getDangerLevel());
                    return ResponseEntity.ok(repo.save(existing));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return repo.findById(id)
                .map(creature -> {
                    repo.delete(creature);
                    return ResponseEntity.noContent().build(); // 204
                })
                .orElseGet(() -> ResponseEntity.notFound().build()); // 404
    }

}
