package model;

import java.util.ArrayList;

public class Compte {

    static int nbcomptes = 0;
    private long numCompt;
    private String dateCreation;
    private double solde;
    private double typeCompt ;
    private Client client;
    private ArrayList<Operation> operation = new ArrayList<Operation>();

    public Compte() {
    }

    public Compte(Client client,String dateCreation, double solde, double typeCompt) {
        this.numCompt = nbcomptes + 1;
        this.client = client;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.typeCompt = typeCompt;

    }

    public Compte(Client client,String dateCreation, double solde, double typeCompt,  ArrayList<Operation> operation) {
        this.numCompt = nbcomptes + 1;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.typeCompt = typeCompt;
        this.client = client;
        this.operation = operation;
    }
}
