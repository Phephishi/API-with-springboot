package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @GetMapping("/getCustomerInfo")
    public String getCustomerInfo(){
        return "Phephishi_PJ";
    }
  @PostMapping("/registerUser")
  public String registerUser(@RequestBody UserDetails userDetails){
      System.out.println("User Information is: "+ userDetails.toString());
      return "successfully registered user";
  }

}

class UserDetails {
    private String name;
    private String surname;
    private String cellphone;

    public String getCellphone() {
        return cellphone;

    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


