package edu.usmp.sunatapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.usmp.sunatapi.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,Integer>{
    
}
