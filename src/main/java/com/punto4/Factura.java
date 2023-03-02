/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto4;

import java.util.Date;

/**
 *
 * @author bpenc
 */
public class Factura {

    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private CalculadorDeduccion calculadorDeduccion;
    private CalculadorIVA calculadorIVA;

    public Factura(CalculadorDeduccion calculadorDeduccion, CalculadorIVA calculadorIVA) {
        this.calculadorDeduccion = calculadorDeduccion;
        this.calculadorIVA = calculadorIVA;
    }

// Métodos
// calcula el total de la factura
    public void calcularTotal() {
// Calcula la deducción
        importeDeduccion = calculadorDeduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);
// Calcula el IVA
        importeIVA = calculadorIVA.calculaIVA(importeFactura);
// Calcula el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
