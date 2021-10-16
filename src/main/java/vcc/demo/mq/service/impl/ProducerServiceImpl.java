package vcc.demo.mq.service.impl;

import javax.jms.Destination;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import vcc.demo.mq.service.ProducerService;

@Service
public class ProducerServiceImpl implements ProducerService {
	
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
    @Autowired
    private Topic topic;

	@Override
	public void sendMsg(Destination destination, String message) {
		jmsTemplate.convertAndSend(destination, message);
	}
	
    @Override
    public void publish(String msg) {
        jmsTemplate.convertAndSend(topic, msg);
    }

}