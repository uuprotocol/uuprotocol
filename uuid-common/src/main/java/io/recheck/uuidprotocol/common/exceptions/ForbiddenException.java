package io.recheck.uuidprotocol.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ForbiddenException extends ResponseStatusException {

    public ForbiddenException(String message){
        super(HttpStatus.FORBIDDEN, message);
    }

}