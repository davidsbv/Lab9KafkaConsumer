package com.caroffer.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarOfferConsumerService {

    @KafkaListener(topics = "car-offers", groupId = "1")
    public void consume(String message){
        log.info("Message received -> {}", message);
    }
}
