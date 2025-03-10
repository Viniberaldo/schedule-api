package com.vinidev.schedule.repository;

import com.vinidev.schedule.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
