/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject1;                                      //INITIALIZATION
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author OWNER
 */
public class mainmenu extends javax.swing.JFrame
{
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Statement stmt;
    String value;
    String name;
    
    public mainmenu() //this is where the program runs calling its functions
    {
        initComponents();                       // initialize components necessary to display this specific frame
        setTitle("QUIZ");                       // sets this fram's title
        image();                                // calls the function to display an image
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void image() //load an image to be displayed in the menu
    {
        try
        {
            BufferedImage myPicture = ImageIO.read(new File("image1.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);    
        }
        catch(Exception e)
        {
            //System.err.print("\n[IMAGE] Whoops.. Somethings not right.. ");
            //e.printStackTrace();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(720, 0), new java.awt.Dimension(720, 0), new java.awt.Dimension(720, 32767));
        settings_button = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        title = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(720, 0), new java.awt.Dimension(720, 0), new java.awt.Dimension(720, 32767));
        about_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 70));

        play_button.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        play_button.setText("PLAY!");
        play_button.setToolTipText("");
        play_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_buttonActionPerformed(evt);
            }
        });

        exit_button.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        exit_button.setText("EXIT");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        filler1.setAutoscrolls(true);
        filler1.setBackground(java.awt.Color.pink);
        filler1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        filler1.setDoubleBuffered(true);
        filler1.setForeground(new java.awt.Color(30, 30, 130));

        settings_button.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        settings_button.setText("SETTINGS");
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(187, 187, 187));
        title.setFont(new java.awt.Font("Leelawadee", 0, 96)); // NOI18N
        title.setForeground(java.awt.Color.lightGray);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("QUIZ");
        title.setToolTipText("");

        jDesktopPane1.setLayer(title, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filler2.setAutoscrolls(true);
        filler2.setBackground(java.awt.Color.pink);
        filler2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        filler2.setDoubleBuffered(true);
        filler2.setForeground(new java.awt.Color(30, 30, 130));

        about_button.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        about_button.setText("ABOUT");
        about_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(settings_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(play_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(about_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(play_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settings_button)
                .addGap(4, 4, 4)
                .addComponent(about_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_button)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //perform the action if the PLAY BUTTON is clicked
    private void play_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_buttonActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Are you ready?");
        setName();
        q_choice q = new q_choice();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_play_buttonActionPerformed

    //set the player's name to be used throughout the game
    public void setName()
    {
        String name;
        name = JOptionPane.showInputDialog(null, "Please enter your name!");
        if(name.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Your name should not be empty!", ":: Warning! ::", JOptionPane.WARNING_MESSAGE);
            name = JOptionPane.showInputDialog(null, "Please enter your name!");
        }
        JOptionPane.showMessageDialog(null, "Get ready " + name + "!");
        try
        {
            String submittedName = "INSERT INTO scores(name) VALUES (?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject1", "root", "");
            pst = conn.prepareStatement(submittedName);
            
            pst.setString(1, name);
            pst.execute();
        }
        catch(Exception e)
        {
            System.err.print("\n[NAME] Whoops.. Somethings not right.. ");
        }
    }
    
    //@Override
    public String get_playername()
    {
        String sql = "SELECT scores.name FROM scores";
            
            try
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject1", "root", "");
                stmt = conn.createStatement();
                //pst = conn.prepareStatement(sql);
                rs = stmt.executeQuery(sql);                                                                                                                                                                                                                                                                                                       
                //pst.executeUpdate();
                //rs = pst.executeQuery();
                while(rs.next())
                {
                    String name = rs.getString("name");
                    return name;
                }
            }
            catch (Exception e)
            {
                System.err.print("\n[GETNAME] Whoops.. Somethings not right.. ");
                e.printStackTrace();
            }
            return name;
    }
    
    // perform the action if the EXIT BUTTON is clicked/selected
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        try
        {
            //stmt.close();
            //conn.close();
            System.exit(0);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Bye..");
        }
        
    }//GEN-LAST:event_exit_buttonActionPerformed

    // perform the action if the SETTINGS BUTTON is clicked/selected
    private void settings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_buttonActionPerformed
        // make the specific fram appear then close this frame:
        settings q = new settings();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_settings_buttonActionPerformed

    // perform the action if the ABOUT BUTTON is clicked/selected
    private void about_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_buttonActionPerformed
        // make the specific fram appear then close this frame:
        about q = new about();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_about_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()                       // calls the main class to run the program
            {
                new mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_button;
    private javax.swing.JButton exit_button;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton play_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}