/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
public class DEMOB3 {
    public static void main(String[]args){
            Bai03 c1= new Bai03();
            c1.Nhap();
            Bai03 c2= new Bai03(6.5, 7.8);
            System.out.print("Cac dien trong khong gian la: ");
            c1.in();
            System.out.println(" ");
            c2.in();
            System.out.println(" ");
            System.out.println("Tong cac thanh phan x va y la: ");
            Bai03 Tong= c1.Tong(c2);
            Tong.in();
            System.out.println(" ");
            System.out.println("Diem doi xung qua trc hoanh cua cac diem la: ");
            Bai03 dx1= c1.Doixung();
            dx1.in();
            System.out.println(" ");
            Bai03 dx2= c2.Doixung();
            dx2.in();
            System.out.println(" ");
    } 
}
