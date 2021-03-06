/*
 * estoque.java
 *
 * Created on 15 de Julho de 2002, 10:54
 */

package br.com.conesteel.assest;

/**
 *
 * @author  Conesteel
 */
public class valvulas extends javax.swing.JFrame {
    
    /** Creates new form estoque */
    public valvulas() {
        initComponents();
        setSize(338,250);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        valvulas = new javax.swing.JPanel();
        tarugo = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        globo = new javax.swing.JLabel();
        pistao = new javax.swing.JLabel();
        portinhola = new javax.swing.JLabel();
        barra_titulo = new javax.swing.JToolBar();
        titulo = new javax.swing.JLabel();
        acabado = new javax.swing.JPanel();
        tipo_acabado = new javax.swing.JLabel();
        estoque = new javax.swing.JPanel();
        tipo_estoque = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assistente de Figuras");
        setIconImage(getIconImage());
        setLocationRelativeTo(this);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        valvulas.setLayout(null);

        valvulas.setBackground(new java.awt.Color(255, 255, 255));
        tarugo.setBackground(new java.awt.Color(255, 255, 255));
        tarugo.setFont(new java.awt.Font("Arial", 1, 24));
        tarugo.setForeground(java.awt.Color.blue);
        tarugo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarugo.setText("Tarugo - Ponta de Agulha");
        tarugo.setToolTipText("");
        tarugo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntrou(evt);
            }
        });

        valvulas.add(tarugo);
        tarugo.setBounds(10, 180, 310, 30);

        aa.setBackground(new java.awt.Color(255, 255, 255));
        aa.setFont(new java.awt.Font("Arial", 1, 24));
        aa.setForeground(java.awt.Color.blue);
        aa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa.setText("Gaveta");
        aa.setToolTipText("");
        aa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntrou(evt);
            }
        });

        valvulas.add(aa);
        aa.setBounds(10, 60, 310, 30);

        globo.setBackground(new java.awt.Color(255, 255, 255));
        globo.setFont(new java.awt.Font("Arial", 1, 24));
        globo.setForeground(java.awt.Color.blue);
        globo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        globo.setText("Globo");
        globo.setToolTipText("");
        globo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntrou(evt);
            }
        });

        valvulas.add(globo);
        globo.setBounds(10, 90, 310, 30);

        pistao.setBackground(new java.awt.Color(255, 255, 255));
        pistao.setFont(new java.awt.Font("Arial", 1, 24));
        pistao.setForeground(java.awt.Color.blue);
        pistao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pistao.setText("Reten\u00e7\u00e3o Pist\u00e3o");
        pistao.setToolTipText("");
        pistao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntrou(evt);
            }
        });

        valvulas.add(pistao);
        pistao.setBounds(10, 120, 310, 30);

        portinhola.setBackground(new java.awt.Color(255, 255, 255));
        portinhola.setFont(new java.awt.Font("Arial", 1, 24));
        portinhola.setForeground(java.awt.Color.blue);
        portinhola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portinhola.setText("Reten\u00e7\u00e3o Portinhola");
        portinhola.setToolTipText("");
        portinhola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntrou(evt);
            }
        });

        valvulas.add(portinhola);
        portinhola.setBounds(10, 150, 310, 30);

        barra_titulo.setBackground(new java.awt.Color(0, 153, 255));
        barra_titulo.setFloatable(false);
        barra_titulo.setForeground(new java.awt.Color(51, 153, 255));
        titulo.setForeground(new java.awt.Color(255, 255, 0));
        titulo.setText("Escolha o Tipo de V\u00e1lvula Compacta");
        barra_titulo.add(titulo);

        valvulas.add(barra_titulo);
        barra_titulo.setBounds(0, 0, 390, 20);

        acabado.setLayout(null);

        acabado.setBackground(new java.awt.Color(255, 255, 255));
        acabado.setBorder(new javax.swing.border.TitledBorder("Mudar o tipo do Acabado"));
        tipo_acabado.setForeground(java.awt.Color.green);
        tipo_acabado.setText("V\u00c1LVULA COMPACTA");
        tipo_acabado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstoqueClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EstoqueSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EstoqueEntrou(evt);
            }
        });

        acabado.add(tipo_acabado);
        tipo_acabado.setBounds(10, 20, 140, 16);

        valvulas.add(acabado);
        acabado.setBounds(170, 20, 160, 40);

        estoque.setLayout(null);

        estoque.setBackground(new java.awt.Color(255, 255, 255));
        estoque.setBorder(new javax.swing.border.TitledBorder("Mudar o tipo do Estoque"));
        tipo_estoque.setForeground(java.awt.Color.green);
        tipo_estoque.setText("ACABADO");
        tipo_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstoqueClicou(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EstoqueSaiu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EstoqueEntrou(evt);
            }
        });

        estoque.add(tipo_estoque);
        tipo_estoque.setBounds(10, 20, 70, 16);

        valvulas.add(estoque);
        estoque.setBounds(0, 20, 160, 40);

        getContentPane().add(valvulas);
        valvulas.setBounds(0, 0, 330, 220);

        pack();
    }//GEN-END:initComponents

    private void EstoqueClicou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstoqueClicou
        evt.getComponent().setForeground(java.awt.Color.red);
    }//GEN-LAST:event_EstoqueClicou

    private void EstoqueSaiu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstoqueSaiu
        evt.getComponent().setForeground(java.awt.Color.green);
    }//GEN-LAST:event_EstoqueSaiu

    private void EstoqueEntrou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstoqueEntrou
        evt.getComponent().setForeground(java.awt.Color.orange);
    }//GEN-LAST:event_EstoqueEntrou

    private void MouseSaiu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseSaiu
        evt.getComponent().setForeground(java.awt.Color.blue);
    }//GEN-LAST:event_MouseSaiu

    private void MouseClicou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClicou
        evt.getComponent().setForeground(java.awt.Color.red);
    }//GEN-LAST:event_MouseClicou

    private void MouseEntrou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntrou
        evt.getComponent().setForeground(java.awt.Color.orange);
    }//GEN-LAST:event_MouseEntrou
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new valvulas().show();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel tipo_acabado;
    private javax.swing.JPanel valvulas;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel estoque;
    private javax.swing.JLabel globo;
    private javax.swing.JLabel tipo_estoque;
    private javax.swing.JLabel portinhola;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel tarugo;
    private javax.swing.JToolBar barra_titulo;
    private javax.swing.JPanel acabado;
    private javax.swing.JLabel pistao;
    // End of variables declaration//GEN-END:variables

}
