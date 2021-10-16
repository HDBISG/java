package vcc.demo.mq.controller;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vcc.demo.mq.service.ProducerService;

@RestController
public class OrderController {
	
    @Autowired
    private ProducerService producerService;
    
    @GetMapping("/order")
    private Object order(String msg) {
    	
        Destination destination = new ActiveMQQueue("order.queue");
        
        producerService.sendMsg(destination,msg);
        
        return "order";
    }
    
    @GetMapping("/topic")
    private Object topic(String msg) {
    	
        producerService.publish(msg);
        
        return "success";
    }
}