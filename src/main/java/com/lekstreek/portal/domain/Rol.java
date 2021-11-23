package com.lekstreek.portal.domain;

import java.time.*;
import java.util.*;
import javax.persistence.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 15-11-21.
 */
@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Relatie relatie;

    @Column(name = "rolnaam")
    private String rolnaam;

    @Column(name = "jeugdschaatsen")
    private Boolean jeugdschaatsen;

    @Column(name = "startdatum_rol")
    private LocalDate startdatumRol;

    @Column(name = "einddatum_rol")
    private LocalDate einddatumRol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Relatie getRelatie() {
        return relatie;
    }

    public void setRelatie(Relatie relatie) {
        this.relatie = relatie;
    }

    public String getRolnaam() {
        return rolnaam;
    }

    public void setRolnaam(String rolnaam) {
        this.rolnaam = rolnaam;
    }

    public Boolean getJeugdschaatsen() {
        return jeugdschaatsen;
    }

    public void setJeugdschaatsen(Boolean jeugdschaatsen) {
        this.jeugdschaatsen = jeugdschaatsen;
    }

    public LocalDate getStartdatumRol() {
        return startdatumRol;
    }

    public void setStartdatumRol(LocalDate startdatumRol) {
        this.startdatumRol = startdatumRol;
    }

    public LocalDate getEinddatumRol() {
        return einddatumRol;
    }

    public void setEinddatumRol(LocalDate einddatumRol) {
        this.einddatumRol = einddatumRol;
    }
}
