package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2022 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 203);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		lblNewLabel = new JLabel("LU\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 22, 15, 14);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 49, 49, 14);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 74, 49, 14);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 99, 49, 14);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GitHub URL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 124, 74, 14);
		tabInformation.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel(String.valueOf(studentData.getId()));
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(94, 22, 305, 14);
		tabInformation.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel(studentData.getLastName());
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(94, 47, 305, 14);
		tabInformation.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel(studentData.getFirstName());
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(94, 74, 305, 14);
		tabInformation.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel(studentData.getMail());
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setBackground(Color.WHITE);
		lblNewLabel_9.setBounds(94, 99, 305, 14);
		tabInformation.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel(studentData.getGithubURL());
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(94, 124, 305, 14);
		tabInformation.add(lblNewLabel_10);
		
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		
		lblNewLabel_11 = new JLabel("Esta ventana fue generada el "+sdf.format(now.getTime())+" a las: "+now.get(Calendar.HOUR_OF_DAY)+":" + now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		lblNewLabel_11.setBounds(0, 161, 399, 14);
		tabInformation.add(lblNewLabel_11);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(445, 30, 146, 172);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/me.jpeg"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblNewLabel_5.getWidth(),
        lblNewLabel_5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lblNewLabel_5.setIcon(iconoEscalado);
		contentPane.add(lblNewLabel_5);
	}
}
