package com.ileiwe.service.mail;

import lombok.Builder;
import lombok.Data;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 08/11/2021
 * inside the package - com.ileiwe.service.mail
 */

@Data
@Builder
public class Message {

    private String to;
    private String body;
    private String subject;
    private String from;
}
