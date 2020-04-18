package dao;

import model.Client;
import model.Compte;
import model.Operation;

import java.util.List;

public interface IGestionCompte {

    public Compte getCompte(long numCompt);
    public Client getClient(long numClient);
    public List<Operation> getAllOperation(long numCompt);
    public void addOperation(Operation op);
    public void updateCompte(int num, double montant);

}
