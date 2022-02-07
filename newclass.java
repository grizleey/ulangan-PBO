/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author Lenovo
 */
public class newclass {
    private int nilai;
    
    public void setNilai(int newNilai){
        nilai=newNilai;
    }
    public int getNilai(){
        return nilai;
    }
    
    public void kriteria(int nilai){
        if (nilai > 75) {
            System.out.println("Nilai Produktif Felis adalah = "+nilai+"\n"+"Selamat anda lulus!");
        }
        if (nilai < 75) {
            System.out.println("Nilai Produktif Felis adalah = "+nilai+"\n"+"Anda harus belajar lebih giat lagi");
        }
    }
}

