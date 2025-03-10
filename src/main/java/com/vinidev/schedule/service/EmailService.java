package com.vinidev.schedule.service;

import com.vinidev.schedule.model.Email;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final MailSender mailSender;

    public EmailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("schedule.service@no-reply.com");
        message.setTo(email.to());
        message.setSubject(email.Subject());
        message.setText(email.body());
        mailSender.send(message);
    }
}
