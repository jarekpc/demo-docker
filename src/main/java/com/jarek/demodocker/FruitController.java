package com.jarek.demodocker;

import com.jarek.demodocker.model.Fruit;
import com.jarek.demodocker.service.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("fruit")
public class FruitController {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @GetMapping("/all")
    public List<Fruit> getAll(){
        return StreamSupport.stream(fruitRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
