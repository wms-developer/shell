package com.cherish.web;



import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestLog
 * @Description TODO
 * @Date 2019/9/6 11:02
 * @Created by ZF-JS
 */


@RestController
public class TestLog {
    Logger logger = LoggerFactory.getLogger(TestLog.class);
    @GetMapping("/test")
    public void testLog(){
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
    }
}
