package hello;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        try {
			return "Hello Docker World. Our container IP is "+Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "Hello Docker World. We couldn't determine your IP address";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
