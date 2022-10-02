## Microservices PlayGroud

This repo cotains demo project for building microservices using spring boot and flask.  

There are 3 folders: 
- Eureka server:  this is a service registry built using spring boot and spring eureka server for registering the services  
- End user: a grades service with rest endpoints to send and recieve data from user  
- Data aggregation: This is a service whic is called internally by end user service to perform numerical operations on data  
  
  

To run:  
- clone the repo using git clone https://github.com/nilesh05apr/microservices_pg  
- Start Eureka server or run EurekaServerApplication.java file in src folder to start the Eureka server  
- go to localhost:8761 in your browser to see Spring Eureka dashboard  
- Similarly start End user service or run EndUserApplication.java file in src folder  
- check Spring Eureka Dashboard End user service will be registred  
- Finally run the flask app by using flask run --port=8050 or python app.py or python3 app.py  
- check Spring Eureka Dashbord for data aggregation service registration status  
- Make POST request to localhost:8060/student with body as mentioned in model  
- Health checks are provided at /health endpoint for each service, confirm by making GET request to /health  


  
Source:- https://stackabuse.com/spring-boot-and-flask-microservices-eureka-client/
