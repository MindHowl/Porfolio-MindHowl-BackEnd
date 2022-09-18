
package com.portfolio.mindhowl.Service;

import com.portfolio.mindhowl.Entity.Skills;
import com.portfolio.mindhowl.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {
    @Autowired
     RSkills rSkills;
    
    public List<Skills> list(){
         return rSkills.findAll();
     }
    public Optional<Skills> getOne(int id){
         return rSkills.findById(id);
     }
    public Optional<Skills> getByNombre(String nombre){
         return rSkills.findByNombre(nombre);
     }
    public void save(Skills skl){
         rSkills.save(skl);
     }
    public void delete(int id){
         rSkills.deleteById(id);
     }
     public boolean existsById(int id){
         return rSkills.existsById(id);
     }
     public boolean existsByNombre(String nombre){
         return rSkills.existsByNombre(nombre);
     }
}
