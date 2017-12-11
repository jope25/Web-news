package jope.webnews;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebNewsApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebNewsApp.class, args);
    }

    @PostConstruct
    public void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+2"));
    }
}
