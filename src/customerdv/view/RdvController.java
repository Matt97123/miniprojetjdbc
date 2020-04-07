package customerdv.view;

import customerdv.MainApp;
import customerdv.model.beans.RendezVous;
import customerdv.model.dao.RendezVousDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Date;
import java.util.ArrayList;

public class RdvController {
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private TextField dateRdvField;
    @FXML
    private TextField periodeJourneeField;
    @FXML
    private TextField nomClientField;
    @FXML
    private TextField lieuRdvField;
    @FXML
    private TextField telClientField;
    @FXML
    private TextField mailClientField;

    @FXML
    private TextField dateDebutField;
    @FXML
    private TextField dateFinField;

    public void fillView(RendezVous r) {
        label1.setText(String.valueOf(r.getDateRdv()));
        label2.setText(r.getPeriodeJournee());
        label3.setText(r.getNomClient());
    }
    public void onButtonClicked() {

        Date date = Date.valueOf(dateRdvField.getText());
        String periode = periodeJourneeField.getText();
        String nom = nomClientField.getText();
        String lieu = lieuRdvField.getText();
        String tel = telClientField.getText();
        String mail = mailClientField.getText();

        RendezVousDAO rdvDao = new RendezVousDAO();
        RendezVous rdv = new RendezVous();

        rdv.setDateRdv(date);
        rdv.setPeriodeJournee(periode);
        rdv.setNomClient(nom);
        rdv.setLieuRdv(lieu);
        rdv.setTelClient(tel);
        rdv.setMailClient(mail);

        rdvDao.create(rdv);
        rdv.setId(rdv.getId());

        System.out.println(rdv);

        this.fillView(rdv);
    }

    public ArrayList<RendezVous> onSearchClicked() {
        Date dateDebut = Date.valueOf(dateDebutField.getText());
        Date dateFin = Date.valueOf(dateFinField.getText());

        RendezVousDAO rdvDao = new RendezVousDAO();
        ArrayList<RendezVous> listRdv = rdvDao.findByDate(dateDebut, dateFin);
        MainApp ds = new MainApp();
        ds.showViewSearch();
        return listRdv;
    }
}
