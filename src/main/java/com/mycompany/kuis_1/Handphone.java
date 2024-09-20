/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis_1;

/**
 *
 * @author ASUS
 */
public class Handphone {
    private String noSeri, model, versiOS;
    private boolean on = false;
    private int volume = 0;
    private int lastVolume; //untuk menyimpan value volume terakhir
    
    public void HandPhone(){
        this.noSeri = "";
        this.model = "";
        this.versiOS ="";
    }

    public Handphone(String noSeri, String model, String versiOS) {
        this.noSeri = noSeri;
        this.model = model;
        this.versiOS = versiOS;
    }
    
//    public void power(){
//        if (on == true) {
//            System.out.println("Hp is on");
//        } else {
//            System.out.println("Hp is off");
//        }
//    }
    
    public void powerOn(){
        this.on = true;
        System.out.println("Hp power on");
    }
    
    public void powerOff(){
        this.on = false;
        System.out.println("Hp power off");
        System.out.println("Volume trakhir: " + volume);
    }
    
    public void tambahVolume(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        if (on && volume < 100) {
            volume += 50;
            System.out.println("Volume ditambah: " + volume);
            if (volume > 100) {
                volume = 100;
            }
        } else if (!on) {
            System.out.println("Hp is off, tidak bisa menambah volume");
        } else {
            System.out.println("Volume sudah maksimum: " + volume);
        }
    }
    
    public void kurangVolume(){
        System.out.println("-------------------------------------------------");
        if (on && volume > 0) {
            volume -= 50;
            System.out.println("Volume dikurangi: " + volume);
            if (volume < 0) {
                volume = 0;
            }
        } else if (!on) {
            System.out.println("Hp is off, tidak bisa mengurangi volume");
        } else {
            System.out.println("Volume sudah mencapai minimum: " + volume);
        }
    }
    
    public void mute(){
        System.out.println("=================================================");
        if (on) {
            if (volume == 0) {
                volume = lastVolume;
                System.out.println("Unmute, volume: " + volume);
            } else {
                lastVolume = volume;
                volume = 0;
                System.out.println("Volume muted.");
            }
        } else {
            System.out.println("Hp is off, tidak bisa mute volume");
        }
    }
    
    public void info(){
        System.out.println("================= Hp info =======================");
        System.out.println("Nomer seri: " + noSeri);
        System.out.println("Model: " + model);
        System.out.println("Versi OS: " + versiOS);
        System.out.println("ON: " + on);
        System.out.println("Volume: " + volume);
        System.out.println("==================================================");
    }
    
}
