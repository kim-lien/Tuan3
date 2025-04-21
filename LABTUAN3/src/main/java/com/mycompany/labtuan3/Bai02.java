/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
public class Bai02 {
    private int tu;
    private int mau;
    public Bai02(){
        tu=0;
        mau=1;
    }
    public Bai02(int tu, int mau){
        this.tu=tu;
        this.mau=mau;
    }
    public Bai02(Bai02 p){
        tu=p.tu;
        mau=p.mau;
    }
    public void Nhapphanso(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tu= sc.nextInt();
        System.out.print("Nhap mau so: ");
        mau= sc.nextInt();
    }
    public void Xuatphanso(){
        System.out.println(tu+ " " +mau);
    }
    private int UCLN(int tu, int mau){
        if(tu==mau){
            return tu;
        }else if(tu>mau){
            return UCLN(tu-mau, mau);
        }else{
            return UCLN(tu, mau-tu);
        }
    }
    private void Rutgon(){
        int ucln=UCLN(tu, mau);
        tu=tu/ucln;
        mau=mau/ucln;
    }
    public Bai02 Cong(Bai02 p){
        Bai02 kq= new Bai02();
        kq.mau= mau*p.mau;
        kq.tu= tu*p.mau + p.tu*mau;
        kq.Rutgon();
        return kq;
    }
    public Bai02 Tru(Bai02 p){
        Bai02 kq= new Bai02();
        kq.mau= mau*p.mau;
        kq.tu= tu*p.mau - p.tu*mau;
        kq.Rutgon();
        return kq;
    }
    public Bai02 Nhan(Bai02 p){
        Bai02 kq= new Bai02();
        kq.mau= mau*p.mau;
        kq.tu= tu*p.tu;
        kq.Rutgon();
        return kq;
    }
    public Bai02 Chia(Bai02 p){
        Bai02 kq= new Bai02();
        kq.mau= mau*p.tu;
        kq.tu= tu*p.mau;
        kq.Rutgon();
        return kq;
    }
}
