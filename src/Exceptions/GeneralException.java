/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author juanvmr
 */
public class GeneralException extends Exception{
    public GeneralException(){
        super("Erro desconhecido");
    }
    
    public GeneralException(String erro){
        super(erro);
    }
}
