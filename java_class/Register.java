/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_class;

public class Register {
    
    private String usr;
    private String pass;
    private String gender;
    
    public Register(String usr, String pass, String gender) {
        this.usr = usr;
        this.pass = pass;
        this.gender = gender;
    }
    
    public String getUsr() { return usr; }
    public String getPass() { return pass; }
    public String getGender() { return gender; }
    
    public void setUsr(String usr){ this.usr = usr;}
    public void setPass(String pass){ this.pass = pass;}
    public void setGender(String gender){ this.gender = gender;}
}
