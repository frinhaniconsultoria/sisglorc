package br.com.sisglorc.repository;

import br.com.sisglorc.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Address, Integer> {
    
}
