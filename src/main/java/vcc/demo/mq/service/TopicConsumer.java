package vcc.demo.mq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer {
    
	//@JmsListener(destination = "demo.topic")
    @JmsListener(destination = "demo.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiver1(String text) {
        System.out.println("TopicConsumer : receiver1 : " + text);
    }

    @JmsListener(destination = "demo.topic")
    public void receiver2(String text) {
        System.out.println("TopicConsumer : receiver2 : " + text);
    }

    @JmsListener(destination = "demo.topic")
    public void receiver3(String text) {
        System.out.println("TopicConsumer : receiver3 : " + text);
    }
}