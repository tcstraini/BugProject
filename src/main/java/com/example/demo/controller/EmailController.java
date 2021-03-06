package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Email;
import com.example.demo.service.EmailService;

@Controller
public class EmailController {

	    @Autowired
	    EmailService EmailService;

	    @RequestMapping(value = "/mail/send", method = RequestMethod.POST)
	    public void sendMail(@RequestBody Email emailSendingRequest) {
	        EmailService.sendEmail(emailSendingRequest.getTo(), 
	emailSendingRequest.getTextBody(), emailSendingRequest.getTopic());
	    }

	}