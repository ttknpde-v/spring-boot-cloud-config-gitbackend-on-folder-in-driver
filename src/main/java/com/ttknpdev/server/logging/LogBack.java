package com.ttknpdev.server.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBack {
    public Logger log;
    public LogBack(Class c) {
        this.log = LoggerFactory.getLogger(c);;
    }
}
