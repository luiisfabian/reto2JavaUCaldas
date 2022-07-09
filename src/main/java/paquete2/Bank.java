/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Bank extends BranchOffice{
    private String name_bank;
    private String nit_bank;
    private String main_office_bank;
    private String branch_manager_bank;
    
    
    public void aprovarCredito(){
        System.out.println("aprovar los creditos de los creditos de la oficina " + getName_branch_office());
    }
    
    public void darPrestamo(){
        System.out.println("dar un prestamo a lo mejor de lo mejo "+ name_bank  +" al nit " + nit_bank);
    }

    public Bank(String name_bank, String nit_bank, String main_office_bank, String branch_manager_bank, String name_branch_office, String adress_branch_office, int tel_branch_office, String emailBranchOffice, String branch_manager, String name_employee, String last_name_employee, int dni_employee, String email_employee, String assigned_module_employee, String employee_type, String salary_employee, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(name_branch_office, adress_branch_office, tel_branch_office, emailBranchOffice, branch_manager, name_employee, last_name_employee, dni_employee, email_employee, assigned_module_employee, employee_type, salary_employee, number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.name_bank = name_bank;
        this.nit_bank = nit_bank;
        this.main_office_bank = main_office_bank;
        this.branch_manager_bank = branch_manager_bank;
    }

    /**
     * @return the name_bank
     */
    public String getName_bank() {
        return name_bank;
    }

    /**
     * @param name_bank the name_bank to set
     */
    public void setName_bank(String name_bank) {
        this.name_bank = name_bank;
    }

    /**
     * @return the nit_bank
     */
    public String getNit_bank() {
        return nit_bank;
    }

    /**
     * @param nit_bank the nit_bank to set
     */
    public void setNit_bank(String nit_bank) {
        this.nit_bank = nit_bank;
    }

    /**
     * @return the main_office_bank
     */
    public String getMain_office_bank() {
        return main_office_bank;
    }

    /**
     * @param main_office_bank the main_office_bank to set
     */
    public void setMain_office_bank(String main_office_bank) {
        this.main_office_bank = main_office_bank;
    }

    /**
     * @return the branch_manager_bank
     */
    public String getBranch_manager_bank() {
        return branch_manager_bank;
    }

    /**
     * @param branch_manager_bank the branch_manager_bank to set
     */
    public void setBranch_manager_bank(String branch_manager_bank) {
        this.branch_manager_bank = branch_manager_bank;
    }
    
    
}
