package com.example.demo.config.kafka.properties;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "my-topic1" , groupId = "group-id")
    void listaner(String data){
            System.out.println("i am listaner and i catch your message =)))   look :" + data);
    }

    @KafkaListener(topics = "my-topic2" , groupId = "group-id")
    void listener1(String data){
            System.out.println("i am listaner1 and i catch your message =)))   look :" + data);
    }
}
