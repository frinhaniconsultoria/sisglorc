package br.com.sisglorc;

import br.com.sisglorc.domain.Address;
import br.com.sisglorc.domain.Collaborator;
import br.com.sisglorc.repository.AddressRepository;
import br.com.sisglorc.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootApplication
public class SisglorcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SisglorcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
