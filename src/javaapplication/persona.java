/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author sena
 */
public class persona {
    private int edad;
    private String nombre;
    private String id;
    private String tipo_Documento;
    public void setEdad(int edadParametro){
        this.edad= edadParametro;
        
        
    }
    public int getEdad() {
        return this.edad;
        

    }
    public void setNombre( String nombreParametro){
        this.nombre= nombreParametro;
        
        
    }
    public String getNombre() {
        return this.nombre;
    }    
        
       public void setid( String idParametro){
        this.id= idParametro;
     }      
    
    public String getId() {
        return this.id;         
    }
     public void setTipo_Documento( String tipo_DocumentoParametro){
        this.tipo_Documento= tipo_DocumentoParametro;
        
        
    }
    public String getTipo_Documento() {
        return this.tipo_Documento;
    }    

    
   
    
           
            public void andar () {}
            public void correr() {}
    
}
