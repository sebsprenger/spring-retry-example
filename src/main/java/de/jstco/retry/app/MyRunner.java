package de.jstco.retry.app;

import de.jstco.retry.document.DocumentRetriever;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class MyRunner implements CommandLineRunner {

    private final DocumentRetriever documentRetriever;

    MyRunner(DocumentRetriever documentRetriever) {
        this.documentRetriever = documentRetriever;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            documentRetriever.document();
        } catch (Exception e) {
            System.err.println("Failure detected. kthxbye.");
        }
    }

}
