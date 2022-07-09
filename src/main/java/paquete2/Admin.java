/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Admin extends Employee{
    private String category;
    private String employee_set;

    public Admin(String category, String employee_set, String name_employee, String last_name_employee, int dni_employee, String email_employee, String assigned_module_employee, String employee_type, String salary_employee, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(name_employee, last_name_employee, dni_employee, email_employee, assigned_module_employee, employee_type, salary_employee, number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.category = category;
        this.employee_set = employee_set;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the employee_set
     */
    public String getEmployee_set() {
        return employee_set;
    }

    /**
     * @param employee_set the employee_set to set
     */
    public void setEmployee_set(String employee_set) {
        this.employee_set = employee_set;
    }
    
    
    
  
}
