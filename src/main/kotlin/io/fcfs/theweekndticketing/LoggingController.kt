package io.fcfs.theweekndticketing

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoggingController{
    private val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/log/error")
    fun logError(): String {
        logger.error("log error")
        return "error";
    }

    @GetMapping("/log/warn")
    fun logWarn(): String {
        logger.warn("log warn");
        return "warn";
    }

    @GetMapping("/log/info")
    fun logInfo(): String {
        logger.info("log info");
        return "info";
    }

    @GetMapping("/log/debug")
    fun logDebug(): String {
        logger.debug("log debug");
        return "debug";
    }

    @GetMapping("/log/trace")
    fun logTrace(): String {
        logger.trace("log trace");
        return "trace";
    }
}