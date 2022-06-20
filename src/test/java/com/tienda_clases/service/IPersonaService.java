package com.tienda_clases.service;

import com.tienda_clases.entity.Persona;
import java.util.List;

/**
 *
 * @author serra
 */

public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona findByNombre (String nombre);
    public Persona getPersonaId (long id);
    public void savePersona  (Persona persona);
    public void deletePersona (long id); 
}
