package vcc.demo.mq.service;

import javax.jms.Destination;

public interface ProducerService {

	void sendMsg(Destination destination, final String message);
	
	void publish(String msg);
	
}
