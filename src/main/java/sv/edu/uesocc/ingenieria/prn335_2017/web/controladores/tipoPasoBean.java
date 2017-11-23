
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPasoFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;



@Named(value = "tipoPasoBean")
@ViewScoped
public class tipoPasoBean  extends  GenericManagedBean<TipoPaso> implements Serializable  {
   
     public tipoPasoBean() {
    }
/**
     * Creates a new instance of UsuarioBean
     */
     
    
    
    @EJB
    TipoPasoFacadeLocal facade;
    TipoPaso usuarioEntity;
    boolean mostrar = false, crudBtns=true;  

    // <editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public TipoPasoFacadeLocal getFacade() {
        return facade;
    }

    public boolean isMostrar() {
        return mostrar;
    }

    public boolean isCrudBtns() {
        return crudBtns;
    }

    public void setCrudBtns(boolean crudBtns) {
        this.crudBtns = crudBtns;
    }

    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }

    public void setFacade(TipoPasoFacadeLocal facade) {
        this.facade = facade;
    }

    public TipoPaso getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(TipoPaso usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public List<TipoPaso> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<TipoPaso> listaDatos) {
        this.listaDatos = listaDatos;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Overrrides">
    @Override
    public TipoPaso getEntity() {
        return usuarioEntity;
    }

    

   

    @Override
    public void nuevo() {
        usuarioEntity = new TipoPaso();
        setMostrar(true);
        setCrudBtns(true);
    }
    
    @Override
    public void cancelar(){
        usuarioEntity = new TipoPaso();
        setMostrar(false);
        setCrudBtns(true);
    }
    
    // </editor-fold>

    @PostConstruct
    public void init() {
    //    llenarLista();
    }
    
    /**
     * Este metodo sirve para mostrar el la fila seleccionada en un formulario para ser editado o eliminado
     * @param event 
     */
    public void onRowSelect(SelectEvent event) {
        setCrudBtns(false);
        setMostrar(true);
    }

    @Override
    protected GenericFacadeLocal<TipoPaso> getFacadeLocal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}

