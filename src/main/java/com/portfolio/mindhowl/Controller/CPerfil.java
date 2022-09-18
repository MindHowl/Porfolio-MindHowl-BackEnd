package com.portfolio.mindhowl.Controller;

import com.portfolio.mindhowl.Dto.dtoPerfil;
import com.portfolio.mindhowl.Entity.Perfil;
import com.portfolio.mindhowl.Security.Controller.Mensaje;
import com.portfolio.mindhowl.Service.SPerfil;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://porfolio-mindhowl.web.app")
public class CPerfil {

    @Autowired
    SPerfil sPerfil;

    @GetMapping("/lista")
    public ResponseEntity<List<Perfil>> list() {
        List<Perfil> list = sPerfil.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Perfil> getById(@PathVariable("id") int id) {
        if (!sPerfil.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Perfil perfil = sPerfil.getOne(id).get();
        return new ResponseEntity(perfil, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sPerfil.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sPerfil.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPerfil dtoperfil) {
        if (StringUtils.isBlank(dtoperfil.getNombreCompleto())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sPerfil.existsByNombreCompleto(dtoperfil.getNombreCompleto())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Perfil perf = new Perfil(dtoperfil.getNombreCompleto(), dtoperfil.getDescripcion(), dtoperfil.getImg(), dtoperfil.getTitulo(), dtoperfil.getFormspree(),
                dtoperfil.getFacebook(), dtoperfil.getGithub(), dtoperfil.getLinkedin(), dtoperfil.getStackoverflow(), dtoperfil.getInstagram());
        
        sPerfil.save(perf);

        return new ResponseEntity(new Mensaje("Perfil agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPerfil dtoperfil) {
        //Validamos si existe el ID
        if (!sPerfil.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de experiencias
        if (sPerfil.existsByNombreCompleto(dtoperfil.getNombreCompleto()) && sPerfil.getByNombreCompleto(dtoperfil.getNombreCompleto()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoperfil.getNombreCompleto())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Perfil perfil = sPerfil.getOne(id).get();
        perfil.setNombreCompleto(dtoperfil.getNombreCompleto());
        perfil.setDescripcion(dtoperfil.getDescripcion());
        perfil.setTitulo(dtoperfil.getTitulo());
        perfil.setImg(dtoperfil.getImg());
        perfil.setFormspree(dtoperfil.getFormspree());
        perfil.setFacebook(dtoperfil.getFacebook());
        perfil.setInstagram(dtoperfil.getInstagram());
        perfil.setLinkedin(dtoperfil.getLinkedin());
        perfil.setGithub(dtoperfil.getGithub());
        perfil.setStackoverflow(dtoperfil.getStackoverflow());

        sPerfil.save(perfil);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);

    }
}
