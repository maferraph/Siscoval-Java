/*
 * Menu.java
 *
 * Created on 9 de Março de 2002, 11:40
 */

/**
 *
 * @author  Mauricio
 */
import javax.swing.* ;
import java.awt.* ;

public final class Menu extends javax.swing.JApplet {
    
    /** Creates new form Menu */
    public Menu() {
        initComponents();
    }
    
    private void initComponents() {//GEN-BEGIN:initComponents
        BarraMenu = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        MenuPrincipal_Sistema = new javax.swing.JMenu();
        MenuPrincipal_Sistema_Grupos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        MenuPrincipal_Sair = new javax.swing.JMenuItem();
        MenuEstoque = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        MenuEscritório = new javax.swing.JMenu();
        MenuFabrica = new javax.swing.JMenu();
        MenuMontagem = new javax.swing.JMenu();
        MenuExpedicao = new javax.swing.JMenu();
        MenuFerramentas = new javax.swing.JMenu();

        getContentPane().setLayout(null);

        setBackground(new java.awt.Color(0, 0, 0));
        BarraMenu.setBackground(new java.awt.Color(0, 0, 0));
        BarraMenu.setBorder(null);
        BarraMenu.setForeground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        MenuPrincipal.setBorder(null);
        MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setText("Principal");
        MenuPrincipal.setFont(new java.awt.Font("Arial", 1, 10));
        MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.gif")));
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        MenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        MenuPrincipal_Sistema.setText("Sistema");
        MenuPrincipal_Sistema_Grupos.setText("Grupos");
        MenuPrincipal_Sistema.add(MenuPrincipal_Sistema_Grupos);
        MenuPrincipal.add(MenuPrincipal_Sistema);
        MenuPrincipal.add(jSeparator1);
        MenuPrincipal_Sair.setText("Sair");
        MenuPrincipal_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipal_SairActionPerformed(evt);
            }
        });

        MenuPrincipal.add(MenuPrincipal_Sair);
        BarraMenu.add(MenuPrincipal);
        MenuEstoque.setBackground(new java.awt.Color(0, 0, 0));
        MenuEstoque.setForeground(new java.awt.Color(255, 255, 255));
        MenuEstoque.setText("Estoque");
        MenuEstoque.setFont(new java.awt.Font("Arial", 1, 10));
        MenuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/581269.gif")));
        MenuEstoque.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        jMenuItem11.setText("Item");
        MenuEstoque.add(jMenuItem11);
        BarraMenu.add(MenuEstoque);
        MenuEscritório.setBackground(new java.awt.Color(0, 0, 0));
        MenuEscritório.setForeground(new java.awt.Color(255, 255, 255));
        MenuEscritório.setText("Escrit\u00f3rio");
        MenuEscritório.setFont(new java.awt.Font("Arial", 1, 10));
        MenuEscritório.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escri.gif")));
        MenuEscritório.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuEscritório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        BarraMenu.add(MenuEscritório);
        MenuFabrica.setBackground(new java.awt.Color(0, 0, 0));
        MenuFabrica.setForeground(new java.awt.Color(255, 255, 255));
        MenuFabrica.setText("F\u00e1brica");
        MenuFabrica.setFont(new java.awt.Font("Arial", 1, 10));
        MenuFabrica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fab.gif")));
        MenuFabrica.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFabricaActionPerformed(evt);
            }
        });

        MenuFabrica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        BarraMenu.add(MenuFabrica);
        MenuMontagem.setBackground(new java.awt.Color(0, 0, 0));
        MenuMontagem.setForeground(new java.awt.Color(255, 255, 255));
        MenuMontagem.setText("Montagem");
        MenuMontagem.setFont(new java.awt.Font("Arial", 1, 10));
        MenuMontagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/valvula.gif")));
        MenuMontagem.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuMontagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        BarraMenu.add(MenuMontagem);
        MenuExpedicao.setBackground(new java.awt.Color(0, 0, 0));
        MenuExpedicao.setForeground(new java.awt.Color(255, 255, 255));
        MenuExpedicao.setText("Expedi\u00e7\u00e3o");
        MenuExpedicao.setFont(new java.awt.Font("Arial", 1, 10));
        MenuExpedicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pacote.gif")));
        MenuExpedicao.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuExpedicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        BarraMenu.add(MenuExpedicao);
        MenuFerramentas.setBackground(new java.awt.Color(0, 0, 0));
        MenuFerramentas.setForeground(new java.awt.Color(255, 255, 255));
        MenuFerramentas.setText("Ferramentas");
        MenuFerramentas.setFont(new java.awt.Font("Arial", 1, 10));
        MenuFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ferra.gif")));
        MenuFerramentas.setPreferredSize(new java.awt.Dimension(110, 35));
        MenuFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_MouseEntered(evt);
            }
        });

        BarraMenu.add(MenuFerramentas);
        setJMenuBar(BarraMenu);

    }//GEN-END:initComponents

    private void MenuPrincipal_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipal_SairActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_MenuPrincipal_SairActionPerformed

    private void Menu_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_MouseClicked
        evt.getComponent().setBackground(java.awt.Color.green);
        evt.getComponent().setForeground(java.awt.Color.red);
    }//GEN-LAST:event_Menu_MouseClicked

    private void Menu_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_MouseExited
        evt.getComponent().setBackground(java.awt.Color.black);
        evt.getComponent().setForeground(java.awt.Color.white);
    }//GEN-LAST:event_Menu_MouseExited

    private void Menu_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_MouseEntered
        evt.getComponent().setBackground(java.awt.Color.darkGray);
        evt.getComponent().setForeground(java.awt.Color.yellow);
    }//GEN-LAST:event_Menu_MouseEntered

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void MenuFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFabricaActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_MenuFabricaActionPerformed
    
    // MINHAS FUNCOES
/*    private void MudaMenu( javax.swing.event.MouseInputAdapter evt , int tipo )
    {
        if( tipo == 0) //fora
        {
            evt.getComponent().setBackground(java.awt.Color.black);
            evt.getComponent().setForeground(java.awt.Color.white);
        }
        if( tipo == 1) //dentro
        {
            evt.getComponent().setBackground(java.awt.Color.darkGray);
            evt.getComponent().setForeground(java.awt.Color.yellow);
        }
        if( tipo == 2) //click
        {
            evt.getComponent().setBackground(java.awt.Color.lightGray);
            evt.getComponent().setForeground(java.awt.Color.red);
        }
    }    
  */  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenu MenuEstoque;
    private javax.swing.JMenuItem MenuPrincipal_Sistema_Grupos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu MenuPrincipal_Sistema;
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JMenu MenuEscritório;
    private javax.swing.JMenuItem MenuPrincipal_Sair;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuFabrica;
    private javax.swing.JMenu MenuMontagem;
    private javax.swing.JMenu MenuFerramentas;
    private javax.swing.JMenu MenuExpedicao;
    // End of variables declaration//GEN-END:variables
    
}
