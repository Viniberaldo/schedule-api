package com.vinidev.schedule.controller;

import com.vinidev.schedule.model.Appointment;
import com.vinidev.schedule.model.Email;
import com.vinidev.schedule.repository.AppointmentRepository;
import com.vinidev.schedule.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentRepository repository;
    private final EmailService emailService;

    public AppointmentController(AppointmentRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    @PostMapping
    public String createAppointment(@RequestBody Appointment appointment) {
        appointment.setId(null);
        repository.save(appointment);

        String templateString = """
                                Olá %s,

                                Você tem um compromisso conosco em %s.

                                Até mais!
                                """;
        String emailBody = String.format(templateString, appointment.getName(),
                appointment.getDateTime());
        Email email = new Email(appointment.getEmail(),
                "Appointment Schedule", emailBody);
        emailService.sendEmail(email);

        return "Agendamento realizado com sucesso!";
    }
}
