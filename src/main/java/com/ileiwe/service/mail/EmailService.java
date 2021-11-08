package com.ileiwe.service.mail;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 08/11/2021
 * inside the package - com.ileiwe.service.mail
 */
public interface EmailService {

    MailResponse send(Message message);
}
