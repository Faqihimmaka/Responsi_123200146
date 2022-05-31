package Responsi_123200146;

import java.awt.event.*;
import javax.swing.*;
public class Cont {
    ModAslab modelContact;
    ViewAslab aslabView;
    public String data;
    public Cont(ModAslab modelContact, ViewAslab aslabView){
        this.modelContact = modelContact;
        this.aslabView = aslabView;
        
        if (modelContact.getBanyakData()!=0) {
            String dataAslab[][] = modelContact.readContact();
            aslabView.tabel.setModel((new JTable(dataAslab, aslabView.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
         aslabView.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = aslabView.getNama();
                double porto = Double.parseDouble(aslabView.getPorto());
                double micro = Double.parseDouble(aslabView.getMicro());
                double wawan = Double.parseDouble(aslabView.getWawan());
                double Rating = (porto+micro+wawan)/3;
                modelContact.insertData(nama, porto, micro, wawan, Rating);
         
                String dataAslab[][] = modelContact.readContact();
                aslabView.tabel.setModel((new JTable(dataAslab, aslabView.namaKolom)).getModel());
            }
        });
         
          aslabView.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String nama = aslabView.getNama();
                double porto = Double.parseDouble(aslabView.getPorto());
                double micro = Double.parseDouble(aslabView.getMicro());
                double wawan = Double.parseDouble(aslabView.getWawan());
                double hasil = (porto+micro+wawan)/3;
                modelContact.updateData(nama, porto, micro, wawan, hasil);

                String dataAslab[][] = modelContact.readContact();
                aslabView.tabel.setModel((new JTable(dataAslab, aslabView.namaKolom)).getModel());
            }
        });
         
          aslabView.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                aslabView.tfNama.setText("");
                aslabView.tfPorto.setText("");
                aslabView.tfMicro.setText("");
                aslabView.tfWawan.setText("");
            }
        });
        
    
          aslabView.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int baris = aslabView.tabel.getSelectedRow();
                data = aslabView.tabel.getValueAt(baris, 0).toString();
                String dataUpdate[] = new String[4];
                dataUpdate[0] = aslabView.tabel.getValueAt(baris, 0).toString();
                dataUpdate[1] = aslabView.tabel.getValueAt(baris, 1).toString();
                System.out.println(data);
            }
           });
                  
          aslabView.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int input = JOptionPane.showConfirmDialog(null,
                "Apa anda ingin menghapus Nama " + data + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                modelContact.deleteContact(data);
                String dataAslab[][] = modelContact.readContact();
                aslabView.tabel.setModel((new JTable(dataAslab, aslabView.namaKolom)).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }
                }
        });

    }
    
}