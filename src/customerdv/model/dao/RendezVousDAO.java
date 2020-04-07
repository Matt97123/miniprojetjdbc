package customerdv.model.dao;

import customerdv.model.beans.RendezVous;
import javafx.beans.property.ObjectProperty;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RendezVousDAO extends DAO<RendezVous> {
    @Override
    public RendezVous find(long id) {
        RendezVous rdv = new RendezVous();

        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from rendez_vous where id="+id);
            while (rs.next()) {
                int bd_id = rs.getInt("id");
                Date bd_date_rdv = rs.getDate("date_rdv");
                String bd_periode_journee = rs.getString("periode_journee");
                String bd_nom_client = rs.getString("nom_client");
                String bd_lieu_rdv = rs.getString("lieu_rdv");
                String bd_tel_client = rs.getString("tel_client");
                String bd_mail_client = rs.getString("mail_client");

                rdv.setId((bd_id));
                rdv.setDateRdv(bd_date_rdv);
                rdv.setPeriodeJournee(bd_periode_journee);
                rdv.setNomClient(bd_nom_client);
                rdv.setLieuRdv(bd_lieu_rdv);
                rdv.setTelClient(bd_tel_client);
                rdv.setMailClient(bd_mail_client);
            }
            return rdv;
        } catch (Exception e) {
            System.out.println("RendezVousDAO: find(id) failed: " + e.getLocalizedMessage());
        }
      return null;
    }

    public RendezVous findByName(String name) {
        RendezVous rdv = new RendezVous();

        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from rendez_vous where nom_client='"+name+"'");
            while (rs.next()) {
                int bd_id = rs.getInt("id");
                Date bd_date_rdv = rs.getDate("date_rdv");
                String bd_periode_journee = rs.getString("periode_journee");
                String bd_nom_client = rs.getString("nom_client");
                String bd_lieu_rdv = rs.getString("lieu_rdv");
                String bd_tel_client = rs.getString("tel_client");
                String bd_mail_client = rs.getString("mail_client");

                rdv.setId((bd_id));
                rdv.setDateRdv(bd_date_rdv);
                rdv.setPeriodeJournee(bd_periode_journee);
                rdv.setNomClient(bd_nom_client);
                rdv.setLieuRdv(bd_lieu_rdv);
                rdv.setTelClient(bd_tel_client);
                rdv.setMailClient(bd_mail_client);
            }
            return rdv;
        } catch (Exception e) {
            System.out.println("RendezVousDAO: findByName(name) failed: " + e.getLocalizedMessage());
        }
        return null;
    }

    public ArrayList<RendezVous> findByDate(Date dateDebut, Date dateFin) {
        ArrayList<RendezVous> listRdv = new ArrayList<RendezVous>();


        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from rendez_vous where date_rdv between '"+dateDebut+"' " +
                    "and '"+dateFin+"'");
            while (rs.next()) {
                RendezVous rdv = new RendezVous();
                int bd_id = rs.getInt("id");
                Date bd_date_rdv = rs.getDate("date_rdv");
                String bd_periode_journee = rs.getString("periode_journee");
                String bd_nom_client = rs.getString("nom_client");
                String bd_lieu_rdv = rs.getString("lieu_rdv");
                String bd_tel_client = rs.getString("tel_client");
                String bd_mail_client = rs.getString("mail_client");

                rdv.setId((bd_id));
                rdv.setDateRdv(bd_date_rdv);
                rdv.setPeriodeJournee(bd_periode_journee);
                rdv.setNomClient(bd_nom_client);
                rdv.setLieuRdv(bd_lieu_rdv);
                rdv.setTelClient(bd_tel_client);
                rdv.setMailClient(bd_mail_client);

                listRdv.add(rdv);
            }
            return listRdv;
        } catch (Exception e) {
            System.out.println("RendezVousDAO: findByDate(dateDebut, dateFin) failed: " + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public RendezVous create(RendezVous obj) {
        try {
            Statement stmt = connect.createStatement();

            stmt.execute("INSERT INTO rendez_vous (date_rdv, periode_journee, nom_client, lieu_rdv, tel_client, mail_client) " +
                    "VALUES ('"+obj.getDateRdv()+"','"+obj.getPeriodeJournee()+"','"+obj.getNomClient()+"','"+obj.getLieuRdv()+"'" +
                    ",'"+obj.getTelClient()+"','"+obj.getMailClient()+"')");

            ResultSet rs = stmt.executeQuery("Select * from rendez_vous");

            rs.last();

            RendezVous rdv = new RendezVous();
            int bd_id = rs.getInt("id");
            Date bd_date_rdv = rs.getDate("date_rdv");
            String bd_periode_journee = rs.getString("periode_journee");
            String bd_nom_client = rs.getString("nom_client");
            String bd_lieu_rdv = rs.getString("lieu_rdv");
            String bd_tel_client = rs.getString("tel_client");
            String bd_mail_client = rs.getString("mail_client");

            rdv.setId((bd_id));
            rdv.setDateRdv(bd_date_rdv);
            rdv.setPeriodeJournee(bd_periode_journee);
            rdv.setNomClient(bd_nom_client);
            rdv.setLieuRdv(bd_lieu_rdv);
            rdv.setTelClient(bd_tel_client);
            rdv.setMailClient(bd_mail_client);

            return rdv;
        }
        catch (Exception e) {
            System.out.println("RendezVousDAO: create() failed: "+e.getLocalizedMessage());
        }
        return null;
    }
    // TODO: reprendre le créate pour cette fois mettre à jour un étudiant et le retourner.
    @Override
    public RendezVous update(RendezVous obj) {
        // TODO Auto-generated method stub
        return null;
    }

    //TODO: reprendre le create pour effacer un étudiant (on ne le retourne pas du coup)
    @Override
    public void delete(RendezVous obj) {
        // TODO Auto-generated method stub

    }
}
