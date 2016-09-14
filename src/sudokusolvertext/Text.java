/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolvertext;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Anthuan
 */
public class Text{
   JTextField A = new JTextField(3);
   
    public Text(String b, ActionListener actionListener) {
        A.setName(b);
        A.addActionListener(actionListener);
    }

    public JTextField ret(){
        return A;
    }

}
