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
public class id_question5 extends javax.swing.JFrame {

    /**
     * Creates new form id_question5
     */
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Statement stmt;
    String value;
    
    public id_question5()
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

        id_question5 = new javax.swing.JLabel();
        a5_id = new javax.swing.JRadioButton();
        c5_id = new javax.swing.JRadioButton();
        d5_id = new javax.swing.JRadioButton();
        b5_id = new javax.swing.JRadioButton();
        progressBar = new javax.swing.JProgressBar();
        answer_button = new javax.swing.JButton();
        scorebox = new javax.swing.JLabel();
        question5_picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_question5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id_question5.setText("What was the first reason Japan invaded Indonesia in 1942?");

        a5_id.setText("To obtain natural resources");
        a5_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5_idActionPerformed(evt);
            }
        });

        c5_id.setText("It was prophesied by Japanese Monks");
        c5_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5_idActionPerformed(evt);
            }
        });

        d5_id.setText("To accomplish Meiji Restoration");
        d5_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5_idActionPerformed(evt);
            }
        });

        b5_id.setText("To defeat The Netherlands");
        b5_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5_idActionPerformed(evt);
            }
        });

        progressBar.setValue(40); progressBar.setVisible(true);

        answer_button.setText("Submit");
        answer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_buttonActionPerformed(evt);
            }
        });

        scorebox.setText("SCORE: ");

        question5_picture.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Documents\\NetBeansProjects\\FinalProject1\\src\\finalproject1\\jp.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a5_id)
                                    .addComponent(c5_id))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5_id)
                                    .addComponent(d5_id)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(id_question5, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 281, Short.MAX_VALUE))
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(answer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scorebox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(question5_picture)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(scorebox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_question5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(question5_picture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a5_id)
                    .addComponent(b5_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5_id)
                    .addComponent(d5_id))
                .addGap(30, 30, 30)
                .addComponent(answer_button)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton()
    {
        ButtonGroup bg2 = new ButtonGroup();

        bg2.add(a5_id);
        bg2.add(b5_id);
        bg2.add(c5_id);
        bg2.add(d5_id);
    }
    
    public void showscore()
    {
        scoreboard scr = new scoreboard();
        scorebox.setText("Score: " + scr.getScore());
    }
    
    private void a5_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5_idActionPerformed
        // TODO add your handling code here:
        value = "To obtain natural resources";
    }//GEN-LAST:event_a5_idActionPerformed

    private void c5_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5_idActionPerformed
        // TODO add your handling code here:
        value = "It was prophesied by Japanese Monks";
    }//GEN-LAST:event_c5_idActionPerformed

    private void d5_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5_idActionPerformed
        // TODO add your handling code here:
        value = "To accomplish Meiji Restoration";
    }//GEN-LAST:event_d5_idActionPerformed

    private void b5_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5_idActionPerformed
        // TODO add your handling code here:
        value = "To defeat The Netherlands";
    }//GEN-LAST:event_b5_idActionPerformed

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
        id_question6 q = new id_question6();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_answer_buttonActionPerformed

    private void checkanswer()
    {
        if("To obtain natural resources".equals(value))
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
            java.util.logging.Logger.getLogger(id_question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(id_question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(id_question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(id_question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new id_question5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a5_id;
    private javax.swing.JButton answer_button;
    private javax.swing.JRadioButton b5_id;
    private javax.swing.JRadioButton c5_id;
    private javax.swing.JRadioButton d5_id;
    private javax.swing.JLabel id_question5;
    private static javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel question5_picture;
    private javax.swing.JLabel scorebox;
    // End of variables declaration//GEN-END:variables
}
