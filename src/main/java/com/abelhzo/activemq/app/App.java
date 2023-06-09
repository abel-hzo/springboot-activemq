package com.abelhzo.activemq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: App.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 17:38:28.
 * @description: El presente archivo App.java fue creado por Abel HZO.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.abelhzo.activemq" })
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

/**
 * Para iniciar el servidor de ActiveMQ se tiene que teclear el comando: ./activemq start, dentro de la
 * carpeta /bin.
 * 
 * Y podremos acceder a la consola administrativa desde http://localhost:8161 para ver los topic 
 * y queues que tenemos creados.
 * 
 * */
