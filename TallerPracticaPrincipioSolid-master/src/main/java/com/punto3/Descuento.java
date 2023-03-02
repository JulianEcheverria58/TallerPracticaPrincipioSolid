/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto3;

/**
 *
 * @author bpenc
 */
public class Descuento {

    public float calcular(float importeFactura, int porcentajeDeduccion) {
        if (importeFactura > 10000) {
            return (importeFactura * porcentajeDeduccion + 3 + importeFactura * 0.02f) / 100;
        } else {
            return (importeFactura * porcentajeDeduccion + importeFactura * 0.02f) / 100;
        }
    }
}
