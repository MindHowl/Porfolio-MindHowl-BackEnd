
package com.portfolio.mindhowl.Repository;

import com.portfolio.mindhowl.Entity.Perfil;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RPerfil extends JpaRepository<Perfil, Integer>{
    public Optional<Perfil> findByNombreCompleto(String nombreCompleto);
    public boolean existsByNombreCompleto (String nombreCompleto);
}

    

