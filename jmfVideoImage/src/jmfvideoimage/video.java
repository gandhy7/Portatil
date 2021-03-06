package jmfvideoimage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class video extends javax.swing.JFrame {

    jmfVideo b = new jmfVideo();
    /** Creates new form video */
    public video() {
        initComponents();
        this.setTitle("Captura de Imagen desde WebCam - by Mouse");
        //formulario al centro de la pantalla
        this.setLocationRelativeTo(null);
        //se coloca un layout tipo CAJA        
        VIDEO.setLayout(new javax.swing.BoxLayout(VIDEO, javax.swing.BoxLayout.LINE_AXIS));
        //se añade el componente de video
        VIDEO.add(b.Componente());
        imagen.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        VIDEO = new javax.swing.JPanel();
        MENU = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcSlide1 = new jcSlide.jcSlide();
        IMAGEN = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        VIDEO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VIDEO.setPreferredSize(new java.awt.Dimension(320, 240));

        javax.swing.GroupLayout VIDEOLayout = new javax.swing.GroupLayout(VIDEO);
        VIDEO.setLayout(VIDEOLayout);
        VIDEOLayout.setHorizontalGroup(
            VIDEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        VIDEOLayout.setVerticalGroup(
            VIDEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(VIDEO, gridBagConstraints);

        MENU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MENU.setPreferredSize(new java.awt.Dimension(140, 240));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmfvideoimage/IMAGE_CAPTURE.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmfvideoimage/PREVIEW.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENULayout = new javax.swing.GroupLayout(MENU);
        MENU.setLayout(MENULayout);
        MENULayout.setHorizontalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        MENULayout.setVerticalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        getContentPane().add(MENU, gridBagConstraints);

        jcSlide1.setPreferredSize(new java.awt.Dimension(800, 260));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 10);
        getContentPane().add(jcSlide1, gridBagConstraints);

        IMAGEN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IMAGEN.setPreferredSize(new java.awt.Dimension(320, 240));
        IMAGEN.setLayout(new java.awt.GridBagLayout());

        imagen.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        IMAGEN.add(imagen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(IMAGEN, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        b.capturarImagen();
        jcSlide1.setImagen(new ImageIcon(b.getImagen()));        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if( jcSlide1.getImagen() != null ){
            imagen.setIcon( jcSlide1.getImagen() );
        }else{
        JOptionPane.showMessageDialog(this,"Por favor. Debe seleccionar una imagen...");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IMAGEN;
    private javax.swing.JPanel MENU;
    private javax.swing.JPanel VIDEO;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private jcSlide.jcSlide jcSlide1;
    // End of variables declaration//GEN-END:variables

}
