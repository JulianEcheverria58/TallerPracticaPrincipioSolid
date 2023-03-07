/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.punto2;

/**
 *
 * @author samid
 * 1. Crea un programa principal que ejecute los métodos de la clase Configuración.
 * 2. Cumple la clase Configuracion el Principio OCP. Justifica la respuesta.
 *      la Clase Configuracion no cumple con el pricipio de OCP ya que no es una clase abstracta o interfaz
 *      de igual forma su metodo no es privado y solo permite agregar 3 configuraciones de usuario
 *      lo que indica que se debe modificar para aceptar mas objetos.
 * 3. Cumple la clase Configuracion el Principio de Liskov. Justifica la respuesta.
 *      No la clase Confiuracion no cumple ya que para realizar el almacenamiento de la funcion salvarConfiguracion
 *      de los datos de la hora se debe modificar, lo que indica que no cumple
 * 4. Refactoriza la aplicación para que cumpla el principio de Liskov. La solución a
 *      este ejercicio lo puedes encontrar en: https://lassala.net/2010/11/04/a-good-example-of-liskov-substitution-principle/
 * 5. Explica de forma general (independientemente del ejemplo) cual es el problema y la solución propuesta.
 *      el principio Liskov se resume en que no se debe hacer cambios en los metodos que se heredan o implementan
 *      de clases o interfaces ya que la super clase debe contener todo lo necesario para la implementacion.
 *      la solucion propuesta es la creacion de funciones en la interfaz.
 */
public class InicioEjercicioTres {
    public static void main(String[] args) {
        Configuracion conf = new Configuracion();
        conf.cargarConfiguracion();
        conf.salvarConfiguracion();
    }
}
