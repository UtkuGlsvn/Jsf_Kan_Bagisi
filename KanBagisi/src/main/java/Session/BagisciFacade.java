/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.Bagisci;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Glsvn
 */
@Stateless
public class BagisciFacade extends AbstractFacade<Bagisci> {

    @PersistenceContext(unitName = "com.mycompany_Kan_Bagisi_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BagisciFacade() {
        super(Bagisci.class);
    }
    
    
    public void ekle(Short id,String ad,String soyad, String telefon, String adres,String il,String kAd,String kSfire,String KanGrubu)
    {
     try {
         Bagisci mBagisci = new Bagisci(id, ad, soyad, telefon, adres, il, kAd, kSfire, Boolean.TRUE, KanGrubu);
         em.persist(mBagisci);
     }   catch (Exception e)
     {
         throw new EJBException(e.getLocalizedMessage());
                 
     }
        
    }
}
