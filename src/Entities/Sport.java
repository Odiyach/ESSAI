package Entities;

public class Sport implements ISport, ISportCollectif
{
    private String nomSport;
    private int nbJoueurs;

    public Sport(String nomSport, int nbJoueurs)
    {
        this.nomSport = nomSport;
        this.nbJoueurs = nbJoueurs;
    }

    @Override
    public String getDescription() {
        return nomSport + nbJoueurs;
    }

    public String getNomSport()
    {
        return nomSport;
    }

    public int getNbJoueurs()
    {
        return nbJoueurs;
    }
}
