package com.roman.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class QuizService {
    @Autowired
    private StatesRepository statesRepository;
    private States states;

    @GetMapping("/states/{id}")
    public States getStateById(@PathVariable int id){
        states = statesRepository.getStateById(id);
        return states;
    }

    public String getRegion(int id){
        getStateById(id);
        return states.getRegion();
    }
}