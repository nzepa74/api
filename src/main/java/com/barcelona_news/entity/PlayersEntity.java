package com.barcelona_news.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by N-Zepa on 14-Feb-18.
 */

@Entity
@Table(name = "player")
@NamedQueries({
        @NamedQuery(name = "PlayersEntity.findAll", query = "from PlayersEntity c")
})
public class PlayersEntity {
    //region private variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerID")
    @JsonProperty
    private Integer playerID;


    @Column(name = "FirstName")
    @JsonProperty
    private String FirstName;

    @Column(name = "LastName")
    @JsonProperty
    private String lastName;
    //endregion

    //region setters and getters
    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion
}
