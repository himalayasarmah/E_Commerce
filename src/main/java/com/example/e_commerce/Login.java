package com.example.e_commerce;

import java.sql.ResultSet;

public class Login{
    public Customer customerLogin(String userName, String password){
        String query = "select * from customer where email = '"+userName+"' and password = '"+password+"'";
        DbConnection connection = new DbConnection();
        try{
            ResultSet rs = connection.getQueryTable(query);
            if(rs.next()){
                return new Customer(rs.getInt("id"), rs.getString("name"),
                        rs.getString("email"), rs.getString("mobile")
                        );
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Login login = new Login();
        Customer customer = login.customerLogin("himalaya1996@gmail.com", "Himalaya132");
        System.out.println("Welcome " + customer.getName());
//        System.out.println(login.customerLogin("himalaya1996@gmail.com", "Himalaya132"));
    }
}
