package MyGamers.Entity;

import MyGamers.Entity.Game;

import java.time.LocalDate;
import java.util.List;

public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String citizenId;
    private LocalDate dateOfBirth;
    private List<Game> games;

    public Gamer() {
    }

    public Gamer(int id, String firstName, String lastName, String citizenId, LocalDate dateOfBirth, List<Game> games) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenId = citizenId;
        this.dateOfBirth = dateOfBirth;
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " +lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
