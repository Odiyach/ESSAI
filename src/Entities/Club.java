package Entities;

import java.util.ArrayList;

public class Club implements Comparable<Club>
{
    private int id;
    private String nom;
    private int nbPoints;
    ArrayList<Sport>lesSports;

    public Club(int id, String nom, int nbPoints)
    {
        this.id = id;
        this.nom = nom;
        this.nbPoints = nbPoints;
        lesSports = new ArrayList<>();
    }

    public void AjouterSport(Sport nouveauSport)
    {
        lesSports.add(nouveauSport);
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public ArrayList<Sport> getLesSports()
    {
        return lesSports;
    }

    @Override
    public int compareTo(Club o)
    {
        return Integer.compare(this.nbPoints,o.nbPoints);
    }
}
