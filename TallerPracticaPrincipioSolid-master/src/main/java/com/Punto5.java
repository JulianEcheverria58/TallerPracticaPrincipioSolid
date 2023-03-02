/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author julian.echeverria
 */
public interface CorreoElectronico {
    public String getEmailAddress();
}

public interface SMS {
    public String getTelephone();
}

public class Contacto implements CorreoElectronico, SMS {
    String name, address, emailAddress, telephone; 
    
    public void setName(String n) { name=n; } 
    public String getName() { return name; } 
  
    public void setAddress(String a) { address=a; } 
    public String getAddress() { return address; } 
  
    public void setEmailAddress(String ea) { emailAddress=ea; } 
    public String getEmailAddress() { return emailAddress; } 
  
    public void setTelephone(String t) { telephone=t; } 
    public String getTelephone() { return telephone; } 
}

public class EmailSender {
    public static void sendEmail(CorreoElectronico c, String message) {
        //Envía un mensaje a la dirección de correo del CorreoElectronico c. 
    }
}

public class SMSSender {
    public static void sendSMS(SMS c, String message) {
        //Envía un mensaje SMS al teléfono del SMS c. 
    }
}
