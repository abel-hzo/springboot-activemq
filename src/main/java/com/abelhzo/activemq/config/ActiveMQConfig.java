package com.abelhzo.activemq.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.ConnectionFactory;

/**
 * @author: Abel HZO
 * @project: springboot-activemq
 * @file: ActiveMQConfig.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Martes 06 Junio 2023, 17:41:25.
 * @description: El presente archivo ActiveMQConfig.java fue creado por Abel
 *               HZO.
 */
@EnableJms
@Configuration
public class ActiveMQConfig {

	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		activeMQConnectionFactory.setBrokerURL("tcp://127.0.0.1:61616");
		activeMQConnectionFactory.setUserName("admin");
		activeMQConnectionFactory.setPassword("admin");
		activeMQConnectionFactory.setTrustAllPackages(true);
		return activeMQConnectionFactory;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		jmsTemplate.setDefaultDestinationName("my-destination");
		jmsTemplate.setPubSubDomain(true);
		return jmsTemplate;
	}

	/**
	 * Es forzoso que este Bean tenga el nombre de "jmsListenerContainerFactory", por que si no,
	 * no sera encontrado por el JmsListener.
	 * 
	 * @return jmsListenerContainerFactory
	 */
	@Bean(name = "jmsListenerContainerFactory")
	public DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = 
				new DefaultJmsListenerContainerFactory();
		defaultJmsListenerContainerFactory.setConnectionFactory(connectionFactory());
		defaultJmsListenerContainerFactory.setPubSubDomain(true);
		return defaultJmsListenerContainerFactory;
	}

}
