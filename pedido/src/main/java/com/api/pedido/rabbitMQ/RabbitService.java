package com.api.pedido.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitService {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${com.api.pedido.rabbitMQConsumer.exchange}")
	private String exchange;
	
	@Value("${com.api.pedido.rabbitMQConsumer.routingkey}")
	private String routingkey;
		
	@RabbitListener(queues = "${com.api.pedido.rabbitMQConsumer.queue}")
				
		public void send(String string) {
			rabbitTemplate.convertAndSend(exchange, routingkey, string);
	}
}