package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToTND")
    public double conversion(@WebParam(name="montant") double mnt){
        return mnt*3.42;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code){
        return new Compte(code,1000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        ArrayList<Compte> c = new ArrayList<>();
        c.add(new Compte(123,1000,new Date()));
        c.add(new Compte(124,500,new Date()));
        return c;
    }
}
