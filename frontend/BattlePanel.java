package frontend;

import domain.Matrix;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ahern
 */
public class BattlePanel extends javax.swing.JPanel {

    /**
     * Creates new form BattlePanel
     */

    public BattlePanel() {
        initComponents();
        setBackground(Color.DARK_GRAY);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myField2 = new frontend.MyField();
        enemyField1 = new frontend.EnemyField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        javax.swing.GroupLayout myField2Layout = new javax.swing.GroupLayout(myField2);
        myField2.setLayout(myField2Layout);
        myField2Layout.setHorizontalGroup(
            myField2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        myField2Layout.setVerticalGroup(
            myField2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout enemyField1Layout = new javax.swing.GroupLayout(enemyField1);
        enemyField1.setLayout(enemyField1Layout);
        enemyField1Layout.setHorizontalGroup(
            enemyField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        enemyField1Layout.setVerticalGroup(
            enemyField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(myField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(enemyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.  
        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public int getHeight() {
        return enemyField1.getHeight() + 140; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWidth() {
        return (enemyField1.getWidth() * 2) + 200; //To change body of generated methods, choose Tools | Templates.
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private frontend.EnemyField enemyField1;
    private frontend.MyField myField2;
    // End of variables declaration//GEN-END:variables
}
