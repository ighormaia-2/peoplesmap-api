package com.peoplesmap.peoplesmap.repository;

import com.peoplesmap.peoplesmap.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {}
