package org.example;
public class Validar {

   public boolean validarDatos(String usuario){
      String validate  = "^[a-zA-Z\\s]+$";
      return !usuario.matches(validate);
   }

   public  boolean validarEleccion(int eleccionUsuario){
      int [] posibilidadNumero = {0,1,2};
      for (int recorrerNumeros : posibilidadNumero ){
         if (eleccionUsuario == recorrerNumeros ){
            return  true;
         }
      }
      return  false;
   }



}