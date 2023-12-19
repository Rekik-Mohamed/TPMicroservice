package com.example.msbanque2.web;

import com.example.msbanque2.entities.Compte;
import com.example.msbanque2.repositories.CompteRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository cr;
    @Path("/comptes") @GET @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> compteList(){
        return cr.findAll();
    }
    @Path("/comptes/{id}")
    @GET@Produces(MediaType.APPLICATION_JSON)
    public Compte getid(@PathParam("id") Long id){
        return cr.findById(id).get();
    }
    @Path("/comptes")
    @POST @Produces(MediaType.APPLICATION_JSON)
    public Compte save(Compte compte){
        return cr.save(compte);
    }
    @Path("/comptes/{id}")
    @PUT @Produces(MediaType.APPLICATION_JSON)
    public Compte update(Compte compte,@PathParam("id") Long id){
        compte.setId(id);
        return cr.save(compte);
    }
    @Path("/comptes/{id}")
    @DELETE @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id){
        cr.deleteById(id);
    }
}
