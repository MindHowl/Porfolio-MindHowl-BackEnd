
package com.portfolio.mindhowl.Interface;

import com.portfolio.mindhowl.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una list persona 
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto(usuario)pero buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);

    public boolean existsById(int id);
}