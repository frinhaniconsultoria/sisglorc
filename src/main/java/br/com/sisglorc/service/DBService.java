package br.com.sisglorc.service;


import br.com.sisglorc.domain.Address;
import br.com.sisglorc.domain.Collaborator;
import br.com.sisglorc.repository.AddressRepository;
import br.com.sisglorc.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CollaboratorRepository collaboratorRepository;

    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public void instantiateDatabase() throws ParseException {

        Address ad1 = new Address(null, "Maria Colleta", "Casa", "203", "São Rafael", "Mandaguaçu", "Paraná");
        Address ad2 = new Address(null, "Maria Colleta", "Casa", "204", "São Rafael", "Mandaguaçu", "Paraná");
        Address ad3 = new Address(null, "Maria Colleta", "Casa", "205", "São Rafael", "Mandaguaçu", "Paraná");
        Address ad4 = new Address(null, "Maria Colleta", "Casa", "206", "São Rafael", "Mandaguaçu", "Paraná");

        Collaborator col1 = new Collaborator(null, "Thiago Frinhani", "tf@email.com", "03054597164", LocalDate.of(1989, 03, 21), ad1);
        Collaborator col2 = new Collaborator(null, "Lidia Frinhani", "tf@email.com", "03054597164", LocalDate.of(1986, 04, 18), ad2);
        Collaborator col3 = new Collaborator(null, "Davi Frinhani", "tf@email.com", "03054597164", LocalDate.of(2013, 04, 14), ad3);
        Collaborator col4 = new Collaborator(null, "Sara Frinhani", "tf@email.com", "03054597164", LocalDate.of(2016, 05, 06), ad4);

        addressRepository.saveAll(Arrays.asList(ad1,ad2,ad3) );
        collaboratorRepository.saveAll(Arrays.asList(col1,col2,col3));
    }

}
