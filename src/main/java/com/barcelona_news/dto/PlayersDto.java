package com.barcelona_news.dto;

import java.util.Date;

/**
 * Created by N-Zepa on 14-Feb-18.
 */
public class PlayersDto {
    //region private variables
    private Integer playerID;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private String nationality;
    private String playingPosition;
    private Integer jerseyNumber;
    private String preferredFoot;
    private byte[] playerPhoto;
    //endregion

    //region setters and getters

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlayingPosition() {
        return playingPosition;
    }

    public void setPlayingPosition(String playingPosition) {
        this.playingPosition = playingPosition;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public byte[] getPlayerPhoto() {
        return playerPhoto;
    }

    public void setPlayerPhoto(byte[] playerPhoto) {
        this.playerPhoto = playerPhoto;
    }

    //endregion
}

