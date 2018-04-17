/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Bagisci;
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
    
}
