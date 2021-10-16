package vcc.demo.mq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
	
    @JmsListener(destination = "order.queue")
    public void receiveQueue(String text) {
        System.out.println("[ OrderConsumer收到的报文 : " + text + " ]");
    }
}
