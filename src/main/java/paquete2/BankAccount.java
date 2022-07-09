/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class BankAccount extends Client {
    private int number;
    private int secure_code;
    private String balance;
    
    public void cambiarClave(){
        
        System.out.println("cambiar clave bank acoount del cliente "+ getName_client() + "con cuenta de banco # "+ number);
        
        
    }
    
    public void cantidadCupo(){
        System.out.println("Cantida de cupo " +balance);
    }

    public BankAccount(int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(name_client, dni_client, email_client, job, date_of_birthday);
        this.number = number;
        this.secure_code = secure_code;
        this.balance = balance;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the secure_code
     */
    public int getSecure_code() {
        return secure_code;
    }

    /**
     * @param secure_code the secure_code to set
     */
    public void setSecure_code(int secure_code) {
        this.secure_code = secure_code;
    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    
    
    
}
