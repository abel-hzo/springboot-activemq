package com.abelhzo.activemq.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.abelhzo.activemq.dtos.MessageDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: ActiveMQListener.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 19:14:55.
 * @description: El presente archivo ActiveMQListener.java fue creado por Abel HZO.
 */
@Component
public class ActiveMQListener {
	
	Logger logger = LoggerFactory.getLogger(ActiveMQListener.class);

	@JmsListener(destination = "my-destination")
	public void handleMessage(MessageDTO messageDTO) throws JsonProcessingException {
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("---------------------MENSAJE RECIBIDO DESDE ACTIVEMQ---------------------");
		System.out.println("-------------------------------------------------------------------------");
		
		logger.info("\nMessage: {}", new ObjectMapper()
				.registerModule(new JavaTimeModule())
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(messageDTO));
	}
	
}

/**
 * Es importante que los objetos enviados tengan la implementación de la interfaz Serializable.
*/