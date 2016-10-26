package vektEdit;

import vektEdit.grafickePrimitiva.Usecka;
import vektEdit.grafickePrimitiva.IGrafickyObjekt;
import vektEdit.grafickePrimitiva.Text;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import vektEdit.grafickePrimitiva.*;

public class Platno extends javax.swing.JPanel {
    //TODO

    private REZIMY rezim = REZIMY.NIC;
    private Color barvaPopredi = Color.BLACK;
    private Color barvaPozadi = Color.WHITE;

    public Platno() {
        initComponents();
    }

    public void setRezim(REZIMY novyRezim) {
        rezim = novyRezim;
    }

    public REZIMY getRezim() {
        return rezim;
    }

    public void setBarvaPopredi(Color barvaPopredi) {
        this.barvaPopredi = barvaPopredi;
    }

    public void setBarvaPozadi(Color barvaPozadi) {
        this.barvaPozadi = barvaPozadi;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //TODO

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //TODO
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //TODO
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //TODO
    }//GEN-LAST:event_formMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public enum REZIMY {

        NIC("Neutrální režim"),
        VYBER("Režim výběru"),
        PRAVOUHELNIK("Režim zadávání pravouhelniku"),
        KRUZNICE("Režim zadávání kružnice"),
        TEXT("Režim tvorby textu"),
        USECKA("Režim zadávání úsečky"),
        ODRUKY("Režim kreslení od ruky");
        private final String nazev;

        private REZIMY(String nazev) {
            this.nazev = nazev;
        }

        @Override
        public String toString() {
            return nazev;
        }
    }
}
