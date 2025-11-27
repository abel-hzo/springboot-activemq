## Demostración del uso de ActiveMQ Artemis con Java SpringBoot.

La siguiente aplicación nos muestra como conectarse a un sistema de broker (ActiveMQ Artemisa), el envío y recibimiento del mensaje.

### 1.- La descarga e instalación de ActiveMQ Artemis es para Debian 12:

1. Descargar de:
  - https://activemq.apache.org/components/artemis/download/
  - apache-artemis-2.44.0-bin.tar.gz
2. Descomprimir:
  - <code>sudo tar -zxvf apache-artemis-2.44.0-bin.tar.gz -C /opt/</code>
3. Establecer variable de entorno:
  - <code>sudo mousepad bash.bashrc</code>
4. Al final del archivo colocamos:  
  - <code>export PATH=$PATH:/opt/apache-artemis-2.44.0/bin</code>

### 2.- Una vez descomprimido y configurado en una nueva terminal podemos ejecutar ActiveMQ Artemis:
***
1. Nos posicionamos en la carpeta donde queremos crear nuestra instancia:
  - <code>user@debian:/$ cd /home/user/Documents/workspace-java/springboot-activemq</code>

2. Ejecutamos artemis:
  - <code>user@debian:~/Documents/workspace-java/springboot-activemq$ artemis</code>
  - TAB

<img width="862" height="741" alt="Image" src="https://github.com/user-attachments/assets/0a9e04e3-4fc2-490b-a071-e499ed26fc1c" />

3. Creamos una nueva instancia:
  - <code>Apache ActiveMQ Artemis 2.44.0 > create mybroker
    user: abel-hzo
    password: admin123
    Y</code>

<img width="937" height="532" alt="Image" src="https://github.com/user-attachments/assets/51745de2-79df-4c0f-afd6-4fc6f5d1a11d" /> 

<br> 📝 Como podemos ver nos ha creado un nuevo folder el cual es la nueva instancia. Y como vemos también nos indica como ejecutar esa nueva instancia.  

<img width="685" height="218" alt="Image" src="https://github.com/user-attachments/assets/1f795dfc-6aff-46eb-856c-86ab685328f8" />

<br> 4. Ejecutar la instancia creada en una nueva ventana con la instruccion que nos ha dado la consola:

  - <code>"/home/user/Documents/workspace-java/springboot-activemq/mybroker/bin/artemis" run</code>

<img width="1264" height="335" alt="Image" src="https://github.com/user-attachments/assets/0acfbab9-cabd-40a9-a7cd-62c44b867267" />

<br> 5. Podemos acceder a la consola grafica en: ```http://localhost:8161/console``` y las credenciales son las que asignamos al crear nuestra instancia.

<img width="1091" height="470" alt="Image" src="https://github.com/user-attachments/assets/b436a997-604a-41c7-9233-1bfea3588f0b" />

<br> 6. Y podemos crear nuestro destination desde la pestaña de Addresses o en el caso de Java se crea automaticamente con la anotación:
   <code>@JmsListener(destination = "my-destination")</code>

<img width="1273" height="489" alt="Image" src="https://github.com/user-attachments/assets/65293770-f2fd-43b8-acbb-7b42ba9bfc72" />

<br><img width="837" height="388" alt="Image" src="https://github.com/user-attachments/assets/b38ffc07-3a5e-49e3-baec-b35611d1294f" />

7. Al ejecutar la aplicación, podemos ver como nos aparece en la tab de Consumers:

<img width="1147" height="421" alt="Image" src="https://github.com/user-attachments/assets/24c5d551-c3fd-425d-8a95-037f9c534db7" />

<br><img width="978" height="330" alt="Image" src="https://github.com/user-attachments/assets/6f417278-e8d6-4e48-b9e5-8885bf3af5c2" />

<br> 8. Por ultimo, enviamos un mensaje a Active MQ desde un servicio REST, hacemos la prueba de la siguiente manera:
  - ```curl -X POST -H "Content-Type: application/json" -H "Accept-Encoding: *" -d '{"message": "Este es el mensaje que se enviará al broker!!!", "typeMessage": "CREATE"}' http://localhost:8080/publish```

<img width="1264" height="82" alt="Image" src="https://github.com/user-attachments/assets/fc4cf3b0-9df8-4080-8522-4033c67af0b4" />

<br><img width="827" height="444" alt="Image" src="https://github.com/user-attachments/assets/8a412049-3d7f-41e0-a77c-5ddf654f7ea3" />
