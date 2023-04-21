package Entities;

public class SportBallon extends Sport implements ITerrain
{
    private int largeur;
    private int longeur;

    public SportBallon(String nomSport, int nbJoueurs, int uneLargeur, int uneLongeur)
    {
        super(nomSport, nbJoueurs);
        this.largeur = uneLargeur;
        this.longeur = uneLongeur;
    }

    public int getLargeur()
    {
        return largeur;
    }

    public int getLongeur()
    {
        return longeur;
    }
    public String getDescription()
    {
        return super.getDescription() + longeur + largeur;
    }
}
