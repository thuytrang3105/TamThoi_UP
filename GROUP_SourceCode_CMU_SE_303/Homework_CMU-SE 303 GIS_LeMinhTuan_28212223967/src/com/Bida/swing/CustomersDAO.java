
package com.Bida.swing;

import java.util.List;
import java.util.ArrayList;

public class CustomersDAO {
    List<Customers> ls = new ArrayList<>(); 
    public int add(Customers cus){
        ls.add(cus);
        return 1;
    }
    public List<Customers> getAllCustomer(){
        return ls;
    }
    public int delCustomer(String de){
        for (Customers cus : ls) {
            if(cus.getId().equalsIgnoreCase(de)){
                ls.remove(de);
                return 1;
            }
        }
        return -1;
    }
    public Customers getCusById(String id){
        for (Customers cus : ls) {
            if(cus.getId().equalsIgnoreCase(id)){
                return cus;
            }
        }
        return null;
    }

    public int update(Customers cus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int delete(String cusId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
