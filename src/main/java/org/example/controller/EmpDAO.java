package org.example.controller;

import org.example.connection.MyConnection;
import org.example.model.Employees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmpDAO {
    public List<Employees> getEmp()
    {
         List<Employees> employees =new ArrayList<>();
         try {
             Connection conn=MyConnection.getConnection();
             String sql="select * from employees";

             Statement stmt=conn.createStatement();
             ResultSet rs=stmt.executeQuery(sql);

             while (rs.next())
             {
                Employees e= new Employees();
                e.setId(rs.getInt("id"));
                e.setFullName(rs.getString("fullName"));
                e.setPhone(rs.getString("phone"));
                e.setGender(rs.getInt("gender"));
                e.setEmail(rs.getString("email"));
                e.setCity(rs.getString("city"));
                employees.add(e);
             }
         }catch (Exception e)
         {
             e.printStackTrace();
         }
        return employees;
    }
    public void insert(Employees emp)
    {
        try {
            Connection conn = MyConnection.getConnection();
            String sql="INSERT INTO `employees` ( `fullName`, `city`, `gender`, `salary`, `email`, `phone`) VALUES ( '"+emp.getFullName()+"', '"+emp.getCity()+"', '"+emp.getGender()+"', '"+emp.getSalary()+"'," +
                    " '"+emp.getEmail()+"', '"+emp.getPhone()+"');";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            // Buoc 4:
            stmt.close();
            conn.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
