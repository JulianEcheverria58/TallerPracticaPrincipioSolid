/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto3;

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

    public void calcularTotal() {
// Utilizamos las clases Descuento e IVA para calcular la deducción y el IVA
        Descuento descuento = new Descuento();
        importeDeduccion = descuento.calcular(importeFactura, porcentajeDeduccion);

        IVA iva = new IVA();
        importeIVA = iva.calcular(importeFactura);

// Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
