package com.peoplesmap.peoplesmap.service;

import com.peoplesmap.peoplesmap.exception.ResourceNotFoundException;
import com.peoplesmap.peoplesmap.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    private final JpaRepository<People, Long> repository;

    public PeopleService(JpaRepository<People, Long> repository) {
        this.repository = repository;
    }

    public List<People> getAll() {
        return repository.findAll();
    }

    public People getById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }

    public People save(People user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.delete(getById(id));
    }

}
