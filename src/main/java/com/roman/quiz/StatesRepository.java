package com.roman.quiz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StatesRepository extends JpaRepository<States, Integer> {
    States getStateById(int id);
}
