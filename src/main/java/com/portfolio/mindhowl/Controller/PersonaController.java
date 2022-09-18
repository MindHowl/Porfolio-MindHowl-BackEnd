package com.portfolio.mindhowl.Controller;

import com.portfolio.mindhowl.Entity.Persona;
import com.portfolio.mindhowl.Interface.IPersonaService;
import com.portfolio.mindhowl.Security.Controller.Mensaje;
import com.portfolio.mindhowl.Service.ImpPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://porfolio-mindhowl.web.app/")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombreCompleto") String nuevoNombreCompleto,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("img") String nuevoImg,
                               @RequestParam("descripcion") String nuevaDescripcion,
                               @RequestParam("formspree") String nuevoFormspree
                               ){
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombreCompleto(nuevoNombreCompleto);
        persona.setTitulo(nuevoTitulo);
        persona.setImg(nuevoImg);
        persona.setDescripcion(nuevaDescripcion);
        persona.setFormspree(nuevoFormspree);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
   
}
