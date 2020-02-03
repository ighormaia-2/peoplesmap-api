package com.peoplesmap.peoplesmap.resource;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class GenericResource {

    protected URI getURI() {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .buildAndExpand()
                .toUri();
    }

}
