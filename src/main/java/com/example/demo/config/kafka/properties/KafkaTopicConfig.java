package com.example.demo.config.kafka.properties;

import lombok.Getter;
import lombok.Setter;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.List;

@Getter
@Setter
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic1(){
        return TopicBuilder.name("my-topic1")
                .build();
    }
    @Bean
    public NewTopic myTopic2(){
        return TopicBuilder.name("my-topic2")
                .build();
    } @Bean
    public NewTopic myTopic3(){
        return TopicBuilder.name("my-topic3")
                .build();
    } @Bean
    public NewTopic myTopic4(){
        return TopicBuilder.name("my-topic4")
                .build();
    }
}