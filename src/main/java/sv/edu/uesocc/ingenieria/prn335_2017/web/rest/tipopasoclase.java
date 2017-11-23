/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPasoFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;

/**
 *
 * @author nerioh
 */
@Path("tipoPaso")
public class tipopasoclase implements Serializable {

    @EJB
    private TipoPasoFacadeLocal tipoPasoFacadeLocal;

    /**
     * buscar en los repositorios de los registros de paginado
     *
     * @param first
     * @param last return
     */

    /**
      @GET 
      
      @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
      public List<TipoPaso>findRange(@DefaultValue("0") @QueryParam("first")
      int first,
      @DefaultValue("5") @QueryParam("last") int last ){ List salida=null; 
      try
      { if(tipoPasoFacadeLocal !=null)
      { tipoPasoFacadeLocal.findRange(first,
      last); } } catch (Exception ex)
      {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(),
      ex);
     
      }finally{ if(salida==null){ salida=new ArrayList(); } }
     
      return salida;
}
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<TipoPaso> findAll() {
        List<TipoPaso> salida = null;
        try {
            if (tipoPasoFacadeLocal != null) {
                salida = tipoPasoFacadeLocal.findAll();
            }
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            if (salida == null) {
                salida = new ArrayList();
            }
        }

        return salida;
    }

}
