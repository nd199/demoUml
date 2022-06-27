package com.example.demouml.Controller;

import com.example.demouml.Entity.Admin;
import com.example.demouml.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
        return new ResponseEntity<Admin>(adminService.addAdmin(admin), HttpStatus.OK);
    }

    @GetMapping("/getAdmin/{id}")
    public ResponseEntity<Admin> getAdmin(@PathVariable("id") Long id){
        return new ResponseEntity<Admin>(adminService.getAdminById(id), HttpStatus.FOUND);
    }

    @GetMapping("/showAllAdmins")
    public ResponseEntity<List<Admin>> showAllAdmins(){
        return new ResponseEntity<List<Admin>>(adminService.showAllAdmins(), HttpStatus.FOUND);
    }


    @PutMapping ("/updateAdmin/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable("id") Long id){
        return new ResponseEntity<Admin>(adminService.updateAdminById(id), HttpStatus.OK);
    }

    @GetMapping("/deleteAdmin/{id}")
    public void deleteAdmin(@PathVariable("id") Long id){
         adminService.deleteAdminById(id);
    }

}
