/*
 * Formulario.java
 *
 * Created on 21 de Mar�o de 2002, 19:45
 */

package XUXU;

/**
 *
 * @author  Mauricio
 */

import XUXU.*;

public class Formulario extends java.awt.Panel {
    
    /** Creates new form Formulario */
    public Formulario() {
        initComponents();

        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        label1 = new java.awt.Label();

        setLayout(null);

        label1.setText("label1");
        add(label1);
        label1.setBounds(10, 10, 80, 20);

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    public String TextoXUXU()
    {
        return "XUXU RODO";
    }
    
}