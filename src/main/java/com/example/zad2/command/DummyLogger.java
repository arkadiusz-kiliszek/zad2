package com.example.zad2.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger {

    public void sayHello() {
        log.info("hello from DummyLogger");
    }
}
