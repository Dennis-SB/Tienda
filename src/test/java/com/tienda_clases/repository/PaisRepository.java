package com.tienda_clases.repository;


import com.tienda_clases.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

/**
 *
 * @author serra
 */

@Repository
public interface PaisRepository extends CrudRepository<Pais,Long> {}