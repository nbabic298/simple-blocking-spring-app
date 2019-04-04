package io.codifica.test.simple.blockingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {

    public void doNoWork() {
        log.info("Doing no work!!!");
    }

    public void doSmallWork() {
        log.info("Doing small work!!!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            log.error("doSmallWork() Error: {}", e.getMessage(), e);
        }
    }

    public void doMediumWork() {
        log.info("Doing medium work!!!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            log.error("doMediumWork() Error: {}", e.getMessage(), e);
        }
    }

}
