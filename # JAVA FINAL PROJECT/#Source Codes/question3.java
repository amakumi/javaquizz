/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject1;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author OWNER
 */
public final class question3 extends javax.swing.JFrame
{

    /**
     * Creates new form question3
     */
    String value;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;
    
    public question3() 
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        question3 = new javax.swing.JTextArea();
        A3 = new javax.swing.JRadioButton();
        C3 = new javax.swing.JRadioButton();
        D3 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        answer_button = new javax.swing.JButton();
        picture3 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        scorebox = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        question3.setColumns(20);
        question3.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        question3.setRows(5);
        question3.setText("In the late 1780s, Europe saw one of the most historic war which led to a\ntotal reformation of a country's system, both social, and politically. \nSeveral leaders were beheaded, government was overthrown and \nrestructured.\n\nThe particular war is known as...");
        jScrollPane1.setViewportView(question3);

        A3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        A3.setText("Battle of Hastings");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        C3.setText("French Revolution");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        D3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        D3.setText("Siege of Normandy");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B3.setText("Black Death");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        answer_button.setText("Submit");
        answer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_buttonActionPerformed(evt);
            }
        });

        picture3.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\FINAL PROJECTS\\FINAL PROJECT JAVA\\French_Revolution-58b74d7a5f9b588080568758.jpg")); // NOI18N

        progressBar.setValue(20);
        progressBar.setVisible(true);

        scorebox.setText("SCORE: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 603, Short.MAX_VALUE)
                        .addComponent(answer_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scorebox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(picture3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C3)
                                    .addComponent(A3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D3)
                                    .addComponent(B3))
                                .addGap(39, 39, 39)))))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scorebox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer_button)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton()
    {
        ButtonGroup bg2 = new ButtonGroup();

        bg2.add(A3);
        bg2.add(B3);
        bg2.add(C3);
        bg2.add(D3);
    }
    
    public void showscore()
    {
        scoreboard scr = new scoreboard();
        scorebox.setText("Score: " + scr.getScore());
    }
    
    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        value = "Battle of Hastings";
    }//GEN-LAST:event_A3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        value = "French Revolution";
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
        value = "Siege of Normandy";
    }//GEN-LAST:event_D3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        value = "Black Death";
    }//GEN-LAST:event_B3ActionPerformed

    public void checkanswer()
    {
        if("French Revolution".equals(value))
            {
                scoreboard scr = new scoreboard();
                scr.addScore();
            }
    }
    
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
            String extractQuery= "SELECT inputted_answers.ans, answers.ans FROM answers INNER JOIN (SELECT ans FROM inputted_answers order by id desc limit 1) as inputted_answers on inputted_answers.ans = answers.ans";
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
            JOptionPane.showMessageDialog(this, "Done!");
        }
        
        checkanswer();
        question4 q = new question4();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_answer_buttonActionPerformed

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
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new question3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton D3;
    private javax.swing.JButton answer_button;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel picture3;
    private static javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea question3;
    private javax.swing.JLabel scorebox;
    // End of variables declaration//GEN-END:variables
}
