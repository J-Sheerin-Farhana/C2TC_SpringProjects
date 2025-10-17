package com.placementmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement", schema = "public")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String company;
    private String role;
    private String date;
    private String qualification;
    private int year;

    public Placement() {}

    public Placement(String name, String company, String role, String date, String qualification, int year) {
        this.name = name;
        this.company = company;
        this.role = role;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
