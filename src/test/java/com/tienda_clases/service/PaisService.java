package com.tienda_clases.service;

import com.tienda_clases.entity.Pais;
import com.tienda_clases.repository.PaisRepository;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author serra
 */

public class PaisService implements IPaisService {
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }
}