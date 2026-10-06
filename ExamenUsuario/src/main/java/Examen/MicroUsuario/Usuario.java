/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.MicroUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private long idUsu;
    private String nom;

    public Usuario() { //insertar constructor vacio
    }

    public Usuario(long idUsu, String nom) { //insertar constructor con las casillas
        this.idUsu = idUsu;
        this.nom = nom;
    }

    public Usuario(String nom) {
        this.nom = nom;
    }
    

    public long getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(long idUsu) {
        this.idUsu = idUsu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
