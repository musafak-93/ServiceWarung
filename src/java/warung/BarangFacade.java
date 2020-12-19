/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warung;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Musafak
 */
@Stateless
public class BarangFacade extends AbstractFacade<Barang> {

    @PersistenceContext(unitName = "ServiceWarungPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BarangFacade() {
        super(Barang.class);
    }
    
}
