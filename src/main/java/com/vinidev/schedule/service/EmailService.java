package com.vinidev.schedule.service;

import com.vinidev.schedule.model.Email;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Classe de serviço para envio de e-mails
 */
@Service
public class EmailService {

    /**
     * classe que implementa o envio de e-mails.
     */
    private final MailSender mailSender;

    /**
     * Construtor de EmailService
     *
     * @param mailSender
     *   classe que implementa o envio de e-mails.
     */
    public EmailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Envia um e-mail com base no {@code email}.
     *
     * @param email
     *   Classe que contém o E-mail para o qual será enviada a mensagem e outros
     *   atributos.
     */
    public void sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("schedule.service@no-reply.com");
        message.setTo(email.to());
        message.setSubject(email.Subject());
        message.setText(email.body());
        mailSender.send(message);
    }
}
