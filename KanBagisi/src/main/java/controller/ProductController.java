/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Bagisci;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import model.BagisciFacade;

/**
 *
 * @author Glsvn
 */
@ManagedBean
@SessionScoped
public class ProductController {

    @EJB
    private BagisciFacade bagisciFacade;
    private Bagisci p = new Bagisci();

    public Bagisci getP() {
        return p;
    }

    public void setP(Bagisci p) {
        this.p = p;
    }
    

    
    public ProductController() {
        
    }
    public List<Bagisci> findAll()//bagışçıdan tüm verileri al
    {
        return this.bagisciFacade.findAll();
    }
    public String add()//ekleme
    {
        this.bagisciFacade.create(this.p);
        return "index";
    }
    
}
