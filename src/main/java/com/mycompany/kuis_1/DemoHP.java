/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuis_1;

/**
 *
 * @author ASUS
 */
public class DemoHP {

    public static void main(String[] args) {
        Handphone hp = new Handphone("19", "Infinix note 11 pro", "Android 11");

        // memanggil method info
        hp.info();

        // Turn on
        hp.powerOn();

        // Menambah volume
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();

        // Kurang volume
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();

        // mute hp
        hp.mute();

        // Unmute hp
        hp.mute();
        
        hp.info();
    }
}
