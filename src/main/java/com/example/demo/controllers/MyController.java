package com.example.demo.controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class MyController {

    private final KafkaTemplate<String,String>kafkaTemplate;

    public MyController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("send-message")
    public void sendMessage(@RequestParam String data){
        kafkaTemplate.send("my-topic1","1",data + 1);
        kafkaTemplate.send("my-topic2","2",data + 2);
        kafkaTemplate.send("my-topic3","3",data + 3);
        kafkaTemplate.send("my-topic4","4",data + 4);
    }

}
