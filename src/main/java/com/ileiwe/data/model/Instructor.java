package com.ileiwe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 27/10/2021
 * inside the package - com.ileiwe.data.model
 */

@Entity
@Data
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Gender gender;
    private String specialization;
    @Column(length = 1000)
    private String bio;
    @OneToOne
    private LearningParty learningParty;
    @OneToMany
    private List<Course> courses;
}
