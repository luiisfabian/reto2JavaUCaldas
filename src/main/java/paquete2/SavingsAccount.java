/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class SavingsAccount extends BankAccount{
    private String security_key;

    public SavingsAccount(String security_key, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.security_key = security_key;
    }

    /**
     * @return the security_key
     */
    public String getSecurity_key() {
        return security_key;
    }

    /**
     * @param security_key the security_key to set
     */
    public void setSecurity_key(String security_key) {
        this.security_key = security_key;
    }
    
    
    
    
    
}
