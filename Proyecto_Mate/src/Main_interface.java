
import java.text.DecimalFormat;
import java.util.HashSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keilor
 */
public class Main_interface extends javax.swing.JFrame {

    static String valor1;
    static String valor2;
    static String valor3;
    int discriminante;
    static String dat = "";
    DecimalFormat df = new DecimalFormat("#.00");

    /**
     * Creates new form Main_interface
     */
    public Main_interface() {
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

        jbecuacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ECUACIONES");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("x²");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbecuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbecuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        orden();
        inicio();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String contenido = jbecuacion.getText();
        String x = contenido + "x²";
        jbecuacion.setText(x);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jbecuacion.setText(null);
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_interface().setVisible(true);
            }
        });
    }

    public void inicio() {
        if (verificacion() == true) {
            if (verificacion2() == true) {
                if (verificacion3() == true) {
                    dividirecuacionc();
                    concavidad();
                    puntomaxomin();
                    ejex();
                    ejey();
                    eje_simetria();

                } else {

                    dividirecuacionb();
                    dividirecuacionc();
                    concavidad();
                    puntomaxomin();
                    ejex();
                    ejey();
                    eje_simetria();
                }

            } else {

                if (verificacion3() == true) {
                    dividirecuacion();
                    dividirecuacionc();
                    concavidad();
                    puntomaxomin();
                    ejex();
                    ejey();
                    eje_simetria();

                } else {
                    dividirecuacion();
                    dividirecuacionb();
                    dividirecuacionc();
                    concavidad();
                    puntomaxomin();
                    ejex();
                    ejey();
                    eje_simetria();
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion\n"
                    + "ax²+bx+c");
            Main_interface frame = new Main_interface();
            frame.setVisible(true);
            dispose();
        }

    }

    public void dividirecuacion() {
        String valor_a = "";
        String ecuacion = jbecuacion.getText();
        try {
            for (int i = 0; i + 1 < ecuacion.length(); i++) {
                char letraChar = ecuacion.charAt(i);
                char letraChar1 = ecuacion.charAt(i + 1);
                String letra = String.valueOf(letraChar);
                String letra1 = String.valueOf(letraChar1);
                String letraF = letra + letra1;
                if ("x²".equals(letraF)) {
                    int cont = i - 1;
                    while (cont >= 0) {
                        char letraChar2 = ecuacion.charAt(cont);
                        String letra2 = String.valueOf(letraChar2);
                        if (letra2.equals("+") || letra2.equals("-")) {
                            cont = 0;
                            if (letra2.equals("-")) {
                                valor_a = letra2 + valor_a;
                            }
                            break;

                        } else {
                            valor_a = letra2 + valor_a;
                            cont--;
                        }

                    }

                }

            }
            valor1 = valor_a;
            jTextArea1.append("\n" + "El valor de a es: " + valor_a);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion");
        }

    }

    public void puntomaxomin() {
        int valora = Integer.parseInt(valor1);
        if (valora > 0) {
            jTextArea1.append("\n" + "Punto maximo");
        } else {
            jTextArea1.append("\n" + "Punto minimo");
        }
    }

    public void dividirecuacionb() {
        String valor_a = "";
        String ecuacion = jbecuacion.getText();
        try {
            for (int i = 0; i + 1 < ecuacion.length(); i++) {
                char letraChar = ecuacion.charAt(i);
                char letraChar1 = ecuacion.charAt(i + 1);
                String letra = String.valueOf(letraChar);
                String letra1 = String.valueOf(letraChar1);
                String letraF = letra + letra1;
                if (letraF.equals("x-") || letraF.equals("x+")) {
                    int cont = i - 1;
                    while (cont >= 0) {
                        char letraChar2 = ecuacion.charAt(cont);
                        String letra2 = String.valueOf(letraChar2);
                        if (letra2.equals("+") || letra2.equals("-")) {
                            cont = 0;
                            if (letra2.equals("-")) {
                                valor_a = letra2 + valor_a;
                            }
                            break;
                        } else {
                            valor_a = letra2 + valor_a;
                            cont--;
                        }

                    }

                }

            }
            valor2 = valor_a;
            jTextArea1.append("\n" + "El valor de b es: " + valor_a);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion");
        }

    }

    public void dividirecuacionc() {
        String remplazado1 = null;
        String cadena_b = null;
        String ecuacion = jbecuacion.getText();
        String remplazad4 = ecuacion.replace("-x²+", "");
        String remplazad44 = remplazad4.replace("-x²", "");
        String remplazad = remplazad44.replace(valor1 + "x²", "");
        String remplazadd = remplazad.replace("x²", "");
        String remplazaddd = remplazadd.replace("x²+", "");
        String remplazadol = remplazaddd.replace(valor2 + "x", "");
        String remplazadoo = remplazadol.replace("-x", "");
        String remplazadooo = remplazadoo.replace("x", "");
        String remplazado = remplazadooo.replace("x²-", "");
        System.out.println("fewf" + remplazado);
        char letraChar1 = remplazado.charAt(0);

        String letra = String.valueOf(letraChar1);
        System.out.println("ewdf" + letra);
        if (letra.equals("+")) {
            System.out.println(letra);
            String remplazado11 = remplazado.replace("+", "");
            valor3 = remplazado11;
            jTextArea1.append("\n" + "El valor de c es: " + remplazado11);
            return;
        }
        /*for (int i = 0; i + 1 < remplazado.length(); i++) {
            char letraChar = remplazado.charAt(i);
            String letra = String.valueOf(letraChar);

            if (letra.equals("+")) {
                remplazado1 = remplazado.replace("+", "");
                System.out.println(remplazado1);
                valor3 = remplazado1;
                jTextArea1.append("\n" + "El valor de c es: " + remplazado1);
                return;

            } else {
                remplazado1 = remplazado.replace("-", "");
                valor3 = remplazado1;
            }

        }*/
        valor3 = remplazado;
        jTextArea1.append("\n" + "El valor de c es: " + remplazado);

    }

    public void ejex() {

        int valorb = Integer.parseInt(valor2);
        int valora = Integer.parseInt(valor1);
        System.out.println(valor3);

        int valorc = Integer.parseInt(valor3);
        System.out.println(valorb + valorb);
        discriminante = (int) (valorb * valorb) - 4 * valora * valorc;
        System.out.println("disc" + discriminante);
        if (discriminante < 0) {
            jTextArea1.append("\n" + "Eje X: No tiene solucion");
            return;
        }
        if (discriminante == 0) {
            double x = -valorb / (2 * valora);
            x = Math.rint(x * 10) / 10;
            jTextArea1.append("\n" + "Eje X:" + x);
            return;
        } else {
            double onex = ((-valorb) + (Math.sqrt(discriminante)));
            double onex2 = ((-valorb) - (Math.sqrt(discriminante)));
            double onex1 = ((2 * valora));

            double x1 = (onex / onex1);
            x1 = Math.rint(x1 * 10) / 10;
            double x2 = (onex2 / onex1);
            x2 = Math.rint(x2 * 10) / 10;
            System.out.println(-valorb);
            System.out.println(x1);
            System.out.println(x2);
            jTextArea1.append("\n" + "Eje X:" + "\n" + " X1= " + x1 + "\n" + " X2: " + x2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jbecuacion;
    // End of variables declaration//GEN-END:variables

    private void concavidad() {
        int valora = Integer.parseInt(valor1);
        if (valora >= 0) {
            jTextArea1.append("\n" + "Concavidad hacia arriba");
        }
        if (valora < 0) {
            jTextArea1.append("\n" + "Concavidad hacia abajo");
        }

    }

    private void ejey() {
        int valora = Integer.parseInt(valor3);
        jTextArea1.append("\n" + "El eje Y:" + " (0," + valora + ")");
    }

    private void eje_simetria() {

        int valorb = Integer.parseInt(valor2);
        int valora = Integer.parseInt(valor1);
        int valorc = Integer.parseInt(valor3);
        double irr = 2 * valora;
        System.out.println(irr);
        double resultado = -valorb / irr;
        resultado = Math.rint(resultado * 10) / 10;
        System.out.println(resultado);
        jTextArea1.append("\n" + "El eje de simetria es: " + resultado);
        double resultado3 = 4 * valora;
        double resultado2 = -discriminante / resultado3;
        System.out.println(resultado2);
        resultado2 = Math.rint(resultado2 * 10) / 10;
        System.out.println(resultado2);
        jTextArea1.append("\n" + "Vertices:: " + "(" + resultado + "," + resultado2 + ")");
        if (valora > 0) {
            jTextArea1.append("\n" + "La función crece desde: ");
            jTextArea1.append("(" + resultado + ",+∞)");
            jTextArea1.append("\n" + "La función decrece desde: ");
            jTextArea1.append("(-∞" + "," + resultado + ")");
            jTextArea1.append("\n" + "El rango es desde: ");
            jTextArea1.append("(" + resultado2 + ",+∞)");
        }else{
            jTextArea1.append("\n" + "La función crece desde: ");
            jTextArea1.append("(-∞,"+ resultado + ")");
            jTextArea1.append("\n" + "La función decrece desde: ");
            jTextArea1.append("(" + resultado + ",+∞)");
            jTextArea1.append("\n" + "El rango es desde: ");
            jTextArea1.append("(-∞," + resultado2 + ")");
            
        }

    }

    public boolean verificacion() {
        String valor_a = "";
        String ecuacion = jbecuacion.getText();
        int contmain = 0;
        try {
            for (int i = 0; i + 1 < ecuacion.length(); i++) {
                char letraChar = ecuacion.charAt(i);
                char letraChar1 = ecuacion.charAt(i + 1);
                String letra = String.valueOf(letraChar);
                String letra1 = String.valueOf(letraChar1);
                String letraF = letra + letra1;
                if ("x²".equals(letraF)) {
                    contmain += 1;

                }
                if (letraF.equals("x-") || letraF.equals("x+")) {
                    contmain += 1;
                }
            }
            if (contmain == 2) {
                return true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion");

        }
        return false;
    }

    public boolean verificacion2() {
        String valor_a = "";
        String ecuacion = jbecuacion.getText();
        char letraChar1 = ecuacion.charAt(0);
        String letra = String.valueOf(letraChar1);
        char letraChar2 = ecuacion.charAt(1);
        String letra2 = String.valueOf(letraChar2);
        System.out.println(letra);
        String letraF = letra + letra2;
        if (letra.equals("-")) {
            char letraChar3 = ecuacion.charAt(2);
            String letra3 = String.valueOf(letraChar3);
            String letra4 = letra2 + letra3;
            dat = "-";
            if (letra4.equals("x²")) {
                valor1 = "-1";
                dat = "-";
                jTextArea1.append("El valor de a es: " + valor1);
                System.out.println(valor1);
                return true;
            } else {
                return false;
            }

        }
        if (letraF.equals("x²")) {
            valor1 = "1";
            jTextArea1.append("El valor de a es: " + valor1);
            return true;
        }
        return false;

    }

    public boolean verificacion3() {
        String valor_a = "";
        String ecuacion = jbecuacion.getText();
        try {
            for (int i = 0; i + 1 < ecuacion.length(); i++) {
                char letraChar = ecuacion.charAt(i);
                char letraChar1 = ecuacion.charAt(i + 1);
                String letra = String.valueOf(letraChar);
                String letra1 = String.valueOf(letraChar1);
                String letraF = letra + letra1;
                if (letraF.equals("x-") || letraF.equals("x+")) {
                    char letraChar2 = ecuacion.charAt(i - 1);
                    String letra3 = String.valueOf(letraChar2);
                    if (letra3.equals("-")) {
                        valor2 = "-1";
                        jTextArea1.append("\n" + "El valor de b es: " + valor2);
                        return true;
                    }
                    if (letra3.equals("+")) {
                        valor2 = "1";
                        jTextArea1.append("\n" + "El valor de b es: " + valor2);
                        return true;

                    }

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion");

        }
        return false;
    }

    public void limpieza() {
        jTextArea1.setText(null);
        jbecuacion.setText(null);
    }

    public void orden() {
        String ecuacion = jbecuacion.getText();
        try {
            for (int i = 0; i + 1 < ecuacion.length(); i++) {
                char letraChar = ecuacion.charAt(i);
                String letra = String.valueOf(letraChar);
                if (letra.equals("+") || letra.equals("-")) {
                    char letraChar1 = ecuacion.charAt(i - 1);
                    char letraChar2 = ecuacion.charAt(i - 2);
                    String letra1 = String.valueOf(letraChar1);
                    String letra2 = String.valueOf(letraChar2);
                    String letraF = letra2 + letra1;
                    if (letraF.equals("x²")) {
                        return;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al escribir la ecuacion\n"
                                + "ax²+bx+c");
                        Main_interface frame = new Main_interface();
                        frame.setVisible(true);
                        dispose();
                        break;

                    }
                }
            }

        } catch (Exception ex) {

        }

    }

}
