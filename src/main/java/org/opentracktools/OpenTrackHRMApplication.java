package org.opentracktools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Arpan Mukhopadhyay
 */
@SpringBootApplication
public class OpenTrackHRMApplication {
  
  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    ConfigurableApplicationContext hrmApplicationContext = SpringApplication.run(OpenTrackHRMApplication.class, args);
  }
}
