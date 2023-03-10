/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typemaster_mini;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

/**
 *
 * @author Adnan & Arman
 */
public class result extends javax.swing.JFrame {

    /**
     * Creates new form result
     */
    
    
    public result(int x, int y, int fileWord, int userWord, int correctWord, long elapsed) {
        initComponents();
        this.setLocation(x+12,y-2);
        
        Integer transfr = new Integer(userWord); 
        String userWrd = transfr.toString(); 
        userWord_.setText(userWrd);
        
        Integer transfr2 = new Integer(fileWord); 
        String fileWrd = transfr2.toString(); 
        fileWord_.setText(fileWrd);
        
        Integer transfr3 = new Integer(correctWord); 
        String crtWrd = transfr3.toString(); 
        correctWord_.setText(crtWrd);
        
        // percentage
            double crr = (double)correctWord;
            double flw = (double) fileWord;
            double   percentageShow =  (crr/flw)*100;
            
        Double transfr4 = percentageShow; 
        String prcnt = transfr4.toString(); 
        //String.format("%.2f", prcnt);
        percentage_.setText(prcnt+"%");
        // time
            long elSecond;
            long showSecond;
            long showMinute;
            elSecond = elapsed/1000;
            showSecond = elSecond%60;
            showMinute = elSecond/60;
        Long transfrTime = new Long(showSecond); 
        String sec = transfrTime.toString(); 
        Long transfrTime2 = new Long(showMinute); 
        String min = transfrTime2.toString();
        
        time_.setText("time : "+min+"min:"+sec+"sec");
        
        if(percentageShow>=0 && percentageShow<=33){
        ImageIcon jColor = new ImageIcon(getClass().getResource("/imageAll/per80.png")); 
        img_.setIcon(jColor);
        }
        if(percentageShow>=33 && percentageShow<=66){
        ImageIcon jColor = new ImageIcon(getClass().getResource("/imageAll/per80.png")); 
        img_.setIcon(jColor);
        }
        if(percentageShow>=66 && percentageShow<=80){
        ImageIcon jColor = new ImageIcon(getClass().getResource("/imageAll/per80.png")); 
        img_.setIcon(jColor);
        }
        if(percentageShow>80 && percentageShow<100){
        ImageIcon jColor = new ImageIcon(getClass().getResource("/imageAll/per80.png")); 
        img_.setIcon(jColor);
        }
        if(percentageShow==100){
        ImageIcon jColor = new ImageIcon(getClass().getResource("/imageAll/per100.png")); 
        img_.setIcon(jColor);
        }
        
    }
    
    public result() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileWord_ = new javax.swing.JLabel();
        userWord_ = new javax.swing.JLabel();
        correctWord_ = new javax.swing.JLabel();
        percentage_ = new javax.swing.JLabel();
        img_ = new javax.swing.JLabel();
        exit_ = new javax.swing.JLabel();
        time_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fileWord_.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fileWord_.setForeground(new java.awt.Color(255, 255, 255));
        fileWord_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fileWord_, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 19, 33, 33));

        userWord_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userWord_.setForeground(new java.awt.Color(255, 255, 255));
        userWord_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(userWord_, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 55, 33, 33));

        correctWord_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correctWord_.setForeground(new java.awt.Color(255, 255, 255));
        correctWord_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(correctWord_, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 89, 33, 33));

        percentage_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        percentage_.setForeground(new java.awt.Color(255, 255, 255));
        percentage_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(percentage_, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 284, 90, 50));
        getContentPane().add(img_, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 235, 140, 145));

        exit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_MouseClicked(evt);
            }
        });
        getContentPane().add(exit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, 53, 33));

        time_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(time_, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, 20));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typemaster_mini/result.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exit_MouseClicked

        int mouseX;
        int mouseY;
        int x;
        int y;
        
    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctWord_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel exit_;
    private javax.swing.JLabel fileWord_;
    private javax.swing.JLabel img_;
    private javax.swing.JLabel percentage_;
    private javax.swing.JLabel time_;
    private javax.swing.JLabel userWord_;
    // End of variables declaration//GEN-END:variables
}
