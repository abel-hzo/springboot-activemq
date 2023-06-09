package com.abelhzo.activemq.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: MessageDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 18:00:56.
 * @description: El presente archivo MessageDTO.java fue creado por Abel HZO.
 */
/*
 * Las clases que serán manejadas por ActiveMQ, ya sean enviadas o recibidas.
 * Tienen que implementar la interfaz Serializable.
 * */
public class MessageDTO implements Serializable {

	private static final long serialVersionUID = 6324965662190284571L;
	private String idMessage;
	private String message;
	private TypeMessage typeMessage;
	private HeadersDTO headersDTO;
	private LocalDateTime localDateTime;

	public String getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(String idMessage) {
		this.idMessage = idMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TypeMessage getTypeMessage() {
		return typeMessage;
	}

	public void setTypeMessage(TypeMessage typeMessage) {
		this.typeMessage = typeMessage;
	}

	public HeadersDTO getHeadersDTO() {
		return headersDTO;
	}

	public void setHeadersDTO(HeadersDTO headersDTO) {
		this.headersDTO = headersDTO;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

}
