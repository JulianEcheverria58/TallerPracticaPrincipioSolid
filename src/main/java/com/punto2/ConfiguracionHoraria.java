/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto2;

/**
 *
 * @author samid
 */
public class ConfiguracionHoraria implements RecursoPersistente {

    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    public void save() {
        System.out.println("ERROR, la hora no se puede almacenar, es solo de lectura");
    }
}
