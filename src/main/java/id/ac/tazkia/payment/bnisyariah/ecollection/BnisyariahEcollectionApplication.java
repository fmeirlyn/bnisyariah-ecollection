package id.ac.tazkia.payment.bnisyariah.ecollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class BnisyariahEcollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BnisyariahEcollectionApplication.class, args);
	}
}