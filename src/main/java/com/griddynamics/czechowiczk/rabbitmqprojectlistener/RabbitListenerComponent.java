package com.griddynamics.czechowiczk.rabbitmqprojectlistener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitListenerComponent {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

