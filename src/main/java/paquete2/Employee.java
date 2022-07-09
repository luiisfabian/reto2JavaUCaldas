/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Employee extends BankAccount{
    private String name_employee;
    private String last_name_employee;
    private int dni_employee;
    private String email_employee;
    private String assigned_module_employee;
    private String employee_type;
    private String salary_employee;
     
    
    public void asesorarCliente(){
        
        System.out.println("Asesorado el cliente por el empleado "+ name_employee + " al cliente " + getName_client());
    }
    
    public void gestionarTransaciones(){
        System.out.println("Gestionar trasacciones del banco con numero de cuenta "+ getNumber());
    }

    public Employee(String name_employee, String last_name_employee, int dni_employee, String email_employee, String assigned_module_employee, String employee_type, String salary_employee, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.name_employee = name_employee;
        this.last_name_employee = last_name_employee;
        this.dni_employee = dni_employee;
        this.email_employee = email_employee;
        this.assigned_module_employee = assigned_module_employee;
        this.employee_type = employee_type;
        this.salary_employee = salary_employee;
    }

    /**
     * @return the name_employee
     */
    public String getName_employee() {
        return name_employee;
    }

    /**
     * @param name_employee the name_employee to set
     */
    public void setName_employee(String name_employee) {
        this.name_employee = name_employee;
    }

    /**
     * @return the last_name_employee
     */
    public String getLast_name_employee() {
        return last_name_employee;
    }

    /**
     * @param last_name_employee the last_name_employee to set
     */
    public void setLast_name_employee(String last_name_employee) {
        this.last_name_employee = last_name_employee;
    }

    /**
     * @return the dni_employee
     */
    public int getDni_employee() {
        return dni_employee;
    }

    /**
     * @param dni_employee the dni_employee to set
     */
    public void setDni_employee(int dni_employee) {
        this.dni_employee = dni_employee;
    }

    /**
     * @return the email_employee
     */
    public String getEmail_employee() {
        return email_employee;
    }

    /**
     * @param email_employee the email_employee to set
     */
    public void setEmail_employee(String email_employee) {
        this.email_employee = email_employee;
    }

    /**
     * @return the assigned_module_employee
     */
    public String getAssigned_module_employee() {
        return assigned_module_employee;
    }

    /**
     * @param assigned_module_employee the assigned_module_employee to set
     */
    public void setAssigned_module_employee(String assigned_module_employee) {
        this.assigned_module_employee = assigned_module_employee;
    }

    /**
     * @return the employee_type
     */
    public String getEmployee_type() {
        return employee_type;
    }

    /**
     * @param employee_type the employee_type to set
     */
    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    /**
     * @return the salary_employee
     */
    public String getSalary_employee() {
        return salary_employee;
    }

    /**
     * @param salary_employee the salary_employee to set
     */
    public void setSalary_employee(String salary_employee) {
        this.salary_employee = salary_employee;
    }
    
    
    
    
    
    
    
    
    
}
