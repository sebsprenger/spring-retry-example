package de.jstco.retry.document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
class RemoteBodyRetriever {

    Logger log = LoggerFactory.getLogger(RemoteBodyRetriever.class);
    private int counter = 0;

    @Retryable(value = {RuntimeException.class}, maxAttempts = 5)
    String getRemoteBody() throws RuntimeException {

        return "body";
    }

}
