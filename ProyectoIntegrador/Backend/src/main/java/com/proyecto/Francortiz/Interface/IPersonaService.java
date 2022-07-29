
package com.proyecto.Francortiz.Interface;

import com.proyecto.Francortiz.Entity.Persona;
import java.util.List;

/**
 *
 * @author tony
 */
public interface IPersonaService {
    //traer una lista de personas
    
    public List<Persona> getPersona();
    
    //guardar lista
    public void savePersona(Persona persona);
    //eliminar
    public void deletePersona(Long id);
    //buscar

    public Persona findPersona(Long id);
}