package com.example.demouml.Service;

import com.example.demouml.Entity.Admin;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdminService {
    Admin addAdmin(Admin admin);

    Admin getAdminById(Long id);

    List<Admin> showAllAdmins();

    Admin updateAdminById(Long id);

    void deleteAdminById(Long id);

}
