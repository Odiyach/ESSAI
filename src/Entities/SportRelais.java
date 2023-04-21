package Entities;

public class SportRelais extends Sport
{
    private int distance;

    public SportRelais(String nomSport, int nbJoueurs, int uneDistance)
    {
        super(nomSport, nbJoueurs);
        this.distance = uneDistance;
    }

    public int getDistance()
    {
        return distance;
    }

    public String getDescription()
    {
        return super.getDescription() + distance;
    }
}
