package com.itchina.kafkaController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:servicer-common.xml"})
public class KafkaTestDemo {
	@Autowired
    private KafkaTemplate kafkaTemplate;
    @Test
    public void producer(){
    	kafkaTemplate.send("topic-test","hello-world");
    	System.out.println("发送成功");
    }
}
