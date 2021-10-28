package com.ileiwe.data.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 27/10/2021
 * inside the package - com.ileiwe.data.model
 */

@Entity
@Data
public class LearningParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private boolean enabled;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @OneToMany
    private List<Authority> authorities;

}
