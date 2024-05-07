/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opplabass1;

/**
 *
 * @author lanam
 */
public class InvalidDepositException extends Exception {
    @Override
    public String getMessage(){
        return "invalid proccess .. Please try again and enter valid values!";
    }
    
}
