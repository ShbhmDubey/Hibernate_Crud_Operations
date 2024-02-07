/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aman
 */
@Entity
@Table(name="empTab")
public class Employee implements Serializable {

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }
    @Id
    @Column(name="eid")
    private Integer empId;
    @Column(name="ename",length=20)
    private String empName;
    @Column(name="esal")
    private Double empSal;
    static{
        System.out.println("Employee.class is loading..");
    }
    public Employee(){
        System.out.println("Zero Argument Constructor is Created....");
    }
    public String toString(){
    String str1="Employee id is "+empId+" ";
    String str2="and name is "+empName+" ";
    String str3="and salary is "+empSal+" ";
    return str1+str2+str3;
    }    
}
