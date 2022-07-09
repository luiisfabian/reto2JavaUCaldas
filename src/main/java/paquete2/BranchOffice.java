/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class BranchOffice extends Employee{
    private String name_branch_office;
    private String adress_branch_office;
    private int tel_branch_office;
    private String emailBranchOffice;
    private String branch_manager;
    
 
    public void gestionarTarjetas(){   
        
        System.out.println("se gestiona la tarjeta de credito del " + getName_client());
    }
    
    public void ofrecerCreditos(){
        
        System.out.println("Ofrecer creditos de los mejores creditos del banco "+ name_branch_office + " por el empleado "+ getName_employee());
    }

    public BranchOffice(String name_branch_office, String adress_branch_office, int tel_branch_office, String emailBranchOffice, String branch_manager, String name_employee, String last_name_employee, int dni_employee, String email_employee, String assigned_module_employee, String employee_type, String salary_employee, int number, int secure_code, String balance, String name_client, int dni_client, String email_client, String job, String date_of_birthday) {
        super(name_employee, last_name_employee, dni_employee, email_employee, assigned_module_employee, employee_type, salary_employee, number, secure_code, balance, name_client, dni_client, email_client, job, date_of_birthday);
        this.name_branch_office = name_branch_office;
        this.adress_branch_office = adress_branch_office;
        this.tel_branch_office = tel_branch_office;
        this.emailBranchOffice = emailBranchOffice;
        this.branch_manager = branch_manager;
    }

    /**
     * @return the name_branch_office
     */
    public String getName_branch_office() {
        return name_branch_office;
    }

    /**
     * @param name_branch_office the name_branch_office to set
     */
    public void setName_branch_office(String name_branch_office) {
        this.name_branch_office = name_branch_office;
    }

    /**
     * @return the adress_branch_office
     */
    public String getAdress_branch_office() {
        return adress_branch_office;
    }

    /**
     * @param adress_branch_office the adress_branch_office to set
     */
    public void setAdress_branch_office(String adress_branch_office) {
        this.adress_branch_office = adress_branch_office;
    }

    /**
     * @return the tel_branch_office
     */
    public int getTel_branch_office() {
        return tel_branch_office;
    }

    /**
     * @param tel_branch_office the tel_branch_office to set
     */
    public void setTel_branch_office(int tel_branch_office) {
        this.tel_branch_office = tel_branch_office;
    }

    /**
     * @return the emailBranchOffice
     */
    public String getEmailBranchOffice() {
        return emailBranchOffice;
    }

    /**
     * @param emailBranchOffice the emailBranchOffice to set
     */
    public void setEmailBranchOffice(String emailBranchOffice) {
        this.emailBranchOffice = emailBranchOffice;
    }

    /**
     * @return the branch_manager
     */
    public String getBranch_manager() {
        return branch_manager;
    }

    /**
     * @param branch_manager the branch_manager to set
     */
    public void setBranch_manager(String branch_manager) {
        this.branch_manager = branch_manager;
    }
    
    
    


    
    
    
    

    
    
    

    

    

    
    
}
