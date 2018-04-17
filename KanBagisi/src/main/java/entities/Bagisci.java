/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
    , @NamedQuery(name = "Bagisci.findByTc", query = "SELECT b FROM Bagisci b WHERE b.tc = :tc")
    , @NamedQuery(name = "Bagisci.findByBAd", query = "SELECT b FROM Bagisci b WHERE b.bAd = :bAd")
    , @NamedQuery(name = "Bagisci.findByBSoyad", query = "SELECT b FROM Bagisci b WHERE b.bSoyad = :bSoyad")
    , @NamedQuery(name = "Bagisci.findByBTel", query = "SELECT b FROM Bagisci b WHERE b.bTel = :bTel")
    , @NamedQuery(name = "Bagisci.findByBAdres", query = "SELECT b FROM Bagisci b WHERE b.bAdres = :bAdres")
    , @NamedQuery(name = "Bagisci.findByBKangrubu", query = "SELECT b FROM Bagisci b WHERE b.bKangrubu = :bKangrubu")
    , @NamedQuery(name = "Bagisci.findByBIl", query = "SELECT b FROM Bagisci b WHERE b.bIl = :bIl")
    , @NamedQuery(name = "Bagisci.findByUyeNo", query = "SELECT b FROM Bagisci b WHERE b.uyeNo = :uyeNo")})
public class Bagisci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TC")
    private Long tc;
    @Size(max = 2147483647)
    @Column(name = "b_ad")
    private String bAd;
    @Size(max = 2147483647)
    @Column(name = "b_soyad")
    private String bSoyad;
    @Size(max = 2147483647)
    @Column(name = "b_tel")
    private String bTel;
    @Size(max = 2147483647)
    @Column(name = "b_adres")
    private String bAdres;
    @Size(max = 2147483647)
    @Column(name = "b_kangrubu")
    private String bKangrubu;
    @Size(max = 2147483647)
    @Column(name = "b_il")
    private String bIl;
    @Basic(optional = false)
    @Column(name = "uye_no")
    private int uyeNo;
    @JoinColumn(name = "TC", referencedColumnName = "K_no", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Kayitlibagisci kayitlibagisci;

    public Bagisci() {
    }

    public Bagisci(Long tc) {
        this.tc = tc;
    }

    public Bagisci(Long tc, int uyeNo) {
        this.tc = tc;
        this.uyeNo = uyeNo;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public String getBAd() {
        return bAd;
    }

    public void setBAd(String bAd) {
        this.bAd = bAd;
    }

    public String getBSoyad() {
        return bSoyad;
    }

    public void setBSoyad(String bSoyad) {
        this.bSoyad = bSoyad;
    }

    public String getBTel() {
        return bTel;
    }

    public void setBTel(String bTel) {
        this.bTel = bTel;
    }

    public String getBAdres() {
        return bAdres;
    }

    public void setBAdres(String bAdres) {
        this.bAdres = bAdres;
    }

    public String getBKangrubu() {
        return bKangrubu;
    }

    public void setBKangrubu(String bKangrubu) {
        this.bKangrubu = bKangrubu;
    }

    public String getBIl() {
        return bIl;
    }

    public void setBIl(String bIl) {
        this.bIl = bIl;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    public Kayitlibagisci getKayitlibagisci() {
        return kayitlibagisci;
    }

    public void setKayitlibagisci(Kayitlibagisci kayitlibagisci) {
        this.kayitlibagisci = kayitlibagisci;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tc != null ? tc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bagisci)) {
            return false;
        }
        Bagisci other = (Bagisci) object;
        if ((this.tc == null && other.tc != null) || (this.tc != null && !this.tc.equals(other.tc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bagisci[ tc=" + tc + " ]";
    }
    
}
