package com.snort.inteli.kafka.message.broker.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.snort.inteli.kafka.message.broker.model.Payment;

@Component
@Slf4j
public class PaymentConsumer {

    @KafkaListener(topics = "topic-payment-status", groupId = "snortGroup")
    public void listen(Payment message) {
        log.info("consumer involved",message);
        System.out.println("Received message: " + message);
    }

}
