package com.eumji.rabbitmq.vo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * FILE: com.eumji.rabbitmq.vo.TutorialSender.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: iamzken
 * DATE: 2017/5/17
 * TIME: 20:54
 */
@Component
public class TutorialSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(){
        String message = "hello world";
        rabbitTemplate.convertAndSend(queue.getName(),message);
        System.out.println("sender will send message: "+message);
    }
}
