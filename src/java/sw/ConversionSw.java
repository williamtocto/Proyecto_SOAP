/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
@WebService(serviceName = "ConversionSw")
public class ConversionSw {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
              System.out.println("fwefasfes");
        return "Hello " + txt + " !";
  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "Euros") double Euros) {
        //TODO write your implementation code here:
        return Euros * 1.25;
    }

    @WebMethod(operationName = "validarUsuario")
    public boolean validarUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia) {
        //TODO write your implementation code here:
        String usu = "admin";
        String contra= "123456";

        if (usuario.equals(usu)) {
            if (contrasenia.equals(contra)) {
                return true;
            }
        } else {
        }
        return false;

    }
    
    
    @WebMethod(operationName = "Operacion")
    public Double operaciones(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2,@WebParam(name = "op") String op){
        //TODO write your implementation code here:
        double resultado = 0;
        if (op.equals("suma")) {
           resultado=num1+num2;
       
        }else if(op.equals("resta")){
            resultado=num1-num2;
         
        }else if(op.equals("multiplicacion")){
            resultado=num1*num2;
        
        }else if(op.equals("division")){
            resultado=num1/num2;
        }
        return resultado;
    }
    
     @WebMethod(operationName = "Formulas")
    public Double formula(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2,@WebParam(name = "op") String op){
        //TODO write your implementation code here:
        double resultado = 0;
        if (op.equals("distancia")) {
           resultado=num1*num2;
       
        }else if(op.equals("velocidad")){
            resultado=num1/num2;
         
        }else if(op.equals("tiempo")){
            resultado=num1/num2;
        
        }
        return resultado;
    }
    

    
}
