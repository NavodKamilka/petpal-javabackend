package com.PetPal.backend.Repository;

import com.PetPal.backend.Entity.Appointment;
import com.PetPal.backend.Entity.AppointmentDuplicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface appointmentDuplicateRepository extends JpaRepository<AppointmentDuplicate, Long> {

}
