package com.jarek.demodocker.service;

import com.jarek.demodocker.model.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends CrudRepository<Fruit, Integer> {
}
