package com.PetPal.backend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class AppointmentDuplicate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ownerName;
    private String petName;
    private String petType;
    private String clinic;
    private String doctor;
    private Long doctorId=1L;
    private String date;
    private String time;
    private int status = 0;


    public AppointmentDuplicate() {
    }
}
