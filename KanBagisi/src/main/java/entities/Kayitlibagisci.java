/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Glsvn
 */
@Entity
@Table(name = "Kayitli_bagisci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kayitlibagisci.findAll", query = "SELECT k FROM Kayitlibagisci k")
    , @NamedQuery(name = "Kayitlibagisci.findByKno", query = "SELECT k FROM Kayitlibagisci k WHERE k.kno = :kno")
    , @NamedQuery(name = "Kayitlibagisci.findByKad", query = "SELECT k FROM Kayitlibagisci k WHERE k.kad = :kad")
    , @NamedQuery(name = "Kayitlibagisci.findByKsifre", query = "SELECT k FROM Kayitlibagisci k WHERE k.ksifre = :ksifre")
    , @NamedQuery(name = "Kayitlibagisci.findByKsil", query = "SELECT k FROM Kayitlibagisci k WHERE k.ksil = :ksil")})
public class Kayitlibagisci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "K_no")
    private Integer kno;
    @Size(max = 2147483647)
    @Column(name = "K_ad")
    private String kad;
    @Size(max = 2147483647)
    @Column(name = "K_sifre")
    private String ksifre;
    @Column(name = "K_sil")
    private Boolean ksil;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "kayitlibagisci")
    private Bagisci bagisci;

    public Kayitlibagisci() {
    }

    public Kayitlibagisci(Integer kno) {
        this.kno = kno;
    }

    public Integer getKno() {
        return kno;
    }

    public void setKno(Integer kno) {
        this.kno = kno;
    }

    public String getKad() {
        return kad;
    }

    public void setKad(String kad) {
        this.kad = kad;
    }

    public String getKsifre() {
        return ksifre;
    }

    public void setKsifre(String ksifre) {
        this.ksifre = ksifre;
    }

    public Boolean getKsil() {
        return ksil;
    }

    public void setKsil(Boolean ksil) {
        this.ksil = ksil;
    }

    public Bagisci getBagisci() {
        return bagisci;
    }

    public void setBagisci(Bagisci bagisci) {
        this.bagisci = bagisci;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kno != null ? kno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kayitlibagisci)) {
            return false;
        }
        Kayitlibagisci other = (Kayitlibagisci) object;
        if ((this.kno == null && other.kno != null) || (this.kno != null && !this.kno.equals(other.kno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Kayitlibagisci[ kno=" + kno + " ]";
    }
    
}
