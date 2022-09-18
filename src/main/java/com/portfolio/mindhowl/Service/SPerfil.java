
package com.portfolio.mindhowl.Service;

import com.portfolio.mindhowl.Entity.Perfil;
import com.portfolio.mindhowl.Repository.RPerfil;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPerfil {
     @Autowired
     RPerfil rPerfil;
     
     public List<Perfil> list(){
         return rPerfil.findAll();
     }
     
     public Optional<Perfil> getOne(int id){
         return rPerfil.findById(id);
     }
     
     public Optional<Perfil> getByNombreCompleto(String nombreCompleto){
         return rPerfil.findByNombreCompleto(nombreCompleto);
     }
     
     public void save(Perfil perfil){
         rPerfil.save(perfil);
     }
     
     public void delete(int id){
         rPerfil.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rPerfil.existsById(id);
     }
     
     public boolean existsByNombreCompleto(String nombreCompleto){
         return rPerfil.existsByNombreCompleto(nombreCompleto);
     }
}

