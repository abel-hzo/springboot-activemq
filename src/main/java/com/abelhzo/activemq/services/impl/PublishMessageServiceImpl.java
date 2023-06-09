package com.abelhzo.activemq.services.impl;

import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.abelhzo.activemq.dtos.HeadersDTO;
import com.abelhzo.activemq.dtos.MessageDTO;
import com.abelhzo.activemq.services.PublishMessageService;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: PublishMessageServiceImpl.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 18:49:15.
 * @description: El presente archivo PublishMessageServiceImpl.java fue creado
 *               por Abel HZO.
 */
@Service
public class PublishMessageServiceImpl implements PublishMessageService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public ResponseEntity<String> publishMessage(MessageDTO messageDTO) {

		HttpServletRequest request = ((ServletRequestAttributes) 
				RequestContextHolder
				.getRequestAttributes())
				.getRequest();

		showHeaders(request);

		HeadersDTO headersDTO = new HeadersDTO();
		headersDTO.setHost(request.getHeader("host"));
		headersDTO.setUserAgent(request.getHeader("user-agent"));
		headersDTO.setContentType(request.getHeader("content-type"));
		headersDTO.setAcceptEncoding(request.getHeader("accept-encoding"));
		headersDTO.setContentLength(Integer.parseInt(request.getHeader("content-length")));
		messageDTO.setIdMessage(UUID.randomUUID().toString());
		messageDTO.setLocalDateTime(LocalDateTime.now());
		messageDTO.setHeadersDTO(headersDTO);

		jmsTemplate.convertAndSend(messageDTO);

		return new ResponseEntity<String>("Mensaje Enviado!!!", HttpStatus.OK);
	}

	private void showHeaders(HttpServletRequest request) {
		Enumeration<String> headers = request.getHeaderNames();

		while (headers.hasMoreElements()) {
			String name = (String) headers.nextElement();
			System.out.println(name + " = " + request.getHeader(name));
		}
	}

}
