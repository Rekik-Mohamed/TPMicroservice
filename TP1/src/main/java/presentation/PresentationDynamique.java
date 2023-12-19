package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/config.txt"));
            String daoClassName=sc.next();
            System.out.println(daoClassName);
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            String metierClassName = sc.next();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method m = cMetier.getMethod("setDao",new Class[]{IDao.class});
            m.invoke(metier,new Object[]{dao});
            System.out.println(metier.calcul());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    }
