import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MiniPaint extends JFrame implements ActionListener{
	
	private Panel panel;
	private JButton button00, button01;
	private JRadioButton rbutton00, rbutton01, rbutton02, rbutton03, rbutton04;
	private ButtonGroup bgroup00;
	private JCheckBox cbox00, cbox01;
	private JLabel label00;
	public static int option = 1;
	public static boolean foption = false, moption = false;
	public static Color color = null;
	
	
	public MiniPaint() throws Exception{
		super();
		config();
		init();
	}
	
	public static void main(String[] args) throws Exception{
		MiniPaint frame = new MiniPaint();
		frame.setVisible(true);
	}
	
	public void config() throws Exception{
		this.setTitle("CampechanoView03");
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		//SwingUtilities.updateComponentTreeUI(getContentPane());
	}
	
	public void init(){
		button00 = new JButton("Clean");
		button00.setBounds(20, 20, 100, 30);
		button00.addActionListener(this);
		
		cbox00 = new JCheckBox("Fill");
		cbox00.setBounds(20, 60, 100, 30);
		cbox00.addActionListener(this);
		
		cbox01 = new JCheckBox("Motion Draw (Free mode)");
		cbox01.setBounds(20, 90, 150, 30);
		cbox01.addActionListener(this);
		
		label00 = new JLabel("Choose the figure to draw:");
		label00.setBounds(20, 120, 150, 30);
		
		rbutton00 = new JRadioButton("Free");
		rbutton00.setBounds(20, 150, 100, 30);
		rbutton00.setSelected(true);
		rbutton00.addActionListener(this);
		rbutton01 = new JRadioButton("Circle");
		rbutton01.setBounds(20, 180, 100, 30);
		rbutton01.addActionListener(this);
		rbutton02 = new JRadioButton("Rectangle");
		rbutton02.setBounds(20, 210, 100, 30);
		rbutton02.addActionListener(this);
		rbutton03 = new JRadioButton("Oval");
		rbutton03.setBounds(20, 240, 100, 30);
		rbutton03.addActionListener(this);
		rbutton04 = new JRadioButton("Arc");
		rbutton04.setBounds(20, 270, 100, 30);
		rbutton04.addActionListener(this);
		
		bgroup00 = new ButtonGroup();
		bgroup00.add(rbutton00);
		bgroup00.add(rbutton01);
		bgroup00.add(rbutton02);
		bgroup00.add(rbutton03);
		bgroup00.add(rbutton04);
		
		button01 = new JButton("Change Color");
		button01.setBounds(20, 320, 100, 30);
		button01.addActionListener(this);
		
		panel = new Panel();
		
		this.add(button00);
		this.add(cbox00);
		this.add(cbox01);
		this.add(label00);
		this.add(rbutton00);
		this.add(rbutton01);
		this.add(rbutton02);
		this.add(rbutton03);
		this.add(rbutton04);
		this.add(button01);
		this.add(panel);
		
	}
	
	public void setColorFont(){
		button00.setForeground(color);
		button01.setForeground(color);
		rbutton00.setForeground(color);
		rbutton01.setForeground(color);;
		rbutton02.setForeground(color);;
		rbutton03.setForeground(color);;
		rbutton04.setForeground(color);;
		cbox00.setForeground(color);;
		cbox01.setForeground(color);;
		label00.setForeground(color);;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == button00)
			panel.repaint();
		if(e.getSource() == rbutton00)
			option = 1;
		if(e.getSource() == rbutton01)
			option = 2;
		if(e.getSource() == rbutton02)
			option = 3;
		if(e.getSource() == rbutton03)
			option = 4;
		if(e.getSource() == rbutton04)
			option = 5;
		if(e.getSource() == button01){
			color = JColorChooser.showDialog(panel, "Choose a color", null);
			setColorFont();
		}
		
		foption = cbox00.isSelected();
		moption = cbox01.isSelected();
	}

}