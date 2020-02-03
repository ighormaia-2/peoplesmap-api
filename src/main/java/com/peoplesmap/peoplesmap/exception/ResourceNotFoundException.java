package com.peoplesmap.peoplesmap.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.PersistenceException;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends PersistenceException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}