package com.jarek.demodocker;

import com.jarek.demodocker.model.Fruit;
import com.jarek.demodocker.service.FruitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDockerApplicationTests {

    @Autowired
    private FruitRepository fruitRepository;

    @Test
    public void testGetAll(){
        assertTrue(fruitRepository.findAll().spliterator().getExactSizeIfKnown() ==3);
    }

    @Test
    public void getOne(){
        assertTrue(fruitRepository.findById(1).orElse(null)!= null);
    }

    @Test
    public void updateAFruit(){
        Fruit apple = fruitRepository.findById(2).orElse(null);
        assertTrue(apple != null);
        assertTrue(apple.getName().equals("Apple"));

        apple.setName("Green Apple");
        fruitRepository.save(apple);

        assertTrue(fruitRepository.findById(2).orElse(null).getName().equals("Green Apple"));
    }


    @Ignore
    public void contextLoads() {
    }

}
