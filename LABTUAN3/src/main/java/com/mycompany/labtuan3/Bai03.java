/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
public class Bai03 {
    private double x;
    private double y;
    public Bai03(){
        x= 0.0f;
        y=0.0f;
    }
    public Bai03(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Bai03 Tong(Bai03 c){
        Bai03 kq= new Bai03();
        kq.x= x+c.x;
        kq.y= y+c.y;
        return kq;
    }
    public Bai03 Doixung(){
        return new Bai03(this.x, -this.y);
    }
    public void in(){
        System.out.print("(" +x+ "," +y+ ")");
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap x: ");
        x= sc.nextDouble();
        System.out.print("Nhap y: ");
        y= sc.nextDouble();
    }
}
