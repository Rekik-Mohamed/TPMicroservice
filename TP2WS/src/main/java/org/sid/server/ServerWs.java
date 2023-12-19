package org.sid.server;

import jakarta.xml.ws.Endpoint;
import org.sid.service.CalculatriceService;

public class ServerWs {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8084/",new CalculatriceService());
        System.out.println("web server deployé");
    }
}
