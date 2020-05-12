import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class PuzzleDesign extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnNext;
	String s;
Boolean flag= false;
	private JLabel timeLabel,timerLabel;
    Timer timer;
    int count=0, min=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleDesign frame = new PuzzleDesign();
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
	public PuzzleDesign() {
		setTitle("PuzzleGame");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timer= new Timer(1000,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent te) {
				count++;
				if(count < 61) {
					timerLabel.setText(Integer.toString(min)+" : "+Integer.toString(count));
					
				}
				if(count==61) { 
					System.out.println(min);
					min++; 
					count=0;
					timer.restart();
					
				}

			}
			});
		timer.setInitialDelay(0);
		timer.start();

		JLabel headLabel = new JLabel("Puzzle Game");
		headLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		headLabel.setSize(new Dimension(9, 5));
		headLabel.setBounds(200, 13, 171, 30);
		contentPane.add(headLabel);

		btnOne = new JButton("1");
		btnOne.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnOne.setBounds(69, 118, 97, 57);
		contentPane.add(btnOne);
		btnOne.addActionListener(this);

		btnTwo = new JButton("");
		btnTwo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnTwo.setBounds(217, 118, 97, 57);
		contentPane.add(btnTwo);
		btnTwo.addActionListener(this);

		btnThree = new JButton("3");
		btnThree.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnThree.setBounds(365, 118, 97, 57);
		contentPane.add(btnThree);
		btnThree.addActionListener(this);

		btnFour = new JButton("4");
		btnFour.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnFour.setBounds(69, 212, 97, 57);
		contentPane.add(btnFour);
		btnFour.addActionListener(this);

		btnFive = new JButton("5");
		btnFive.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnFive.setBounds(217, 212, 97, 57);
		contentPane.add(btnFive);
		btnFive.addActionListener(this);

		btnSix = new JButton("6");
		btnSix.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSix.setBounds(365, 212, 97, 57);
		contentPane.add(btnSix);
		btnSix.addActionListener(this);

		btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSeven.setBounds(69, 308, 97, 57);
		contentPane.add(btnSeven);
		btnSeven.addActionListener(this);

		btnEight = new JButton("8");
		btnEight.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnEight.setBounds(217, 308, 97, 57);
		contentPane.add(btnEight);
		btnEight.addActionListener(this);

		btnNine = new JButton("2");
		btnNine.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNine.setBounds(365, 308, 97, 57);
		contentPane.add(btnNine);
		 btnNine.addActionListener(this);
		
		timeLabel = new JLabel("Time: ");
		timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		timeLabel.setBounds(12, 53, 49, 25);
		contentPane.add(timeLabel);
		
		btnNext = new JButton("Next Game");
		btnNext.setBackground(new Color(102, 205, 170));
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNext.setBounds(189, 435, 171, 45);
		contentPane.add(btnNext);
		
		timerLabel = new JLabel("");
		timerLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		timerLabel.setBounds(69, 54, 93, 25);
		contentPane.add(timerLabel);
		btnNext.addActionListener(this);
	    
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		if(e.getSource()==btnNext) {
			count=0;
			timer.restart();
			
			s=btnFive.getText();
			btnFive.setText(btnEight.getText());
			btnEight.setText(btnFour.getText());
			btnFour.setText(btnTwo.getText());
			btnTwo.setText(btnOne.getText());
			btnOne.setText(btnSeven.getText());
			btnSeven.setText(btnThree.getText());
			btnThree.setText(btnNine.getText());
			btnNine.setText(btnSix.getText());
			btnSix.setText(s);

		}

         if (e.getSource() == btnOne) {
			if (btnTwo.getText().equals("")) {
				s = btnTwo.getText();
				btnTwo.setText(btnOne.getText());
				btnOne.setText(s);
			}
			if (btnFour.getText().equals("")) {
				s = btnFour.getText();
				btnFour.setText(btnOne.getText());
				btnOne.setText(s);
			}

		}

		// if btn 2 is pressed

		if (e.getSource() == btnTwo) {
			if (btnThree.getText().equals("")) {
				s = btnThree.getText();
				btnThree.setText(btnTwo.getText());
				btnTwo.setText(s);
			}
			if (btnOne.getText().equals("")) {
				s = btnOne.getText();
				btnOne.setText(btnTwo.getText());
				btnTwo.setText(s);
			}
			if (btnFive.getText().equals("")) {
				s = btnFive.getText();
				btnFive.setText(btnTwo.getText());
				btnTwo.setText(s);
			}
        }
		// if btn 3 is pressed

		if (e.getSource() == btnThree) {

			if (btnTwo.getText().equals("")) {
				s = btnTwo.getText();
				btnTwo.setText(btnThree.getText());
				btnThree.setText(s);
			}
			if (btnSix.getText().equals("")) {
				s = btnSix.getText();
				btnSix.setText(btnThree.getText());
				btnThree.setText(s);
			}
		}
		// if btn 4 is pressed
		if (e.getSource() == btnFour) {
			if (btnOne.getText().equals("")) {
				s = btnOne.getText();
				btnOne.setText(btnFour.getText());
				btnFour.setText(s);
			}

			if (btnFive.getText().equals("")) {
				s = btnFive.getText();
				btnFive.setText(btnFour.getText());
				btnFour.setText(s);
			}
			if (btnSeven.getText().equals("")) {
				s = btnSeven.getText();
				btnSeven.setText(btnFour.getText());
				btnFour.setText(s);
			}
		}
		// if btn 5 is pressed

		if (e.getSource() == btnFive) {

			if (btnTwo.getText().equals("")) {
				s = btnTwo.getText();
				btnTwo.setText(btnFive.getText());
				btnFive.setText(s);
			}
			if (btnFour.getText().equals("")) {
				s = btnFour.getText();
				btnFour.setText(btnFive.getText());
				btnFive.setText(s);
			}
			if (btnSix.getText().equals("")) {
				s = btnSix.getText();
				btnSix.setText(btnFive.getText());
				btnFive.setText(s);
			}
			if (btnEight.getText().equals("")) {
				s = btnEight.getText();
				btnEight.setText(btnFive.getText());
				btnFive.setText(s);
			}
		}
		// if btn 6 is pressed

		if (e.getSource() == btnSix) {

			if (btnThree.getText().equals("")) {
				s = btnThree.getText();
				btnThree.setText(btnSix.getText());
				btnSix.setText(s);
			}
			if (btnFive.getText().equals("")) {
				s = btnFive.getText();
				btnFive.setText(btnSix.getText());
				btnSix.setText(s);
			}
			if (btnNine.getText().equals("")) {
				s = btnNine.getText();
				btnNine.setText(btnSix.getText());
				btnSix.setText(s);
			}

		}
		// if btn 7 is pressed

		if (e.getSource() == btnSeven) {
			if (btnFour.getText().equals("")) {
				s = btnFour.getText();
				btnFour.setText(btnSeven.getText());
				btnSeven.setText(s);
			}
			if (btnEight.getText().equals("")) {
				s = btnEight.getText();
				btnEight.setText(btnSeven.getText());
				btnSeven.setText(s);
			}

		}

		// if btn 8 is pressed

		if (e.getSource() == btnEight) {
			if (btnFive.getText().equals("")) {
				s = btnFive.getText();
				btnFive.setText(btnEight.getText());
				btnEight.setText(s);
			}

			if (btnSeven.getText().equals("")) {
				s = btnSeven.getText();
				btnSeven.setText(btnEight.getText());
				btnEight.setText(s);
			}
			if (btnNine.getText().equals("")) {
				s = btnNine.getText();
				btnNine.setText(btnEight.getText());
				btnEight.setText(s);
			}

		}
		// if btn 9 is pressed

		if (e.getSource() == btnNine) {
			
			if (btnSix.getText().equals("")) {
				s = btnSix.getText();
				btnSix.setText(btnNine.getText());
				btnNine.setText(s);
			}
			if (btnEight.getText().equals("")) {
				s = btnEight.getText();
				btnEight.setText(btnNine.getText());
				btnNine.setText(s);
			}
		winningMsg();

		}

}
	public void winningMsg() {
		if(btnOne.getText().equals("1")&&btnTwo.getText().equals("2")&&btnThree.getText().equals("3")&&btnFour.getText().equals("4")&&btnFive.getText().equals("5")&&btnSix.getText().equals("6")&&btnSeven.getText().equals("7")&&btnEight.getText().equals("8")&&btnNine.getText().equals("")){   
			timer.stop();
			JOptionPane.showMessageDialog(PuzzleDesign.this,"!!!YOU WON!!! , time taken : "+min+" : "+count);  
			count=0;
			min=0;
			timerLabel.setText(Integer.toString(min)+" : "+Integer.toString(count));
			
			
			
				} 
	}
}
