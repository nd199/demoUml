package com.example.demouml.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@Data
public class Admin extends Users {

}