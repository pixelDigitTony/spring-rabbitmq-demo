# Spring RabbitMQ Demo
This is a demo project for Spring Boot and RabbitMQ. This is to explore the features and functionalities of RabbitMQ, as well as knowing to how to use messaging queues.

# Project Structure

The project is divided into 3 2 modules: the consumer, and the producer. The consumer is the receiver of the message, and the producer is the sender of the message.

here's what the project structure looks like when you open the src folder:

## Consumer
```
├─consumer
  ├─.mvn
  │  └─wrapper
  └─src
      ├─main
      │  ├─java
      │  │  └─uy
      │  │      └─anthony
      │  │          └─consumer
      │  │              ├─application
      │  │              ├─domain
      │  │              │  └─model
      │  │              └─infra
      │  └─resources
      └─test
          └─java
              └─uy
                  └─anthony
                      └─consumer


```

## Producer
```
├─producer
  ├─.mvn
  │  └─wrapper
  └─src
      ├─main
      │  ├─java
      │  │  └─uy
      │  │      └─anthony
      │  │          └─producer
      │  │              ├─application
      │  │              ├─domain
      │  │              │  └─model
      │  │              ├─Impl
      │  │              └─infra
      │  └─resources
      └─test
          └─java
              └─uy
                  └─anthony
                      └─producer
                          └─application

```

# Prerequisites
* [Java 17.0.8](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Docker (latest version)](https://www.docker.com)
* [Intellij IDEA (or your favorite IDE)](https://www.jetbrains.com/toolbox-app/)

# Getting Started

This section teaches how to install, run and test the application.

## Installation

1. After cloning the project, change directory into the project directory `spring-react-auth-demo`, and run the command. Make sure you have docker installed and running.
* ```sh
    docker-compose up
    ```
2. After waiting for the docker container to set up. run the command
* ```bash
    ./mvnw clean install
    ```

## Testing

To test the application, go to [MessageControllerTest](producer/src/test/java/uy/anthony/producer/application/MessageControllerTest.java) class, it is where the unit tests are located, you can run the tests from there, and see how data is passed between 2 modules with different ports using RabbitMQ.


# Other Tools Used

* [RabbitMQ](https://www.rabbitmq.com/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring AMQP](https://spring.io/projects/spring-amqp)

# Todo
- [x] Implement functionality to send String messages to the consumer
- [x] Implement functionality to send JSON data to the consumer
- 
# References

* [Tutorial for Spring amqp](https://www.rabbitmq.com/tutorials/tutorial-four-spring-amqp.html)
* [RabbitMQ documentation](https://www.rabbitmq.com/documentation.html)