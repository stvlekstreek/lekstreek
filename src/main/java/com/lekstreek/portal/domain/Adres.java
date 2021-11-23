package com.lekstreek.portal.domain;

import java.util.*;
import javax.persistence.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 15-11-21.
 */
@Entity
@Table(name = "Adres")
public class Adres {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "straatnaam")
    private String straatnaam;

    @Column(name = "huisnummer")
    private Integer huisnummer;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "woonplaats")
    private String woonplaats;

    @Column(name = "land")
    private String land;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public Integer getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(Integer huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
