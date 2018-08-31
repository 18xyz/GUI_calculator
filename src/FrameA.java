import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//2018.08.31
public class FrameA extends JFrame implements ActionListener{
	Button button1;
	Button button2;
	JTextArea textArea;
	public FrameA() {
		// this.setSize(700, 600);
		// this.setLayout(new GridLayout(0, 4));
		// JPanel 객체 생성
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4));

		JPanel panelA = new JPanel();
		panelA.setLayout(new BoxLayout(panelA, BoxLayout.Y_AXIS));
		JPanel panelB = new JPanel();
		panelB.setLayout(new BoxLayout(panelB, BoxLayout.Y_AXIS));
		JPanel panelC = new JPanel();
		panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
		JPanel panelD = new JPanel();
		panelD.setLayout(new BoxLayout(panelD, BoxLayout.Y_AXIS));
		// Button 객체 생성
		Button button0 = new Button("0");
		button1 = new Button("1");
		// button1.setPreferredSize(new Dimension(45, 28));
		// =flowlayout 해야 사용 가능
		button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");
		Button buttonReset = new Button("C");
		Button buttonMultiply = new Button("*");
		Button buttonPlus = new Button("+");
		Button buttonMinus = new Button("-");
		Button buttonDivision = new Button("/");
		Button buttonResult = new Button("=");
		// JTextArea 객체 생성
		textArea = new JTextArea(1, 20);
		JPanel Text = new JPanel();
		textArea.setEditable(false);
		// this.add(panel);
		// Frame 컨테이너에 add panel
		panelMain.add(textArea);
		panel.add(panelA);
		panel.add(panelB);
		panel.add(panelC);
		panel.add(panelD);
		panelMain.add(panel);
		// panel.add(textArea);
		// panelA add Button
		panelA.add(button7);
		panelA.add(button4);
		panelA.add(button1);
		panelA.add(buttonReset);
		// panelB add Button
		panelB.add(button8);
		panelB.add(button5);
		panelB.add(button2);
		panelB.add(button0);
		// panelC add Button
		panelC.add(button9);
		panelC.add(button6);
		panelC.add(button3);
		panelC.add(buttonResult);
		// panelD add Button
		panelD.add(buttonMultiply);
		panelD.add(buttonPlus);
		panelD.add(buttonMinus);
		panelD.add(buttonDivision);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);

		panelMain.add(Text);
		this.setBounds(10, 10, 400, 200);
		this.add(panelMain);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			textArea.append("1");
		}
		else if(e.getSource() == button2){
			textArea.append("2");
		}
	}

	public static void main(String[] args) {
		FrameA frameA = new FrameA();
	}

}
