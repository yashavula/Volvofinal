package com.volvo.app.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuBean {

    private String name;

    public String sayHello() {
        if (name != null && !name.trim().equals("")) {
            return "Hello, " + name + "!";
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String processPage1() {       
        return "page";    
     }  
     
     public String processPage2() {       
        return "page";    
     } 
     
     public String processPage3() {       
         return "page";    
      }  
     
     public String processPage4() {       
         return "page";    
      }  
     
}