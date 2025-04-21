/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtuan3;

import java.util.Scanner;
import java.util.Arrays;
public class DSHocSinh {
    private Bai01 ds[];
    private int Soluong;
    public void NhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        Soluong= sc.nextInt();
        ds= new Bai01[Soluong];
        for(int i=0; i<Soluong; i++){
            System.out.println("Nhap thong tin hoc sinh thu" +(i+1));
            ds[i]= new Bai01();
            ds[i].input();
        }
        }
    public void XuatDS(){
        System.out.println("Danh sach hoc sinh: ");
        for(int i=0; i<Soluong; i++)
            ds[i].output();
    }
    public void Sapxep(){
        for (int i=0; i<Soluong-1; i++){
            for(int j=i+1; j<Soluong; j++){
                if(ds[i].getDtb() < ds[j].getDtb()){
                    Bai01 temp=ds[i];
                    ds[i]=ds[j];
                    ds[j]=temp;
                }
            }
    }
        System.out.println("Danh sach da duoc sap xep giam dan theo DTB");
    }
}
