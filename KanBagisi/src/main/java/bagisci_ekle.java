
import Session.BagisciFacade;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Glsvn
 */
@ManagedBean()
@RequestScoped

public class bagisci_ekle {
@EJB
private BagisciFacade bf;
    
          private String ad;
          private String soyad;
          private String telefon;
          private String adres;
          private String il;
          private String kan_grubu;
          private String k_ad;
          private String k_sifre;
          private Short id;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getK_ad() {
        return k_ad;
    }

    public void setK_ad(String k_ad) {
        this.k_ad = k_ad;
    }

    public String getK_sifre() {
        return k_sifre;
    }

    public void setK_sifre(String k_sifre) {
        this.k_sifre = k_sifre;
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

    public String getKan_grubu() {
        return kan_grubu;
    }

    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
        
    }
    /*     public void ekle()
    {
        try{
        emp.Ekle(ad, soyad, telefon, adres, il, kan_grubu);
RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "BİLGİ", "BAŞARIYLA EKLENDİ!"));

        }
        catch(Exception e){
RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity."));
        }
        
    }*/

        public void ekle()
        {
            try {
                bf.ekle(id, ad, soyad, telefon, adres, il, ad, k_sifre, kan_grubu);
                System.out.println("adam king ekledi");
            } catch (Exception e) {
                System.out.println("ekleyemedi");
            }
        }
    
    
    

}
