/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Client {
    private String name_client;
    private int dni_client;
    private String email_client;
    private String job;
    private String date_of_birthday;
    
    
    public void sacarDinero(){
        System.out.println(" saca dinero el cliente de nombre  "+ getName_client() + " con Cedula " +  getDni_client() + " y correo " + getEmail_client() + " y trabaja como " + getJob() + " . su fecha de nacimiento es "+ getDate_of_birthday());
    }
    
    public void pedirPrestamo(){
        System.out.println(" se pude un prestamo para el cliente de nombre  "+ getName_client() + " con Cedula " +  getDni_client() + " y correo " + getEmail_client() + " y trabaja como " + getJob() + " . su fecha de nacimiento es "+ getDate_of_birthday());
        
    }

    public Client(String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        this.name_client = name_client;
        this.dni_client = dni_client;
        this.email_client = email_client;
        this.job = job;
        this.date_of_birthday = date_of_birthday;
    }

    /**
     * @return the name_client
     */
    public String getName_client() {
        return name_client;
    }

    /**
     * @param name_client the name_client to set
     */
    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    /**
     * @return the dni_client
     */
    public int getDni_client() {
        return dni_client;
    }

    /**
     * @param dni_client the dni_client to set
     */
    public void setDni_client(int dni_client) {
        this.dni_client = dni_client;
    }

    /**
     * @return the email_client
     */
    public String getEmail_client() {
        return email_client;
    }

    /**
     * @param email_client the email_client to set
     */
    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the date_of_birthday
     */
    public String getDate_of_birthday() {
        return date_of_birthday;
    }

    /**
     * @param date_of_birthday the date_of_birthday to set
     */
    public void setDate_of_birthday(String date_of_birthday) {
        this.date_of_birthday = date_of_birthday;
    }

    
    
    
}
