package de.jstco.retry.document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class DocumentRetriever {

    Logger log = LoggerFactory.getLogger(DocumentRetriever.class);
    private int counter = 0;

    public void document() {
        System.out.println("header");
        System.out.println(this.getRemoteBody());
        System.out.println("footer");
    }

    private String getRemoteBody() {
        // mimicking network failure
        log.debug("counter=" + counter);
        if (counter++ <= 3) {
            throw new RuntimeException("not yet");
        }
        return "body";
    }

}
