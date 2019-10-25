package com.itchina.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;
@Service
public class MyMessageListener implements org.springframework.kafka.listener.MessageListener<Integer, String>{

	@Override
	public void onMessage(ConsumerRecord<Integer, String> consumerRecords) {
		System.out.println("收到的消息是==============");
		System.out.println(consumerRecords.value());
	}

}
