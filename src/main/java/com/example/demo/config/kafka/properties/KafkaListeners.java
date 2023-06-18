package com.example.demo.config.kafka.properties;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "my-topic1" , groupId = "group-id")
    void listaner(String data){
            System.out.println("i am listaner 1 and i catch your message look :" + data);
    }

    @KafkaListener(topics = "my-topic2" , groupId = "group-id")
    void listener1(String data){
            System.out.println("i am listaner 2 and i catch your message look :" + data);
    }

    @KafkaListener(topics = "my-topic-transaction" , groupId = "group-id")
    void listenerForTransaction(String data){
        System.out.println("i am listaner for transaction and i catch your message look :" + data);
    }
}
