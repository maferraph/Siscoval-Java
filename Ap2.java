/*
 * Ap1.java
 *
 * Created on 11 de Mar�o de 2002, 20:24
 */

package TesteJava;
//import TesteJava.Ap2 ;
/**
 *
 * @author  Mauricio
 */
public class Ap2 extends java.applet.Applet {
    
    /** Initializes the applet Ap1 */
    public void init() {
        initComponents();
    }
    
    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        TXT_E = new java.awt.TextField();
        TXT_R = new java.awt.TextField();
        label1 = new java.awt.Label();
        label11 = new java.awt.Label();

        setLayout(null);

        add(TXT_E);
        TXT_E.setBounds(190, 30, 170, 20);

        add(TXT_R);
        TXT_R.setBounds(10, 30, 170, 20);

        label1.setText("Enviar");
        add(label1);
        label1.setBounds(190, 10, 38, 20);

        label11.setText("Receber");
        add(label11);
        label11.setBounds(10, 10, 51, 20);

    }//GEN-END:initComponents

    public void Dados(String senderName) {
        TXT_R.setText(senderName);
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.TextField TXT_R;
    private java.awt.TextField TXT_E;
    private java.awt.Label label11;
    // End of variables declaration//GEN-END:variables
    
}