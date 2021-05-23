package hello;

import org.joda.time.LocalTime;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
  public static void main(String[] args) {
	LocalTime currentTime = new LocalTime();
	  Logger logger = Logger.getLogger(HelloWorld.class.getName());
	  logger.setLevel(Level.INFO);
	  logger.log(Level.INFO, "The current local time is: " + currentTime);

  }
}