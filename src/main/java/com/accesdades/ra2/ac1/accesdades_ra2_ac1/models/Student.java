package com.accesdades.ra2.ac1.accesdades_ra2_ac1.models;

public class Student {
    private int id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int any;

    public Student(int id, String nom, String cognom, int age, String cicle, int any) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any = any;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getAge() {
        return age;
    }

    public String getCicle() {
        return cicle;
    }

    public int getAny() {
        return any;
    }
}
