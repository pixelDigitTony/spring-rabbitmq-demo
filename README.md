# Spring React Authentication Demo
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


# Other Tools Used

* [Spring Boot v3.1.1](https://spring.io/projects/spring-boot)
* [Spring Security v6.1.1](https://spring.io/projects/spring-security)
* [Thymeleaf](https://www.thymeleaf.org)
* [ReactJS v18.2.0](https://reactjs.org/)
* [Axios v1.4.0](https://axios-http.com/docs/intro)
* [Typescript v5.0.2](https://www.typescriptlang.org)
* [Vite v4.4.5](https://vitejs.dev)
* [FlywayDB 9.16.3](https://flywaydb.org)
* [PostgreSQL:latest (docker image)](https://www.postgresql.org)
* [Material UI](https://mui.com)
* [Material UI Icons](https://mui.com)

# Todo
- [x] Implement functionality to send String messages to the consumer
- [ ] Implement functionality to send JSON data to the consumer
# References

* [Tutorial for Spring amqp](https://www.rabbitmq.com/tutorials/tutorial-four-spring-amqp.html)