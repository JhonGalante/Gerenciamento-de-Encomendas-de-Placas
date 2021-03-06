/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DadosEncomendasAndamento;
import dao.DadosEncomendasFinalizadas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Encomenda;

/**
 *
 * @author jhonata
 */
public class GuiGerenciarEncomendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiGerenciarEncomendas
     */
    private static Boolean aberto = false;
    private static Integer qtdeNoDia;
    private static LocalDate dia = LocalDate.now();
    private DadosEncomendasAndamento dadosAndamento = new DadosEncomendasAndamento();
    private DadosEncomendasFinalizadas dadosFinalizadas = new DadosEncomendasFinalizadas();
    
    public GuiGerenciarEncomendas() {
        initComponents();
    }
    
    public static GuiGerenciarEncomendas getInstance() {
        if (aberto) return null;
        aberto = true;
        return new GuiGerenciarEncomendas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblEncFinalizadas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblEncAndamento = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Encomendas");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Finalizadas"));

        TblEncFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Valor do Serviço", "Data de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblEncFinalizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEncFinalizadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblEncFinalizadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Em andamento"));

        TblEncAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Valor do Serviço", "Prazo de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblEncAndamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEncAndamentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblEncAndamento);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar)
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnAlterar)
                    .addComponent(btnApagar)
                    .addComponent(btnFinalizar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        GuiAdicionarEncomenda gi = new GuiAdicionarEncomenda(null, true);
        gi.setAlterando(false);
        verificarEncomendasDia();
        gi.setDia(dia);
        gi.setVisible(true);
        if(gi.getEncomenda() != null){
            try {
                dadosAndamento.incluir(gi.getEncomenda());
                preencherTabelas();
            } catch (Exception ex) {
                Logger.getLogger(GuiGerenciarEncomendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        aberto = false;
    }//GEN-LAST:event_formInternalFrameClosing

    private void TblEncAndamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEncAndamentoMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            if(TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0) != null){
                GuiAdicionarEncomenda gi = new GuiAdicionarEncomenda(null, true);
                Encomenda encomenda = (Encomenda) TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0);
                gi.setEncomenda(encomenda);
                gi.getBtnSalvar().setVisible(false);
                gi.setJustView(true);
                gi.setVisible(true);
                gi.setJustView(false);
            }
        }
    }//GEN-LAST:event_TblEncAndamentoMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        //Get the amount of orders of the day
        try {
            preencherTabelas();
            verificarEncomendasDia();
        } catch (Exception ex) {
            Logger.getLogger(GuiGerenciarEncomendas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void TblEncFinalizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEncFinalizadasMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            if(TblEncFinalizadas.getValueAt(TblEncFinalizadas.getSelectedRow(), 0) != null){
                GuiAdicionarEncomenda gi = new GuiAdicionarEncomenda(null, true);
                gi.setEncomenda((Encomenda) TblEncFinalizadas.getValueAt(TblEncFinalizadas.getSelectedRow(), 0));
                gi.getBtnSalvar().setVisible(false);
                gi.setJustView(true);
                gi.setVisible(true);
                gi.setJustView(false);
            }
        }
    }//GEN-LAST:event_TblEncFinalizadasMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if(TblEncAndamento.getSelectedRow() >= 0){
            GuiAdicionarEncomenda gi = new GuiAdicionarEncomenda(null, true);
            gi.setAlterando(true);
            gi.setEncomenda((Encomenda) TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0));
            gi.setVisible(true);
            try {
                dadosAndamento.alterar();
                preencherTabelas();
            } catch (Exception ex) {
                Logger.getLogger(GuiGerenciarEncomendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        try {
            // TODO add your handling code here:
            dadosAndamento.excluir((Encomenda) TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0));
            preencherTabelas();
        } catch (Exception ex) {
            Logger.getLogger(GuiGerenciarEncomendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formFocusGained

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        try {
            Encomenda encomenda = (Encomenda) TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0);
            LocalDate dataEntrega = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de entrega da encomenda"), DateTimeFormatter.ofPattern("d/MM/yyyy"));
            dadosAndamento.excluir((Encomenda) TblEncAndamento.getValueAt(TblEncAndamento.getSelectedRow(), 0));
            encomenda.setDataEntrega(dataEntrega);
            dadosFinalizadas.incluir(encomenda);
            preencherTabelas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel finalizar a encomenda");
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    //Fill in the table
    private void preencherTabelas() throws Exception{
       
        DefaultTableModel tbl1 = (DefaultTableModel) TblEncAndamento.getModel();
        int qtdeLinhas1 = tbl1.getRowCount();
        
        for(int i = qtdeLinhas1 - 1; i >= 0 ; i--){
            tbl1.removeRow(0);
        }
        
        for (Encomenda enc1: dadosAndamento.getList()){
            Object linha[] = {enc1, enc1.getValorServico(), enc1.getPrazoEntrega().format(DateTimeFormatter.ofPattern("d/MM/yyyy"))};
            tbl1.addRow(linha);
        }
        
        //----------------------------------------------------------------------------
        
        DefaultTableModel tbl2 = (DefaultTableModel) TblEncFinalizadas.getModel();
        int qtdeLinhas2 = tbl2.getRowCount();
        
        for(int i = qtdeLinhas2 - 1; i >= 0 ; i--){
            tbl2.removeRow(0);
        }
        
        for (Encomenda enc2: dadosFinalizadas.getList()){
            Object linha[] = {enc2, enc2.getValorServico(), enc2.getDataEntrega().format(DateTimeFormatter.ofPattern("d/MM/yyyy"))};
            tbl2.addRow(linha);
        }
           
    }
    
    private void verificarEncomendasDia(){
        qtdeNoDia = 0;
        List<Encomenda> encomendasTotais = new ArrayList();
        try{
            encomendasTotais.addAll(dadosAndamento.getList());
            encomendasTotais.addAll(dadosFinalizadas.getList());
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        for(Encomenda encomenda: encomendasTotais){
            if(encomenda.getPrazoEntrega().isEqual(dia)){
                qtdeNoDia++;
                 if(qtdeNoDia >= 2){
                    dia = dia.plusDays(1);
                    qtdeNoDia = 0;
                 }
            }
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblEncAndamento;
    private javax.swing.JTable TblEncFinalizadas;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}