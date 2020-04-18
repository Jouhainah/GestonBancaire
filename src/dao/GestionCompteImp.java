package dao;

import model.Client;
import model.Compte;
import model.Operation;

import java.util.List;

public class GestionCompteImp implements IGestionCompte {


    @Override
    public Compte getCompte(long numCompt) {
        return null;
    }

    @Override
    public Client getClient(long numClient) {
        return null;
    }

    @Override
    public List<Operation> getAllOperation(long numCompt) {
        return null;
    }

    @Override
    public void addOperation(Operation op) {

    }

    @Override
    public void updateCompte(int num, double montant) {

    }
}
