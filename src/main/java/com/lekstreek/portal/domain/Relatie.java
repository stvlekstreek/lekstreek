package com.lekstreek.portal.domain;

import java.time.*;
import java.util.*;
import javax.persistence.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 15-11-21.
 */
@Entity
@Table(name = "Relatie")
public class Relatie {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "voornaam")
    private String voornaam;

    @Column(name = "achternaam")
    private String achternaam;

    @Column(name = "initialen")
    private String initialen;

    @Column(name = "weergavenaam")
    private String weergavenaam;

    @Enumerated(EnumType.STRING)
    @Column(name = "geslacht")
    private Geslacht geslacht;

    @Column(name = "geboortedatum")
    private LocalDate geboortedatum;

    @ManyToOne
    @JoinColumn(name = "adres_id")
    private Adres adres;

    @Enumerated(EnumType.STRING)
    @Column(name = "relatietype")
    private RelatieType relatietype;

    @Column(name = "inschrijvingsdatum")
    private Instant inschrijvingsdatum;

    @Column(name = "email")
    private String email;

    @Column(name = "email_2")
    private String email2;

    @Column(name = "telefoonnummer")
    private Integer telefoonnummer;

    @Column(name = "telefoonnummer_2")
    private Integer telefoonnummer2;

    @Column(name = "telefoonnummer_3")
    private Integer telefoonnummer3;

    @Column(name = "ibancode")
    private String ibancode;

    @Column(name = "knsb_relatienummer")
    private Long knsbRelatienummer;

    @Lob
    @Column(name = "pasfoto")
    private byte[] pasfoto;

    @Column(name = "pasfoto_content_type")
    private String pasfotoContentType;

    @Lob
    @Column(name = "privacy_verklaring")
    private byte[] privacyVerklaring;

    @Column(name = "privacy_verklaring_content_type")
    private String privacyVerklaringContentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getInitialen() {
        return initialen;
    }

    public void setInitialen(String initialen) {
        this.initialen = initialen;
    }

    public String getWeergavenaam() {
        return weergavenaam;
    }

    public void setWeergavenaam(String weergavenaam) {
        this.weergavenaam = weergavenaam;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public RelatieType getRelatietype() {
        return relatietype;
    }

    public void setRelatietype(RelatieType relatietype) {
        this.relatietype = relatietype;
    }

    public Instant getInschrijvingsdatum() {
        return inschrijvingsdatum;
    }

    public void setInschrijvingsdatum(Instant inschrijvingsdatum) {
        this.inschrijvingsdatum = inschrijvingsdatum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Integer getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(Integer telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public Integer getTelefoonnummer2() {
        return telefoonnummer2;
    }

    public void setTelefoonnummer2(Integer telefoonnummer2) {
        this.telefoonnummer2 = telefoonnummer2;
    }

    public Integer getTelefoonnummer3() {
        return telefoonnummer3;
    }

    public void setTelefoonnummer3(Integer telefoonnummer3) {
        this.telefoonnummer3 = telefoonnummer3;
    }

    public String getIbancode() {
        return ibancode;
    }

    public void setIbancode(String ibancode) {
        this.ibancode = ibancode;
    }

    public Long getKnsbRelatienummer() {
        return knsbRelatienummer;
    }

    public void setKnsbRelatienummer(Long knsbRelatienummer) {
        this.knsbRelatienummer = knsbRelatienummer;
    }

    public byte[] getPasfoto() {
        return pasfoto;
    }

    public void setPasfoto(byte[] pasfoto) {
        this.pasfoto = pasfoto;
    }

    public String getPasfotoContentType() {
        return pasfotoContentType;
    }

    public void setPasfotoContentType(String pasfotoContentType) {
        this.pasfotoContentType = pasfotoContentType;
    }

    public byte[] getPrivacyVerklaring() {
        return privacyVerklaring;
    }

    public void setPrivacyVerklaring(byte[] privacyVerklaring) {
        this.privacyVerklaring = privacyVerklaring;
    }

    public String getPrivacyVerklaringContentType() {
        return privacyVerklaringContentType;
    }

    public void setPrivacyVerklaringContentType(String privacyVerklaringContentType) {
        this.privacyVerklaringContentType = privacyVerklaringContentType;
    }
}
