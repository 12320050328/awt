import java.awt.*;
import java.awt.event.*;
public class calculator {

	public static void main(String[] args) {
		Frame frm=new Frame("DSG Calaulator");		//建立視窗frm
		Panel pnl=new Panel(new GridLayout(3,3));	//建立面板pnl
		Label lab=new Label("0",Label.RIGHT);		//建立標籤lab
		Label lab1=new Label("DSG Calaulator",Label.CENTER);	//建立標籤lab
		Button btn1=new Button("+");
		Button btn2=new Button("-");
		Button btn3=new Button("*");
		Button btn4=new Button("/");
		Button btn5=new Button("0");
		Button btn6=new Button(".");
		Button btn7=new Button("=");
		Button btn8=new Button("Clear");
		
		frm.setLayout(null); 				//取消版面配置
		frm.setSize(220,150);				//設定視窗的大小為220*150
		frm.setBackground(Color.gray);		//設定視窗的背景為灰色
		frm.setResizable(false ); 			//將視窗設定成固定大小
		
		lab.setBounds(20, 30, 110, 20);
		lab.setBackground(Color.pink);		//設定標籤底色為粉紅色
		lab.setForeground(Color.black);		//設定標籤文字為黑色
 		Font fnt=new Font("Serief",Font.ITALIC+Font.BOLD,18);
		lab.setFont(fnt);					//設定字形樣式
		
		lab1.setBounds(140, 30, 60, 20);
		lab1.setBackground(Color.gray);		//設定標籤底色為粉紅色
		lab1.setForeground(Color.black);	//設定標籤文字為黑色
		Font fnt1=new Font("Serief",Font.ITALIC+Font.BOLD,8);
		lab1.setFont(fnt1);					//設定字形樣式
		
		btn1.setForeground(Color.blue);
		btn2.setForeground(Color.blue);	
		btn3.setForeground(Color.blue);	
		btn4.setForeground(Color.blue);	
		btn7.setForeground(Color.red);	
		btn8.setForeground(Color.red);	
		
		pnl.setBounds(20, 60, 80, 50); 	//設定pnl置於視窗內的位置
		for(int i=1;i<=9;i++) {
			pnl.add(new Button(Integer.toString(i)));	//加入1~9按鈕
		}
		
		btn1.setBounds(110, 60, 20, 15);	// "+"
		btn2.setBounds(110, 75, 20, 15);	// "-"
		btn3.setBounds(110, 90, 20, 15);	// "*"
		btn4.setBounds(110, 105, 20, 15);	// "/"
		btn5.setBounds(20, 110, 55, 15);	// "0"
		btn6.setBounds(75, 110, 25, 15);	// "."
		btn7.setBounds(140, 60, 50, 30);	// "="
		btn8.setBounds(140, 95, 50, 30);	// "Clear"

		
		frm.add(lab);						//將lab放進視窗中
		frm.add(lab1);
		frm.add(pnl);						//將面板放進視窗中
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btn7);
		frm.add(btn8);
		frm.setVisible(true);				//設定視窗為可見
		
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {System.exit(0);}});
		}

	}


