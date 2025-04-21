/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
public class Demo01 {
public static void main(String[]args){
        Bai01 hs1 = new Bai01();
        hs1.input();
        hs1.output();
        Bai01 hs2 = new Bai01(110, "Nguyen Ngoc Lan", 8.5f);
        hs2.output();
        Bai01 hs3 =new Bai01(hs2);
        hs3.setHoTen("Phan Chau Tuan");
        hs3.output();
        float max = hs1.getDtb();
        String ht = hs1.getHoTen();
        if (max<hs2.getDtb()){
            max= hs2.getDtb();
            ht= hs2.getHoTen();
        }
        if (max < hs3.getDtb()){
            max= hs3.getDtb();
            ht= hs3.getHoTen();
        }
        System.out.println("Hoc sinh" +ht+ "Co DTB cao nhat la: " +max);
    }
}
