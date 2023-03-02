/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto3;

/**
 *
 * @author bpenc
 */
public class IVA {

    private float tasaIVA = 0.16f; // Tasa de IVA por defecto

    public void setTasaIVA(float tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public float calcular(float importeFactura) {
        return importeFactura * tasaIVA;
    }
}
