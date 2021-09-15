package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Logger logger = LoggerFactory.getLogger(App.class);
        final String ocClientPath = Downloader.downloadOCClient();
        logger.info("Downloaded: {}", ocClientPath);
        logger.info("Extracted: {}", SystemUtils.listDirectory(Paths.get(ocClientPath).getParent().normalize().toAbsolutePath().toString()));

    }
}
