package com.vinidev.schedule.repository;

import com.vinidev.schedule.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface que implementa as funcionalidades de persistêcia no banco de dados
 */
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
