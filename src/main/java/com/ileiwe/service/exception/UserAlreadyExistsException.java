package com.ileiwe.service.exception;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 08/11/2021
 * inside the package - com.ileiwe.service.exception
 */
public class UserAlreadyExistsException extends Throwable {
    public UserAlreadyExistsException(String s) {
        super(s);
    }
}
