package model;

public class Employee {
private int employeeId;  
private String employeeName;  
private String employeeRole;
private Double employeeSalary;
public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String geEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName= employeeName;
}
public String getEmployeeRole() {
    return employeeRole;
}
public void setEmployeeRole(String employeeRole) {
    this.employeeRole = employeeRole;
}
public Double getEmployeeSalary() {
    return employeeSalary;
}
public void setEmployeeSalary(Double employeeSalary) {
    this.employeeSalary = employeeSalary;
} 
}
