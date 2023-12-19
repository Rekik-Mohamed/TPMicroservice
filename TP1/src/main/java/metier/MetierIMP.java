package metier;


import dao.IDao;

public class MetierIMP implements IMetier {
    private IDao dao;
    public double calcul() {
        double nb = dao.getValue();
        return nb*2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
