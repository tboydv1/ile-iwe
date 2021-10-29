package com.ileiwe.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 27/10/2021
 * inside the package - com.ileiwe.data.model
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull     @NotBlank
    @Column(nullable = false)
    private String firstname;
    @NotNull     @NotBlank
    @Column(nullable = false)
    private String lastname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String specialization;
    @Column(length = 1000)
    private String bio;
    @OneToOne(cascade = CascadeType.PERSIST)
    private LearningParty learningParty;
    @OneToMany
    private List<Course> courses;

}
