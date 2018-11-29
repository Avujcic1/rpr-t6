package t6;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleStringProperty ime = new SimpleStringProperty("");
    private SimpleStringProperty prezime = new SimpleStringProperty("");
    private SimpleIntegerProperty index = new SimpleIntegerProperty(0);
    private SimpleIntegerProperty JMBG = new SimpleIntegerProperty(0);
    private SimpleStringProperty datumRodjenja = new SimpleStringProperty("");
    private SimpleStringProperty mjestoRodjenja = new SimpleStringProperty("");
    private SimpleStringProperty adresa = new SimpleStringProperty("");
    private SimpleStringProperty kontaktTelefon = new SimpleStringProperty("");
    private SimpleStringProperty emailAdresa = new SimpleStringProperty("0");
    private SimpleStringProperty odsjek = new SimpleStringProperty("0");
    private SimpleStringProperty godinaStudija = new SimpleStringProperty("");
    private SimpleStringProperty ciklusStudija = new SimpleStringProperty("");
    private SimpleStringProperty statusStudenta = new SimpleStringProperty("");
    private SimpleBooleanProperty borackaKategorija = new SimpleBooleanProperty(false);

    public Student(SimpleStringProperty ime, SimpleStringProperty prezime, SimpleIntegerProperty brojIndexa, SimpleIntegerProperty JMBG, SimpleStringProperty datum, SimpleStringProperty mjestoRodjenja, SimpleStringProperty adresa, SimpleStringProperty telefon, SimpleStringProperty email, SimpleStringProperty odsjek, SimpleStringProperty godinaStudija, SimpleStringProperty ciklusStudija, SimpleStringProperty status, SimpleBooleanProperty borackaKategorija) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = brojIndexa;
        this.JMBG = JMBG;
        this.datumRodjenja = datum;
        this.mjestoRodjenja = mjestoRodjenja;
        this.adresa = adresa;
        this.kontaktTelefon = telefon;
        this.emailAdresa = email;
        this.odsjek = odsjek;
        this.godinaStudija = godinaStudija;
        this.ciklusStudija = ciklusStudija;
        this.statusStudenta = status;
        this.borackaKategorija = borackaKategorija;
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public int getJMBG() {
        return JMBG.get();
    }

    public SimpleIntegerProperty JMBGProperty() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG.set(JMBG);
    }

    public int getBrojIndexa() {
        return index.get();
    }

    public SimpleIntegerProperty brojIndexaProperty() {
        return index;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.index.set(brojIndexa);
    }

    public String getDatumRodjenja() {
        return datumRodjenja.get();
    }

    public SimpleStringProperty datumRodjenjaProperty() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datum) {
        this.datumRodjenja.set(datum);
    }

    public String getMjestoRodjenja() {
        return mjestoRodjenja.get();
    }

    public SimpleStringProperty mjestoRodjenjaProperty() {
        return mjestoRodjenja;
    }

    public void setMjestoRodjenja(String mjestoRodjenja) {
        this.mjestoRodjenja.set(mjestoRodjenja);
    }

    public String getAdresa() {
        return adresa.get();
    }

    public SimpleStringProperty adresaProperty() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa.set(adresa);
    }

    public String getTelefon() {
        return kontaktTelefon.get();
    }

    public SimpleStringProperty telefonProperty() {
        return kontaktTelefon;
    }

    public void setTelefon(String telefon) {
        this.kontaktTelefon.set(telefon);
    }

    public String getEmail() {
        return emailAdresa.get();
    }

    public SimpleStringProperty emailProperty() {
        return emailAdresa;
    }

    public void setEmail(String email) {
        this.emailAdresa.set(email);
    }

    public String getOdsjek() {
        return odsjek.get();
    }

    public SimpleStringProperty odsjekProperty() {
        return odsjek;
    }

    public void setOdsjek(String odsjek) {
        this.odsjek.set(odsjek);
    }

    public String getGodinaStudija() {
        return godinaStudija.get();
    }

    public SimpleStringProperty godinaStudijaProperty() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija.set(godinaStudija);
    }

    public String getCiklusStudija() {
        return ciklusStudija.get();
    }

    public SimpleStringProperty ciklusStudijaProperty() {
        return ciklusStudija;
    }

    public void setCiklusStudija(String ciklusStudija) {
        this.ciklusStudija.set(ciklusStudija);
    }

    public String getStatus() {
        return statusStudenta.get();
    }

    public SimpleStringProperty statusProperty() {
        return statusStudenta;
    }

    public void setStatus(String status) {
        this.statusStudenta.set(status);
    }

    public boolean isBorackaKategorija() {
        return borackaKategorija.get();
    }

    public SimpleBooleanProperty borackaKategorijaProperty() {
        return borackaKategorija;
    }

    public void setBorackaKategorija(boolean borackaKategorija) {
        this.borackaKategorija.set(borackaKategorija);
    }
}
