package com.sabel.jpaBeispiel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String strasse;
    private String hausnummer;
    private String ort;
    private int plz;

    public Adresse() {
    }

    public Adresse(String strasse, String hausnummer, String ort, int plz) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", ort='" + ort + '\'' +
                ", plz=" + plz +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return plz == adresse.plz &&
                Objects.equals(strasse, adresse.strasse) &&
                Objects.equals(hausnummer, adresse.hausnummer) &&
                Objects.equals(ort, adresse.ort);
    }

    @Override
    public int hashCode() {

        return Objects.hash(strasse, hausnummer, ort, plz);
    }

    public String getStrasse() {

        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }
}
