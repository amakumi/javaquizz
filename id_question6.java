/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject1;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
/**
 *
 * @author OWNER
 */
public class id_question6 extends javax.swing.JFrame {

    /**
     * Creates new form id_question6
     */
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Statement stmt;
    String value;
    
    public id_question6()
    {
        setTitle("Now Playing... QUIZ");
        initComponents();
        showscore();
        groupButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_question6 = new javax.swing.JLabel();
        a6_id = new javax.swing.JRadioButton();
        c6_id = new javax.swing.JRadioButton();
        d6_id = new javax.swing.JRadioButton();
        b6_id = new javax.swing.JRadioButton();
        progressBar = new javax.swing.JProgressBar();
        answer_button = new javax.swing.JButton();
        scorebox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_question6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        id_question6.setText("Dating back to 1746, the oldest company in Indonesia is a..?");

        a6_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a6_id.setText("Cigarette Company");
        a6_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6_idActionPerformed(evt);
            }
        });

        c6_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c6_id.setText("Textile Company");
        c6_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6_idActionPerformed(evt);
            }
        });

        d6_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d6_id.setText("Post Service");
        d6_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6_idActionPerformed(evt);
            }
        });

        b6_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b6_id.setText("Medicine Shop");
        b6_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6_idActionPerformed(evt);
            }
        });

        progressBar.setValue(50); progressBar.setVisible(true);

        answer_button.setText("Submit");
        answer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_buttonActionPerformed(evt);
            }
        });

        scorebox.setText("SCORE: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a6_id)
                                    .addComponent(c6_id))
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d6_id)
                                    .addComponent(b6_id)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scorebox)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(answer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(id_question6, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorebox)
                .addGap(42, 42, 42)
                .addComponent(id_question6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a6_id)
                    .addComponent(b6_id))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6_id)
                    .addComponent(d6_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(answer_button)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton()
    {
        ButtonGroup bg2 = new ButtonGroup();

        bg2.add(a6_id);
        bg2.add(b6_id);
        bg2.add(c6_id);
        bg2.add(d6_id);
    }
    
    public void showscore()
    {
        scoreboard scr = new scoreboard();
        scorebox.setText("Score: " + scr.getScore());
    }
    
    private void a6_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6_idActionPerformed
        // TODO add your handling code here:
        value = "Cigarette Company";
    }//GEN-LAST:event_a6_idActionPerformed

    private void c6_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6_idActionPerformed
        // TODO add your handling code here:
        value = "Textile Company";
    }//GEN-LAST:event_c6_idActionPerformed

    private void d6_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6_idActionPerformed
        // TODO add your handling code here:
        value = "Post Service";
    }//GEN-LAST:event_d6_idActionPerformed

    private void b6_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6_idActionPerformed
        // TODO add your handling code here:
        value = "Medicine Shop";
    }//GEN-LAST:event_b6_idActionPerformed

    private void answer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_buttonActionPerformed
        // TODO add your handling code here:
        try
        {
            String submittedQuery = "INSERT INTO inputted_answers(ans) VALUES (?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject1", "root", "");
            pst = conn.prepareStatement(submittedQuery);
            pst.setString(1, value);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Are you sure?");
            String extractQuery= "SELECT inputted_answers.ans, idn_answers.ans FROM idn_answers INNER JOIN (SELECT ans FROM inputted_answers order by id desc limit 1) as inputted_answers on inputted_answers.ans = idn_answers.ans";
            pst = conn.prepareStatement(extractQuery);

            rs = pst.executeQuery();
            if(rs.next())
            {
                String valueQuery = "INSERT INTO comparison(value) VALUES (?)";
                pst = conn.prepareStatement(valueQuery);
                pst.setString(1, "Correct!");
                pst.executeUpdate();
            }
            else
            {
                String valueQuery= "INSERT INTO comparison(value) VALUES (?)";
                pst=conn.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Whoops! Check your connection!");
        }

        checkanswer();
        id_question7 q = new id_question7();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_answer_buttonActionPerformed

    private void checkanswer()
    {
        if("Post Service".equals(value))
            { 
                scoreboard scr = new scoreboard();
                scr.addScore();
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(id_question6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(id_question6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(id_question6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(id_question6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new id_question6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a6_id;
    private javax.swing.JButton answer_button;
    private javax.swing.JRadioButton b6_id;
    private javax.swing.JRadioButton c6_id;
    private javax.swing.JRadioButton d6_id;
    private javax.swing.JLabel id_question6;
    private static javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel scorebox;
    // End of variables declaration//GEN-END:variables
}