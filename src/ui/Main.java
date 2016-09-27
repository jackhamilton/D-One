package ui;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */
public class Main {
    
    public static List<res.Character> characters = new ArrayList();
    
    public static void main(String[] args) {
        
        display display = new display();
        display.setVisible(true);
        
    }
    
}
