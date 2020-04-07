package customerdv.model.beans;

import java.sql.Date;

public class RendezVous {
    private int id;
    private Date dateRdv;
    private String periodeJournee;
    private String nomClient;
    private String lieuRdv;
    private String telClient;
    private String mailClient;

    public RendezVous() { }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDateRdv() { return dateRdv; }
    public void setDateRdv(Date dateRdv) { this.dateRdv = dateRdv; }

    public String getPeriodeJournee() { return periodeJournee; }
    public void setPeriodeJournee(String periodeJournee) { this.periodeJournee = periodeJournee; }

    public String getNomClient() { return nomClient; }
    public void setNomClient(String nomClient) { this.nomClient = nomClient; }

    public String getLieuRdv() { return lieuRdv; }
    public void setLieuRdv(String lieuRdv) { this.lieuRdv = lieuRdv; }

    public String getTelClient() { return telClient; }
    public void setTelClient(String telClient) { this.telClient = telClient; }

    public String getMailClient() { return mailClient; }
    public void setMailClient(String mailClient) { this.mailClient = mailClient; }

    @Override
    public String toString() { return "Rdv le : " + dateRdv + " à " + lieuRdv + " avec " + nomClient; }
}
