package covid19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("covid19")
public class Covid19DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19DashboardApplication.class, args);
	}

}
