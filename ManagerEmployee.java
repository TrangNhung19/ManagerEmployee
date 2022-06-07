package qlnv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ManagerEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField txtTennv;
	private JTextField txtManv;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtdate;
	private JTable TableResult;

	/**
	 * Launch the application.
	 */
	private List<Employee> employee;
	private DefaultTableModel Model;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerEmployee frame = new ManagerEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
//	public void ManagerEmployee() {
//		this.setLocationRelativeTo(null);
//		Model=(DefaultTableModel)TableResult.getModel();
//		showTable();
//	}
	public ManagerEmployee() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1240, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN TR\u01AF\u1EDCNG PHENIKAA");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(315, 26, 543, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(28, 105, 86, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(28, 149, 86, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ch\u1EE9c v\u1EE5");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(28, 202, 92, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(28, 248, 86, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel txtEmai = new JLabel("Email");
		txtEmai.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtEmai.setBounds(28, 381, 76, 13);
		contentPane.add(txtEmai);
		
		JLabel txtSalary = new JLabel("L\u01B0\u01A1ng");
		txtSalary.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtSalary.setBounds(28, 429, 76, 13);
		contentPane.add(txtSalary);
		
		JLabel txtSDT = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		txtSDT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtSDT.setBounds(28, 329, 88, 13);
		contentPane.add(txtSDT);
		
		JButton RdInsert = new JButton("Th\u00EAm");
		RdInsert.setBackground(Color.LIGHT_GRAY);
		RdInsert.setFont(new Font("Times New Roman", Font.BOLD, 13));
		RdInsert.setBounds(50, 479, 85, 21);
		contentPane.add(RdInsert);
		
		JButton RdDelete = new JButton("X\u00F3a");
		RdDelete.setBackground(Color.LIGHT_GRAY);
		RdDelete.setFont(new Font("Times New Roman", Font.BOLD, 13));
		RdDelete.setBounds(201, 479, 85, 21);
		contentPane.add(RdDelete);
		
		JButton RdUpdate = new JButton("S\u1EEDa");
		RdUpdate.setBackground(Color.LIGHT_GRAY);
		RdUpdate.setFont(new Font("Times New Roman", Font.BOLD, 13));
		RdUpdate.setBounds(50, 537, 85, 21);
		contentPane.add(RdUpdate);
		
		JButton RdSearch = new JButton("T\u00ECm ki\u1EBFm");
		RdSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RdSearch.setBackground(Color.LIGHT_GRAY);
		RdSearch.setFont(new Font("Times New Roman", Font.BOLD, 13));
		RdSearch.setBounds(201, 537, 85, 21);
		contentPane.add(RdSearch);
		
		txtTennv = new JTextField();
		txtTennv.setBounds(141, 109, 145, 19);
		contentPane.add(txtTennv);
		txtTennv.setColumns(10);
		
		txtManv = new JTextField();
		txtManv.setBounds(141, 157, 145, 19);
		contentPane.add(txtManv);
		txtManv.setColumns(10);
		
		JComboBox comboboxCV = new JComboBox();
		comboboxCV.setModel(new DefaultComboBoxModel(new String[] {"<Ch\u1ECDn ch\u1EE9c v\u1EE5>", "Gi\u1EA3ng vi\u00EAn", "Ph\u00F2ng \u0111\u00E0o t\u1EA1o", "Ph\u00F2ng t\u00E0i ch\u00EDnh", "B\u1EA3o v\u1EC7", "Ph\u00F2ng c\u1ED9ng t\u00E1c sinh vi\u00EAn"}));
		comboboxCV.setBounds(141, 199, 145, 21);
		contentPane.add(comboboxCV);
		
		JRadioButton RdNam = new JRadioButton("Nam");
		RdNam.setFont(new Font("Times New Roman", Font.BOLD, 12));
		RdNam.setBounds(141, 245, 64, 21);
		contentPane.add(RdNam);
		
		JRadioButton RdNu = new JRadioButton("N\u1EEF");
		RdNu.setFont(new Font("Times New Roman", Font.BOLD, 12));
		RdNu.setBounds(207, 245, 46, 21);
		contentPane.add(RdNu);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 327, 145, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 379, 145, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 427, 145, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel txtDate = new JLabel("N\u0103m sinh");
		txtDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtDate.setBounds(28, 287, 64, 13);
		contentPane.add(txtDate);
		
		txtdate = new JTextField();
		txtdate.setBounds(141, 284, 145, 19);
		contentPane.add(txtdate);
		txtdate.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 102, 874, 469);
		contentPane.add(scrollPane);
		
		TableResult = new JTable();
		scrollPane.setViewportView(TableResult);
		TableResult.setModel(new DefaultTableModel(
			new Object[][] {
				{ null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "H\u1ECD v\u00E0 t\u00EAn", "M\u00E3 nh\u00E2n vi\u00EAn", "Ch\u1EE9c v\u1EE5", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "L\u01B0\u01A1ng"
			}
		));
	}
	
	

//	private void showTable() {
//		// TODO Auto-generated method stub
//		employee=new JDBCnv().getListNV();
//		Model.setRowCount(0);
//		for(Employee n:employee) {
//			Model.addRow(new Object[]{
//			TableResult.getRowCount()+1,n.getTennv(),n.getManv(),n.getChucvu(),n.getGt(),n.getDate(),n.getSDT(),n.getEmail(),n.getLuong()	
//			});
//		}
//	}
}
