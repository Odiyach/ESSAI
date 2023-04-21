package Vues;

import Entities.Club;
import Entities.Sport;
import Entities.SportBallon;
import Entities.SportRelais;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

public class FrmPrincipal extends JFrame
{

    private JPanel pnlRoot;
    private JTable tblClub;
    private JTable tblSport;
    Club clubSelectionne;

    private ModelJTable mdl;


    public FrmPrincipal() {
        this.setTitle("");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);


        ArrayList<Club> lesClubs = new ArrayList<>();
        ArrayList<Sport> lesSports = new ArrayList<>();

        Club c1 = new Club(1, "Dijon", 63);
        Club c2 = new Club(2, "PSG", 67);
        Club c3 = new Club(3, "Nantes", 65);

        SportBallon sb = new SportBallon("Basketball", 5, 45, 35);
        c1.AjouterSport(sb);


        Sport s1 = new Sport("Javelot", 1);
        Sport s2 = new Sport("Judo", 1);
        SportBallon sb1 = new SportBallon("Football", 11, 105, 68);
        SportBallon sb2 = new SportBallon("Handball", 7, 65, 35);
        SportRelais sr1 = new SportRelais("4 * 100", 4, 400);

        c2.AjouterSport(s1);
        c2.AjouterSport(s2);
        c2.AjouterSport(sb1);
        c2.AjouterSport(sb2);
        c2.AjouterSport(sr1);

        Sport s3 = new Sport("Cyclisme", 1);
        SportBallon sb3 = new SportBallon("Football", 11, 105, 68);
        SportBallon sb4 = new SportBallon("Rugby", 15, 115, 65);
        SportRelais sr2 = new SportRelais("100 mètres", 1, 100);

        c3.AjouterSport(s3);
        c3.AjouterSport(sb3);
        c3.AjouterSport(sb4);
        c3.AjouterSport(sr2);

        Collections.sort(lesClubs);

        mdl = new ModelJTable();
        mdl.LoadDatasClub(lesClubs);
        tblClub.setModel(mdl);


        tblClub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int numClub = Integer.parseInt(tblClub.getValueAt(tblClub.getSelectedRow(),0).toString());
                for (Club clb : lesClubs)
                {
                    if(clb.getId() == numClub)
                    {
                        mdl = new ModelJTable();
                        mdl.LoadDatasSport(clb.getLesSports());
                        tblSport.setModel(mdl);
                        clubSelectionne = clb;
                        break;
                    }
                }
            }
        });
    }




















}
