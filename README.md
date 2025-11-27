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
  - export PATH=$PATH:/opt/apache-artemis-2.44.0/bin

### 2.- Una vez descomprimido y configurado en una nueva terminal podemos ejecutar ActiveMQ Artemis:
***
1. Nos posicionamos en la carpeta donde queremos crear nuestra instancia:
  - <code>user@debian:/$ cd /home/user/Documents/workspace-java/springboot-activemq</code>

2. Ejecutamos artemis:
  - <code>user@debian:~/Documents/workspace-java/springboot-activemq$ artemis</code>
  - TAB

