/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.person;

/**
 *
 * @author User
 */
public class Person {
     private String Nama, JenisKelamin;
    private int Umur;

    //setter
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    //getter
    public String getNama() {
        return this.Nama;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public int getUmur() {
        return this.Umur;
    }
}

