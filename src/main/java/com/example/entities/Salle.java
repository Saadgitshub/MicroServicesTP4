package com.example.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines = new ArrayList<>();

    // Default Constructor
    public Salle() {
    }

    // Constructor with code
    public Salle(String code) {
        this.code = code;
    }

    // Constructor with code and machines (optional)
    public Salle(String code, List<Machine> machines) {
        this.code = code;
        this.machines = machines != null ? machines : new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines != null ? machines : new ArrayList<>();
    }
}