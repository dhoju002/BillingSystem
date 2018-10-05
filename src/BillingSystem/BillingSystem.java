package BillingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BillingSystem {

	private JFrame frame;
	private JTextField txtItemPrice1;
	private JTextField txtItemPrice2;
	private JTextField txtItemPrice3;
	private JTextField txtItemPrice4;
	private JTextField txtSubTotal;
	private JTextField txtTax;
	private JTextField txtTotal;
	
	
	double item1 = 100;
	double item2 = 350;
	double item3 = 400;
	double item4 = 405;
	
	double pTax = 14;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 1334, 76);
		frame.getContentPane().add(panel);
		
		JLabel lblBillingSystem = new JLabel("Billing System");
		lblBillingSystem.setFont(new Font("Tahoma", Font.BOLD, 49));
		panel.add(lblBillingSystem);
		
		JCheckBox chckbxItem1 = new JCheckBox("First item");
		
		chckbxItem1.setBounds(10, 94, 89, 32);
		frame.getContentPane().add(chckbxItem1);
		
		JCheckBox chckbxItem2 = new JCheckBox("Second item");
		chckbxItem2.setBounds(10, 128, 89, 23);
		frame.getContentPane().add(chckbxItem2);
		
		JCheckBox chckbxItem3 = new JCheckBox("Third Item");
		chckbxItem3.setBounds(10, 155, 89, 23);
		frame.getContentPane().add(chckbxItem3);
		
		JCheckBox chckbxItem4 = new JCheckBox("Fourth item");
		chckbxItem4.setBounds(10, 181, 89, 23);
		frame.getContentPane().add(chckbxItem4);
		
		JTextPane txtItem1 = new JTextPane();
		txtItem1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItem1.setBounds(117, 98, 122, 23);
		frame.getContentPane().add(txtItem1);
		
		JTextPane txtItem2 = new JTextPane();
		txtItem2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItem2.setBounds(117, 129, 122, 20);
		frame.getContentPane().add(txtItem2);
		
		JTextPane txtItem3 = new JTextPane();
		txtItem3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItem3.setBounds(117, 155, 122, 23);
		frame.getContentPane().add(txtItem3);
		
		JTextPane txtItem4 = new JTextPane();
		txtItem4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItem4.setBounds(117, 185, 122, 20);
		frame.getContentPane().add(txtItem4);
		
		txtItem1.setText("0");
		txtItem2.setText("0");
		txtItem3.setText("0");
		txtItem4.setText("0");
		
		JSeparator separator = new JSeparator();
		separator.setBounds(244, 98, 1, 113);
		frame.getContentPane().add(separator);
		
		JLabel lblFirstItemPrice = new JLabel("First item price");
		lblFirstItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstItemPrice.setBounds(249, 97, 122, 23);
		frame.getContentPane().add(lblFirstItemPrice);
		
		JLabel lblSecondItemPrice = new JLabel("Second item price");
		lblSecondItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondItemPrice.setBounds(249, 128, 122, 20);
		frame.getContentPane().add(lblSecondItemPrice);
		
		JLabel lblThirdItemPrice = new JLabel("Third item price");
		lblThirdItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThirdItemPrice.setBounds(249, 153, 122, 23);
		frame.getContentPane().add(lblThirdItemPrice);
		
		JLabel lblFourthItemPrice = new JLabel("Fourth item price");
		lblFourthItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFourthItemPrice.setBounds(249, 180, 122, 20);
		frame.getContentPane().add(lblFourthItemPrice);
		
		txtItemPrice1 = new JTextField();
		txtItemPrice1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItemPrice1.setBounds(372, 98, 122, 20);
		frame.getContentPane().add(txtItemPrice1);
		txtItemPrice1.setColumns(10);
		
		txtItemPrice2 = new JTextField();
		txtItemPrice2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItemPrice2.setBounds(372, 129, 122, 20);
		frame.getContentPane().add(txtItemPrice2);
		txtItemPrice2.setColumns(10);
		
		txtItemPrice3 = new JTextField();
		txtItemPrice3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItemPrice3.setBounds(372, 156, 122, 20);
		frame.getContentPane().add(txtItemPrice3);
		txtItemPrice3.setColumns(10);
		
		txtItemPrice4 = new JTextField();
		txtItemPrice4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtItemPrice4.setBounds(372, 181, 122, 20);
		frame.getContentPane().add(txtItemPrice4);
		txtItemPrice4.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 319, 60, 23);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 353, 60, 20);
		frame.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 384, 60, 23);
		frame.getContentPane().add(lblTotal);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBounds(80, 320, 160, 22);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setBounds(80, 353, 160, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(80, 385, 160, 23);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double one = item1 * Double.parseDouble(txtItem1.getText());
				double two = item2 * Double.parseDouble(txtItem2.getText());
				double three = item3 * Double.parseDouble(txtItem3.getText());
				double four = item4 * Double.parseDouble(txtItem4.getText());
				
				double subTotal = one + two + three + four;
				
				double cTax = (pTax * subTotal)/100;
				
				String S=String.format("Rs %.2f", subTotal);
				txtSubTotal.setText(S);
				
				String tTax=String.format("Rs %.2f", cTax);
				txtTax.setText(tTax);
				
				double total = subTotal + cTax;
				String Total =String.format("Rs %.2f", total);
				txtTotal.setText(Total);
				
				String item1_cost =String.format("Rs %.2f", one);
				txtItemPrice1.setText(item1_cost);
				
				String item2_cost =String.format("Rs %.2f", two);
				txtItemPrice2.setText(item2_cost);
				
				String item3_cost =String.format("Rs %.2f", three);
				txtItemPrice3.setText(item3_cost);
				
				String item4_cost =String.format("Rs %.2f", four);
				txtItemPrice4.setText(item4_cost);
				
				
				
			}
		});
		btnTotal.setBounds(10, 608, 160, 52);
		frame.getContentPane().add(btnTotal);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 28));
		txtReceipt.setBounds(690, 98, 654, 562);
		frame.getContentPane().add(txtReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				
				txtItem1.setText(null);
				txtItem2.setText(null);
				txtItem3.setText(null);
				txtItem4.setText(null);
				
				txtItemPrice1.setText(null);
				txtItemPrice2.setText(null);
				txtItemPrice3.setText(null);
				txtItemPrice4.setText(null);
				
				chckbxItem1.setSelected(false);
				chckbxItem2.setSelected(false);
				chckbxItem3.setSelected(false);
				chckbxItem4.setSelected(false);
				
				txtReceipt.setText(null);
				
			}
		});
		btnReset.setBounds(180, 608, 160, 52);
		frame.getContentPane().add(btnReset);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cItem1 = String.format(txtItem1.getText());
				String cItem2 = String.format(txtItem2.getText());
				String cItem3 = String.format(txtItem3.getText());
				String cItem4 = String.format(txtItem4.getText());
				
				String costItem1 = String.format(txtItemPrice1.getText());
				String costItem2 = String.format(txtItemPrice2.getText());
				String costItem3 = String.format(txtItemPrice3.getText());
				String costItem4 = String.format(txtItemPrice4.getText());
				
				String costTax = String.format(txtTax.getText());
				String costSubTotal = String.format(txtSubTotal.getText());
				String costTotal = String.format(txtTotal.getText());
				
				
				int refno = 3121 + (int) (Math.random()*4238);
				
						Calendar timer = Calendar.getInstance();
						timer.getTime();
						SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
						tTime.format(timer.getTime());
						SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
						Tdate.format(timer.getTime());
						
						txtReceipt.append("\tBilling System\n" + 
						"Ref no: \t\t\t" + refno +
						"\n========================================\t" +
						"\nFirst Item       " + cItem1 + "    " + "Cost of First Item:       " + costItem1 +
						"\nSecond Item   " + cItem2 + "    " + "Cost of Second Item:  " + costItem2 +
						"\nThird Item      " + cItem3 + "    " + "Cost of Third Item:    " + costItem3 +
						"\nFourth Item    " + cItem4 + "    " + "Cost of Fourth Item:  " + costItem4 +
						"\n========================================\t" +
						"\n Tax:\t...............................         " + costTax +
						"\n Sub-Total:\t...............................         " + costSubTotal +
						"\n Total:\t...............................         " + costTotal +
						"\n========================================\t" +
						"\nDate: " + Tdate.format(timer.getTime()) +
						"\tTime: " + tTime.format(timer.getTime()) +
						"\n\n\t\t Thank You\n");
				
			}
		});
		btnReceipt.setBounds(350, 608, 160, 52);
		frame.getContentPane().add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Billing System",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(520, 608, 160, 52);
		frame.getContentPane().add(btnExit);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				txtItem1.setEnabled(false);
				txtItem2.setEnabled(false);
				txtItem3.setEnabled(false);
				txtItem4.setEnabled(false);
				
			}
		});
		chckbxItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxItem1.isSelected()) {
					txtItem1.setEnabled(true);
					txtItem1.setText("");
					txtItem1.requestFocus();
				}
				else {
					txtItem1.setEnabled(false);
					txtItem1.setText("0");
				}
			}
		});
		chckbxItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxItem2.isSelected()) {
					txtItem2.setEnabled(true);
					txtItem2.setText("");
					txtItem2.requestFocus();
				}
				else {
					txtItem2.setEnabled(false);
					txtItem2.setText("0");
				}
			}
		});
		chckbxItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxItem3.isSelected()) {
					txtItem3.setEnabled(true);
					txtItem3.setText("");
					txtItem3.requestFocus();
				}
				else {
					txtItem3.setEnabled(false);
					txtItem3.setText("0");
				}
			}
		});
		chckbxItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxItem4.isSelected()) {
					txtItem4.setEnabled(true);
					txtItem4.setText("");
					txtItem4.requestFocus();
				}
				else {
					txtItem4.setEnabled(false);
					txtItem4.setText("0");
				}
			}
		});
	}
}
