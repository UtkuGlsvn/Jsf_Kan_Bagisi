/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Glsvn
 */
@Entity
@Table(name = "Bagisci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bagisci.findAll", query = "SELECT b FROM Bagisci b")
    , @NamedQuery(name = "Bagisci.findById", query = "SELECT b FROM Bagisci b WHERE b.id = :id")
    , @NamedQuery(name = "Bagisci.findByAd", query = "SELECT b FROM Bagisci b WHERE b.ad = :ad")
    , @NamedQuery(name = "Bagisci.findBySoyad", query = "SELECT b FROM Bagisci b WHERE b.soyad = :soyad")
    , @NamedQuery(name = "Bagisci.findByTelefon", query = "SELECT b FROM Bagisci b WHERE b.telefon = :telefon")
    , @NamedQuery(name = "Bagisci.findByAdres", query = "SELECT b FROM Bagisci b WHERE b.adres = :adres")
    , @NamedQuery(name = "Bagisci.findByIl", query = "SELECT b FROM Bagisci b WHERE b.il = :il")
    , @NamedQuery(name = "Bagisci.findByKAd", query = "SELECT b FROM Bagisci b WHERE b.kAd = :kAd")
    , @NamedQuery(name = "Bagisci.findByKSifre", query = "SELECT b FROM Bagisci b WHERE b.kSifre = :kSifre")
    , @NamedQuery(name = "Bagisci.findBySil", query = "SELECT b FROM Bagisci b WHERE b.sil = :sil")
    , @NamedQuery(name = "Bagisci.findByKanGrubu", query = "SELECT b FROM Bagisci b WHERE b.kanGrubu = :kanGrubu")})
public class Bagisci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Size(max = 2147483647)
    @Column(name = "ad")
    private String ad;
    @Size(max = 2147483647)
    @Column(name = "soyad")
    private String soyad;
    @Size(max = 2147483647)
    @Column(name = "telefon")
    private String telefon;
    @Size(max = 2147483647)
    @Column(name = "adres")
    private String adres;
    @Size(max = 2147483647)
    @Column(name = "il")
    private String il;
    @Size(max = 2147483647)
    @Column(name = "k_ad")
    private String kAd;
    @Size(max = 2147483647)
    @Column(name = "k_sifre")
    private String kSifre;
    @Column(name = "sil")
    private Boolean sil;
    @Size(max = 2147483647)
    @Column(name = "kan_grubu")
    private String kanGrubu;

    public Bagisci() {
    }
 public Bagisci(Short id, String ad,String soyad, String telefon, String adres,String il,String kAd,String kSfire,Boolean sil,String KanGrubu) {
     //Tüm datalar
     this.id =id;
     this.ad = ad;
     this.soyad = soyad;
     this.telefon = telefon;
     this.adres = adres;
     this.il = il;
     this.kAd= kAd;
     this.kSifre = kSfire;
     this.sil=sil;
     this.kanGrubu=KanGrubu;
    }
  public Bagisci(String ad,String soyad, String telefon, String adres,String il,String kAd,String kSfire,String KanGrubu) {
      //Ekleme id(oto),sil(sabit=true)
     this.ad = ad;
     this.soyad = soyad;
     this.telefon = telefon;
     this.adres = adres;
     this.il = il;
     this.kAd= kAd;
     this.kSifre = kSfire;
     this.sil=sil;
     this.kanGrubu=KanGrubu;
    }
    public Bagisci(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getKAd() {
        return kAd;
    }

    public void setKAd(String kAd) {
        this.kAd = kAd;
    }

    public String getKSifre() {
        return kSifre;
    }

    public void setKSifre(String kSifre) {
        this.kSifre = kSifre;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public String getKanGrubu() {
        return kanGrubu;
    }

    public void setKanGrubu(String kanGrubu) {
        this.kanGrubu = kanGrubu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bagisci)) {
            return false;
        }
        Bagisci other = (Bagisci) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Bagisci[ id=" + id + " ]";
    }
    
}
