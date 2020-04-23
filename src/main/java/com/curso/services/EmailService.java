package com.curso.services;

import org.springframework.mail.SimpleMailMessage;

import com.curso.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
