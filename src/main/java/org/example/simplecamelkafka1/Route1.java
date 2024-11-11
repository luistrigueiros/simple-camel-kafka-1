package org.example.simplecamelkafka1;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static org.apache.camel.LoggingLevel.INFO;

@Slf4j
@Component
public class Route1 extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:stock-live")
                .log(INFO, "Got message: OFFSET=[${header.kafka.OFFSET}] body=[${body}]");
    }

    @PostConstruct
    void postInit() {
        log.info("Starting route 1");
    }
}
