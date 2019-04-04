package io.codifica.test.simple.blockingservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestApiController {

    private final TestService testService;

    @GetMapping("test/no-work")
    public void doSinchronousTestNoWork() {
        testService.doNoWork();
    }

    @GetMapping("test/small-work")
    public void doSinchronousTestSmallWork() {
        testService.doSmallWork();
    }

    @GetMapping("test/medium-work")
    public void doSinchronousTestMediumWork() {
        testService.doMediumWork();
    }

}
