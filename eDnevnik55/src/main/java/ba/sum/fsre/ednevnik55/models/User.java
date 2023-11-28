package ba.sum.fsre.ednevnik55.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    String ime;
    String prezime;
    String email;

    public User() {}

    public User(long id, String ime, String prezime, String email) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }



    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
