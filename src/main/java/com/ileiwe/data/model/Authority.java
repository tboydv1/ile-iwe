package com.ileiwe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 27/10/2021
 * inside the package - com.ileiwe.data.model
 */
@Entity
@Data
public class Authority {

    @Id
    @GeneratedValue
    private UUID id;
    @Enumerated(EnumType.STRING)
    private Role authority;

}
