package com.abelhzo.activemq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abelhzo.activemq.dtos.MessageDTO;
import com.abelhzo.activemq.services.PublishMessageService;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: PublishMQController.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 17:54:25.
 * @description: El presente archivo PublishMQController.java fue creado por Abel HZO.
 */
@RestController
public class PublishMQController implements PublishMessageService {
	
	@Autowired
	private PublishMessageService publishMessageService;

	@Override
	@PostMapping("/publish")
	public ResponseEntity<String> publishMessage(@RequestBody MessageDTO messageDTO) {
		return publishMessageService.publishMessage(messageDTO);
	}
	
	
}
