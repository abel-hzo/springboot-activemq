package com.abelhzo.activemq.dtos;

import java.io.Serializable;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: OriginDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 18:07:04.
 * @description: El presente archivo OriginDTO.java fue creado por Abel HZO.
 */
/*
 * Las clases que serán manejadas por ActiveMQ, ya sean enviadas o recibidas.
 * Tienen que implementar la interfaz Serializable.
 * */
public class HeadersDTO implements Serializable {

	private static final long serialVersionUID = 8104967203315152436L;
	private String host;
	private String userAgent;
	private String contentType;
	private String acceptEncoding;
	private Integer contentLength;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getAcceptEncoding() {
		return acceptEncoding;
	}

	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}

	public Integer getContentLength() {
		return contentLength;
	}

	public void setContentLength(Integer contentLength) {
		this.contentLength = contentLength;
	}

}
