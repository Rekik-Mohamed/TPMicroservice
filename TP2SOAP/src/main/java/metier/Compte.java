package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date datedecreation;
    public Compte() {
    }
    public Compte(int code, double solde, Date datedecreation) {
        this.code = code;
        this.solde = solde;
        this.datedecreation = datedecreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatedecreation() {
        return datedecreation;
    }

    public void setDatedecreation(Date datedecreation) {
        this.datedecreation = datedecreation;
    }


}
