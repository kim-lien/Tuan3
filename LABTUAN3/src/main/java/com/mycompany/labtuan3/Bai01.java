/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
public class Bai01 {
  private int Maso;
    private String Hoten;
    private float DTB;
    public int getMaSo(){
        return Maso;
    }
    public void setMaSo(int Maso){
        this.Maso = Maso;
    }
    public String getHoTen(){
        return Hoten;
    }
           public void setHoTen(String Hoten){
               this.Hoten = Hoten;
           }
           public float getDtb(){
               return DTB;
           }
           public void setDtb(float DTB){
               this.DTB = DTB;
           }
           public Bai01(){
               this.Maso = 0;
               this.Hoten = null;
               this.DTB = 0f;
           }
           public Bai01(int Maso, String Hoten, float DTB){
               this.Maso = Maso;
               this.Hoten = Hoten;
               this.DTB = DTB;
           }
           public Bai01(Bai01 tmp){
               this.Maso = tmp.Maso;
               this.Hoten = tmp.Hoten;
               this.DTB = tmp.DTB;
           }
           public void input(){
               Scanner sc = new Scanner(System.in);
               System.out.println("Nhap ma so: ");
               Maso = sc.nextInt();
               System.out.println("Nhap ho ten: ");
               sc.nextLine();
               Hoten = sc.nextLine();
               System.out.println("Nhap DTB: ");
               DTB = sc.nextFloat();
           }
           public void output(){
               System.out.println(Maso+ " - " +Hoten+ " - " +DTB);
           }
           public void rank(){
               if(DTB<5)
                   System.out.println("Xep loai yeu");
               else
                   if(DTB >=5 && DTB<7)
                       System.out.println("Xep loai trung binh");
               else if(DTB<8.5)
                       System.out.println("Xep loai kha");
                       else
                       System.out.println("Xep loai gioi");
                   }
}