package client;

import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToTND(100));
        System.out.println(proxy.getCompte(123));
        System.out.println(proxy.getComptes());
    }

}
