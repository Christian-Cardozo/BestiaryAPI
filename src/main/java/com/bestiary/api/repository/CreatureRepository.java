package com.bestiary.api.repository;

import com.bestiary.api.model.Creature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatureRepository extends JpaRepository<Creature, Long>{
    
}
