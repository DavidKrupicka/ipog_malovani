package vektEdit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

public class HlavniJFrame extends javax.swing.JFrame {

    private final String title = "Vektorový grafický editor ";

    public HlavniJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPanelNastrojuPoloha = new javax.swing.ButtonGroup();
        buttonGroupTlacitka = new javax.swing.ButtonGroup();
        jPanelOvladaci = new javax.swing.JPanel();
        jPanelTlacitka = new javax.swing.JPanel();
        jToggleButtonVyber = new javax.swing.JToggleButton();
        jToggleButtonPero = new javax.swing.JToggleButton();
        jToggleButtonUsecka = new javax.swing.JToggleButton();
        jToggleButtonPravouhenik = new javax.swing.JToggleButton();
        jToggleButtonOval = new javax.swing.JToggleButton();
        jToggleButtonText = new javax.swing.JToggleButton();
        jPanelBarvy = new javax.swing.JPanel();
        jPanelBarvaPopredi = new javax.swing.JPanel();
        jPanelBarvaPozadi = new javax.swing.JPanel();
        platno = new vektEdit.Platno();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSoubor = new javax.swing.JMenu();
        jMenuItemSouborNovy = new javax.swing.JMenuItem();
        jMenuItemSouborOtevrit = new javax.swing.JMenuItem();
        jMenuItemSoubrUlozit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSouborKonec = new javax.swing.JMenuItem();
        jMenuOkno = new javax.swing.JMenu();
        jMenuOknoZobrazit = new javax.swing.JMenu();
        jCheckBoxMenuItemOknoZobrazitPanel = new javax.swing.JCheckBoxMenuItem();
        jMenuOknoRozvrzeni = new javax.swing.JMenu();
        jMenuOknoRozvrzeniPanel = new javax.swing.JMenu();
        jRadioButtonMenuItemOknoRozvrzeniPanelVlevo = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemOknoRozvrzeniPanelVpravo = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vektorový grafický editor");
        setBounds(new java.awt.Rectangle(0, 0, 900, 360));

        jPanelOvladaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelTlacitka.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTlacitka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTlacitkaMouseClicked(evt);
            }
        });
        jPanelTlacitka.setLayout(new java.awt.GridLayout(0, 2));

        buttonGroupTlacitka.add(jToggleButtonVyber);
        jToggleButtonVyber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/vyber.png"))); // NOI18N
        jToggleButtonVyber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonVyberMouseClicked(evt);
            }
        });
        jToggleButtonVyber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVyberActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonVyber);

        buttonGroupTlacitka.add(jToggleButtonPero);
        jToggleButtonPero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/pero.png"))); // NOI18N
        jToggleButtonPero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonPeroMouseClicked(evt);
            }
        });
        jToggleButtonPero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPeroActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonPero);

        buttonGroupTlacitka.add(jToggleButtonUsecka);
        jToggleButtonUsecka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/cara.png"))); // NOI18N
        jToggleButtonUsecka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonUseckaMouseClicked(evt);
            }
        });
        jToggleButtonUsecka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUseckaActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonUsecka);

        buttonGroupTlacitka.add(jToggleButtonPravouhenik);
        jToggleButtonPravouhenik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/obdelnik.png"))); // NOI18N
        jToggleButtonPravouhenik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonPravouhenikMouseClicked(evt);
            }
        });
        jToggleButtonPravouhenik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPravouhenikActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonPravouhenik);

        buttonGroupTlacitka.add(jToggleButtonOval);
        jToggleButtonOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/kruh.png"))); // NOI18N
        jToggleButtonOval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonOvalMouseClicked(evt);
            }
        });
        jToggleButtonOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOvalActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonOval);

        buttonGroupTlacitka.add(jToggleButtonText);
        jToggleButtonText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vektEdit/ikony/text.png"))); // NOI18N
        jToggleButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonTextMouseClicked(evt);
            }
        });
        jToggleButtonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonTextActionPerformed(evt);
            }
        });
        jPanelTlacitka.add(jToggleButtonText);

        jPanelBarvy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBarvy.setLayout(new java.awt.GridLayout(0, 1));

        jPanelBarvaPopredi.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBarvaPopredi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBarvaPopredi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarvaPoprediMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarvaPoprediLayout = new javax.swing.GroupLayout(jPanelBarvaPopredi);
        jPanelBarvaPopredi.setLayout(jPanelBarvaPoprediLayout);
        jPanelBarvaPoprediLayout.setHorizontalGroup(
            jPanelBarvaPoprediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanelBarvaPoprediLayout.setVerticalGroup(
            jPanelBarvaPoprediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanelBarvy.add(jPanelBarvaPopredi);

        jPanelBarvaPozadi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarvaPozadi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBarvaPozadi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBarvaPozadiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarvaPozadiLayout = new javax.swing.GroupLayout(jPanelBarvaPozadi);
        jPanelBarvaPozadi.setLayout(jPanelBarvaPozadiLayout);
        jPanelBarvaPozadiLayout.setHorizontalGroup(
            jPanelBarvaPozadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanelBarvaPozadiLayout.setVerticalGroup(
            jPanelBarvaPozadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanelBarvy.add(jPanelBarvaPozadi);
        jPanelBarvaPozadi.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanelOvladaciLayout = new javax.swing.GroupLayout(jPanelOvladaci);
        jPanelOvladaci.setLayout(jPanelOvladaciLayout);
        jPanelOvladaciLayout.setHorizontalGroup(
            jPanelOvladaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOvladaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOvladaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelTlacitka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelBarvy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanelOvladaciLayout.setVerticalGroup(
            jPanelOvladaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOvladaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTlacitka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanelBarvy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelOvladaci, java.awt.BorderLayout.EAST);

        platno.setBackground(new java.awt.Color(255, 255, 255));
        platno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                platnoMouseDragged(evt);
            }
        });
        platno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                platnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                platnoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout platnoLayout = new javax.swing.GroupLayout(platno);
        platno.setLayout(platnoLayout);
        platnoLayout.setHorizontalGroup(
            platnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        platnoLayout.setVerticalGroup(
            platnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        getContentPane().add(platno, java.awt.BorderLayout.CENTER);

        jMenuSoubor.setText("Soubor");

        jMenuItemSouborNovy.setText("Nový");
        jMenuSoubor.add(jMenuItemSouborNovy);

        jMenuItemSouborOtevrit.setText("Otevřít");
        jMenuSoubor.add(jMenuItemSouborOtevrit);

        jMenuItemSoubrUlozit.setText("Uložit");
        jMenuSoubor.add(jMenuItemSoubrUlozit);
        jMenuSoubor.add(jSeparator1);

        jMenuItemSouborKonec.setText("Konec");
        jMenuItemSouborKonec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSouborKonecActionPerformed(evt);
            }
        });
        jMenuSoubor.add(jMenuItemSouborKonec);

        jMenuBar1.add(jMenuSoubor);

        jMenuOkno.setText("Okno");

        jMenuOknoZobrazit.setText("Zobrazit");

        jCheckBoxMenuItemOknoZobrazitPanel.setSelected(true);
        jCheckBoxMenuItemOknoZobrazitPanel.setText("Panel nástrojů");
        jCheckBoxMenuItemOknoZobrazitPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemOknoZobrazitPanelActionPerformed(evt);
            }
        });
        jMenuOknoZobrazit.add(jCheckBoxMenuItemOknoZobrazitPanel);

        jMenuOkno.add(jMenuOknoZobrazit);

        jMenuOknoRozvrzeni.setText("Rozvržení");

        jMenuOknoRozvrzeniPanel.setText("Panel nástrojů");

        buttonGroupPanelNastrojuPoloha.add(jRadioButtonMenuItemOknoRozvrzeniPanelVlevo);
        jRadioButtonMenuItemOknoRozvrzeniPanelVlevo.setText("Vlevo");
        jRadioButtonMenuItemOknoRozvrzeniPanelVlevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemOknoRozvrzeniPanelVlevoActionPerformed(evt);
            }
        });
        jMenuOknoRozvrzeniPanel.add(jRadioButtonMenuItemOknoRozvrzeniPanelVlevo);

        buttonGroupPanelNastrojuPoloha.add(jRadioButtonMenuItemOknoRozvrzeniPanelVpravo);
        jRadioButtonMenuItemOknoRozvrzeniPanelVpravo.setSelected(true);
        jRadioButtonMenuItemOknoRozvrzeniPanelVpravo.setText("Vpravo");
        jRadioButtonMenuItemOknoRozvrzeniPanelVpravo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemOknoRozvrzeniPanelVpravoActionPerformed(evt);
            }
        });
        jMenuOknoRozvrzeniPanel.add(jRadioButtonMenuItemOknoRozvrzeniPanelVpravo);

        jMenuOknoRozvrzeni.add(jMenuOknoRozvrzeniPanel);

        jMenuOkno.add(jMenuOknoRozvrzeni);

        jMenuBar1.add(jMenuOkno);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOvalActionPerformed
        platno.setRezim(Platno.REZIMY.KRUZNICE);
        this.setTitle(title + " | " + platno.getRezim().toString());
    }//GEN-LAST:event_jToggleButtonOvalActionPerformed

    private void jToggleButtonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonTextActionPerformed
        platno.setRezim(Platno.REZIMY.TEXT);
        this.setTitle(title + " | " + platno.getRezim().toString());
    }//GEN-LAST:event_jToggleButtonTextActionPerformed

    private void jToggleButtonPravouhenikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPravouhenikActionPerformed
        platno.setRezim(Platno.REZIMY.PRAVOUHELNIK);
        this.setTitle(title + " | " + platno.getRezim().toString());
    }//GEN-LAST:event_jToggleButtonPravouhenikActionPerformed

    private void jToggleButtonUseckaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUseckaActionPerformed
        platno.setRezim(Platno.REZIMY.USECKA);
        this.setTitle(title + " | " + platno.getRezim().toString());
    }//GEN-LAST:event_jToggleButtonUseckaActionPerformed

    private void jToggleButtonPeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPeroActionPerformed
        platno.setRezim(Platno.REZIMY.ODRUKY);
        this.setTitle(title + " | " + platno.getRezim().toString());
    }//GEN-LAST:event_jToggleButtonPeroActionPerformed

    private void jToggleButtonVyberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVyberActionPerformed
        platno.setRezim(Platno.REZIMY.VYBER);
        setTitle(title + " | " + Platno.REZIMY.VYBER.toString());
    }//GEN-LAST:event_jToggleButtonVyberActionPerformed

    private void jMenuItemSouborKonecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSouborKonecActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSouborKonecActionPerformed

    private void jCheckBoxMenuItemOknoZobrazitPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemOknoZobrazitPanelActionPerformed
        if(jCheckBoxMenuItemOknoZobrazitPanel.isSelected()){
            jPanelOvladaci.setVisible(true);
        }else{
            jPanelOvladaci.setVisible(false);
        }    
    }//GEN-LAST:event_jCheckBoxMenuItemOknoZobrazitPanelActionPerformed

    private void jRadioButtonMenuItemOknoRozvrzeniPanelVlevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemOknoRozvrzeniPanelVlevoActionPerformed
        this.add(jPanelOvladaci, BorderLayout.WEST);
        invalidate();
        validate();       
    }//GEN-LAST:event_jRadioButtonMenuItemOknoRozvrzeniPanelVlevoActionPerformed

    private void jRadioButtonMenuItemOknoRozvrzeniPanelVpravoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemOknoRozvrzeniPanelVpravoActionPerformed
        this.add(jPanelOvladaci, BorderLayout.EAST);
        invalidate();
        validate();
    }//GEN-LAST:event_jRadioButtonMenuItemOknoRozvrzeniPanelVpravoActionPerformed

    private void jPanelBarvaPoprediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarvaPoprediMouseClicked
        Color barva;
        barva = JColorChooser.showDialog(this, "text", jPanelBarvaPopredi.getBackground());
        jPanelBarvaPopredi.setBackground(barva);
        platno.setBarvaPopredi(barva);
    }//GEN-LAST:event_jPanelBarvaPoprediMouseClicked

    private void jPanelBarvaPozadiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarvaPozadiMouseClicked
        jPanelBarvaPozadi.setBackground(JColorChooser.showDialog(this, "text", jPanelBarvaPozadi.getBackground()));
    }//GEN-LAST:event_jPanelBarvaPozadiMouseClicked

    private void jPanelTlacitkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTlacitkaMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jPanelTlacitkaMouseClicked

    private void jToggleButtonVyberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonVyberMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonVyberMouseClicked

    private void jToggleButtonPeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonPeroMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonPeroMouseClicked

    private void jToggleButtonUseckaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonUseckaMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonUseckaMouseClicked

    private void jToggleButtonPravouhenikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonPravouhenikMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonPravouhenikMouseClicked

    private void jToggleButtonOvalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonOvalMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonOvalMouseClicked

    private void jToggleButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonTextMouseClicked
        rezimReset(evt);
    }//GEN-LAST:event_jToggleButtonTextMouseClicked

    private void platnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platnoMousePressed
    }//GEN-LAST:event_platnoMousePressed

    private void platnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platnoMouseReleased
    }//GEN-LAST:event_platnoMouseReleased

    private void platnoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platnoMouseDragged
        Graphics g = platno.getGraphics();
        //g.setColor();
        int x = evt.getX();
        int y = evt.getY();
        g.drawOval(x, y, 8, 8);
        g.fillOval(x, y, 8, 8);
    }//GEN-LAST:event_platnoMouseDragged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HlavniJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPanelNastrojuPoloha;
    private javax.swing.ButtonGroup buttonGroupTlacitka;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemOknoZobrazitPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSouborKonec;
    private javax.swing.JMenuItem jMenuItemSouborNovy;
    private javax.swing.JMenuItem jMenuItemSouborOtevrit;
    private javax.swing.JMenuItem jMenuItemSoubrUlozit;
    private javax.swing.JMenu jMenuOkno;
    private javax.swing.JMenu jMenuOknoRozvrzeni;
    private javax.swing.JMenu jMenuOknoRozvrzeniPanel;
    private javax.swing.JMenu jMenuOknoZobrazit;
    private javax.swing.JMenu jMenuSoubor;
    private javax.swing.JPanel jPanelBarvaPopredi;
    private javax.swing.JPanel jPanelBarvaPozadi;
    private javax.swing.JPanel jPanelBarvy;
    private javax.swing.JPanel jPanelOvladaci;
    private javax.swing.JPanel jPanelTlacitka;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemOknoRozvrzeniPanelVlevo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemOknoRozvrzeniPanelVpravo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButtonOval;
    private javax.swing.JToggleButton jToggleButtonPero;
    private javax.swing.JToggleButton jToggleButtonPravouhenik;
    private javax.swing.JToggleButton jToggleButtonText;
    private javax.swing.JToggleButton jToggleButtonUsecka;
    private javax.swing.JToggleButton jToggleButtonVyber;
    private vektEdit.Platno platno;
    // End of variables declaration//GEN-END:variables

    private void rezimReset(MouseEvent evt) {
        if(evt.getButton() == 3){
            platno.setRezim(Platno.REZIMY.NIC);
            this.setTitle(title + " | " + platno.getRezim().toString());
            jToggleButtonOval.setSelected(false);
            jToggleButtonPero.setSelected(false);
            jToggleButtonPravouhenik.setSelected(false);
            jToggleButtonText.setSelected(false);
            jToggleButtonUsecka.setSelected(false);
            jToggleButtonVyber.setSelected(false);
        }
    }
}
