package com.example.msbanque2.web;

import com.example.msbanque2.entities.Compte;
import com.example.msbanque2.repositories.CompteRepository;
import jakarta.ws.rs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/banque")
public class CompteRestControllerAPI {
    @Autowired
    private CompteRepository cr;
    @GetMapping(path="/comptes",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<Compte> compteList(){
        return cr.findAll();
    }
    @GetMapping("/comptes/{id}")
    public Compte getOne(@PathVariable Long id){
        return cr.findById(id).get();
    }
    @PostMapping("/comptes")
    public Compte save(@RequestBody Compte compte){
        return cr.save(compte);
    }
    @PutMapping("/comptes/{id}")
    public Compte update(@RequestBody Compte compte,@PathVariable Long id){
        compte.setId(id);
        return cr.save(compte);
    }
    @DeleteMapping("/comptes/{id}")
    public void delete(@PathVariable Long id){
        cr.deleteById(id);
    }

}
