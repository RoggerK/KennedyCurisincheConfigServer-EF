package idat.edu.pe.curisinche.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfKennedyCurisincheConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKennedyCurisincheConfigServerApplication.class, args);
	}

}
