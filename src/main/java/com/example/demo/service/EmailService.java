package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String to, String body, String topic) {
		try {
			System.out.println("Mail sending is started");
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom("nikitha.kv7@gmail.com");
			simpleMailMessage.setTo(to);
			simpleMailMessage.setSubject(topic);
			simpleMailMessage.setText(body);
			javaMailSender.send(simpleMailMessage);
			System.out.println("Mail sending is completed");
		} catch (Exception e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}
}