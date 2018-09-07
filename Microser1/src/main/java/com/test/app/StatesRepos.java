package com.test.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepos extends JpaRepository<States, Integer> {

}
