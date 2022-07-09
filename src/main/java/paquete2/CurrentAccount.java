/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class CurrentAccount extends BankAccount{
    private int pin;
    private int movement_security_code;

    public CurrentAccount(int pin, int movement_security_code, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.pin = pin;
        this.movement_security_code = movement_security_code;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the movement_security_code
     */
    public int getMovement_security_code() {
        return movement_security_code;
    }

    /**
     * @param movement_security_code the movement_security_code to set
     */
    public void setMovement_security_code(int movement_security_code) {
        this.movement_security_code = movement_security_code;
    }
    
    
    
    
}
