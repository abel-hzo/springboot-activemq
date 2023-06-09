package com.abelhzo.activemq.services;

import org.springframework.http.ResponseEntity;

import com.abelhzo.activemq.dtos.MessageDTO;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: PublishMessageService.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 18:41:59.
 * @description: El presente archivo PublishMessageService.java fue creado por Abel HZO.
 */
public interface PublishMessageService {
	
	ResponseEntity<String> publishMessage(MessageDTO messageDTO);

}
