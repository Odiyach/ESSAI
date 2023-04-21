package Tools;

import Entities.Club;
import Entities.Sport;
import Entities.SportBallon;
import Entities.SportRelais;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {
    private String[] colonnes;
    private Object[][] lignes;

    @Override // ca veut dire que cette methode on la reimplemente mais surtout elle existe ds la classe mere
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    public String getColumnName(int columnIndex) {
        return colonnes[columnIndex];
    }

    public void LoadDatasClub(ArrayList<Club>desClubs)
    {
        colonnes = new String[]{"Numéro", "Nom", "Nb Points"};
        lignes = new Object[desClubs.size()][3];
        int i = 0;
        for (Club clb : desClubs) {
            lignes[i][0] = clb.getId();
            lignes[i][1] = clb.getNom();
            lignes[i][2] = clb.getNbPoints();
            i++;
        }
    }


        public void LoadDatasSport(ArrayList<Sport> desSports)
        {
            colonnes = new String[]{"Nom", "Nombre Joueurs", "Description", "Largeur T", "Longeur T", "Distance"};
            lignes = new Object[desSports.size()][6];
            int i = 0;
            for (Sport s : desSports)
            {
                lignes[i][0] = s.getNomSport();
                lignes[i][1] = s.getNbJoueurs();
                lignes[i][2] = s.getDescription();

                if (s instanceof SportRelais)

                {
                    lignes[i][3] = ((SportRelais) s).getDistance();

                }
                if (s instanceof SportBallon)
                {

                    lignes[i][4] = ((SportBallon) s).getLargeur();
                    lignes[i][5] = ((SportBallon)s).getLongeur();
                }
                i++;

            }
            fireTableChanged(null);

        }
    }


