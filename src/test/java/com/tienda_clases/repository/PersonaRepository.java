package com.tienda_clases.repository;

import com.tienda_clases.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

/**
 *
 * @author serra
 */

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    
} 