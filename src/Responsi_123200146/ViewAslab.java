package Responsi_123200146;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ViewAslab extends JFrame{
    JLabel lNama = new JLabel("Nama");
    JLabel lPorto = new JLabel("Portofolio");
    JLabel lMicro = new JLabel("Microteaching");
    JLabel lWawan = new JLabel("Wawancara");
    
    public JTextField tfNama = new JTextField();
    public JTextField tfPorto = new JTextField();
    public JTextField tfMicro = new JTextField();
    public JTextField tfWawan = new JTextField();
    
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Clear");
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Nama","Portofolio", "Microteaching", "Wawancara", "Hasil Akhir" };

    public ViewAslab() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Aslab");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
        
        add(lNama);
        lNama.setBounds(510, 20, 90, 20);
        add(tfNama);
        tfNama.setBounds(510, 40, 120, 20);
        
        add(lPorto);
        lPorto.setBounds(510, 60, 90, 20);
        add(tfPorto);
        tfPorto.setBounds(510, 80, 120, 20);
        
        add(lMicro);
        lMicro.setBounds(510, 100, 90, 20);
        add(tfMicro);
        tfMicro.setBounds(510, 120, 120, 20);
        
        add(lWawan);
        lWawan.setBounds(510, 140, 90, 20);
        add(tfWawan);
        tfWawan.setBounds(510, 160, 120, 20);
        
        add(btnTambah);
        btnTambah.setBounds(510, 190, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(510, 220, 90, 20);
        
        add(btnDelete);
        btnDelete.setBounds(510, 250, 90, 20);
        
        add(btnReset);
        btnReset.setBounds(510, 280, 90, 20);
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getPorto(){
        return tfPorto.getText();
    }
    
    public String getMicro(){
        return tfMicro.getText();
    }
    
    public String getWawan(){
        return tfWawan.getText();
    }
}