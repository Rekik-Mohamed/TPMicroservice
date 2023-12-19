package org.sid.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name="CalculatriceWS")
public class CalculatriceService {
    @WebMethod(operationName = "somme")
    public double somme(@WebParam double a,@WebParam double b){
        return a+b;
    }
    @WebMethod(operationName = "soustraction")
    public double soustraction(@WebParam double a,@WebParam double b){
        return a-b;
    }
    @WebMethod(operationName = "multiplication")
    public double multiplication(@WebParam double a,@WebParam double b){
        return a*b;
    }
    @WebMethod(operationName = "division")
    public double division(@WebParam double a,@WebParam double b){
        return a/b;
    }

}
