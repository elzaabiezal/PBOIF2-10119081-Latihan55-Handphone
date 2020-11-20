/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan55.handphone;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Handphone
 */
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct() {
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    } 
}