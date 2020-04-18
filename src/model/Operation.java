package model;

public class Operation {

    private long numOperation;
    private String typeOperation;
    private double montant;
    private Compte compte ;

    public Operation() {

    }

    public Operation(long numOperation, String typeOperation, double montant) {
        this.numOperation = numOperation;
        this.typeOperation = typeOperation;
        this.montant = montant;
    }
}
