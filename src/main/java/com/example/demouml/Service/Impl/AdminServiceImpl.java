package com.example.demouml.Service.Impl;

import com.example.demouml.Entity.Admin;
import com.example.demouml.Repository.AdminRepository;
import com.example.demouml.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin Not found"));
    }

    @Override
    public List<Admin> showAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin updateAdminById(Long id) {

        Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin Not found"));
        if(admin!=null){
            adminRepository.save(admin);
        }
        return admin ;
    }

    @Override
    public void deleteAdminById(Long id) {
        adminRepository.deleteById(id);
    }
}
