package service;
import model.Employee;

import java.sql.*;  
  
public class EmployeeDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbname","root","examly");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int addEmployee(Employee e){  
        int status=0;  
        try{  
            Connection con=EmployeeDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Employee(employeeId,employeeName,employeeRole,employeeSalary) values (?,?,?,?)");  
            ps.setInt(1,e.getEmployeeId());
            ps.setString(2,e.geEmployeeName());  
            ps.setString(3,e.getEmployeeRole());  
            ps.setDouble(4,e.getEmployeeSalary());  
           
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int updateEmployee(Employee e){  
        int status=0;  
        try{  
            Connection con=EmployeeDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
                         ps.setInt(1,e.getEmployeeId());
                         ps.setString(2,e.geEmployeeName());  
                         ps.setString(3,e.getEmployeeRole());  
                         ps.setDouble(4,e.getEmployeeSalary()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int deleteEmployee(int id){  
        int status=0;  
        try{  
            Connection con=EmployeeDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Employee viewEmployeeById(int id){  
        Employee e=new Employee();  
          
        try{  
            Connection con=EmployeeDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                ps.setInt(1,e.getEmployeeId());
                ps.setString(2,e.geEmployeeName());  
                ps.setString(3,e.getEmployeeRole());  
                ps.setDouble(4,e.getEmployeeSalary()); 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
 
}  