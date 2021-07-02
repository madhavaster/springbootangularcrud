package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String stdName;
    private Double stdFee;
    private String stdCourse;
    private Double stdFeeDisc;
    private Double stdFeeGst;
}
