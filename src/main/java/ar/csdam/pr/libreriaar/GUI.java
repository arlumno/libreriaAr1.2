/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.csdam.pr.libreriaar;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author a20armandocb
 */
public class GUI  extends JFrame{
      
    JButton boton;
    public GUI(){
        setLayout(null);
        
        boton = new JButton("Estoy en mi posición");
        boton.setBounds(30,5,160,20);
        add(boton);
        
        setVisible(true);

        Toolkit elToolkit = Toolkit.getDefaultToolkit();
        Dimension laPantalla = elToolkit.getScreenSize();        
        
        int h = 100;
        setBounds(5,laPantalla.height - h -40 ,laPantalla.width - 10,h);
        setTitle("probandoSwing02");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

        
      /**
     * Version de consola 
     */
//    private void construirMenu() {
//        //Construimos y guardamos el menú
//        menu.append(Textos.cabeceraMenu(tituloMenu));
//        for (int i = 0; i < nOpciones; i++) {
//            menu.append("\n");
//            menu.append(i + 1); //la opcion es = al indice del array + 1
//            menu.append(".- ");
//            menu.append(opcionesArray.get(i));
//            if (isDescripcion() && descripcionOpcionesArray.get(i) != "") {
//                menu.append("\n\t");
//                menu.append(descripcionOpcionesArray.get(i));
//            }
//        }
//        if (isSalir()) {
//            menu.append(Textos.OPCION_SALIR);
//        }
//        menu.append(Textos.INDICAR_OPCION);
//    }
//}
