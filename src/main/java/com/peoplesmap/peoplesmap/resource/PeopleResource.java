package com.peoplesmap.peoplesmap.resource;

import com.peoplesmap.peoplesmap.model.People;
import com.peoplesmap.peoplesmap.service.PeopleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/api/v1")
public class PeopleResource extends GenericResource {

    private final PeopleService service;

    public PeopleResource(PeopleService service) {
        this.service = service;
    }

    @GetMapping("/peoples")
    public List<People> getAll() {
        return service.getAll();
    }

    @GetMapping("/peoples/{id}")
    public ResponseEntity<People> getById(@PathVariable(name = "id") Long id) {
        return ok(service.getById(id));
    }

    @PostMapping("/peoples")
    public ResponseEntity<People> create(@Valid @RequestBody People people) {
        return created(getURI()).body(service.save(people));
    }

    @PutMapping("/peoples/{id}")
    public ResponseEntity<People> update(@PathVariable(name = "id") Long id, @Valid @RequestBody People people) {
        return ok(service.save(people));
    }

    @DeleteMapping("/peoples/{id}")
    public ResponseEntity<People> delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return noContent().build();
    }

}
