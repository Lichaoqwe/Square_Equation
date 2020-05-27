/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/5/27 23:47
 * @version: 1.0
 * @modified By:
 */

import java.awt.*;
import java.awt.event.*;
public class EquationFrame extends Frame implements ActionListener

        {  SquareEquation equation;

        TextField textA,textB,textC;

        TextArea showRoots;

        Button controlButton;

public EquationFrame()

        { equation=new SquareEquation();

        textA=new TextField(8);

        textB=new TextField(8);

        textC=new TextField(8);

        showRoots=new TextArea();

        controlButton=new Button("确定");

        Panel pNorth=new Panel();

        pNorth.add(new Label("二次项系数:"));

        pNorth.add(textA);

        pNorth.add(new Label("一次项系数:"));

        pNorth.add(textB);

        pNorth.add(new Label("常数项系数:"));

        pNorth.add(textC);

        pNorth.add(controlButton);

        //【代码1】  //当前窗口作为controlButton的ActionEvent事件的监视器

        add(pNorth,BorderLayout.NORTH);

        add(showRoots,BorderLayout.CENTER);

        setBounds(100,100,630,160);

        setVisible(true);

        validate();

        addWindowListener(new WindowAdapter()

        {  public void windowClosing(WindowEvent e)

        {  System.exit(0);

        }

        }

        );

        }

public void actionPerformed(ActionEvent e)

        { try{

        double a=Double.parseDouble("【代码2】");  //textA调用方法获取其中的文本

        double b=Double.parseDouble("【代码3】"); //textB调用方法获取其中的文本
       double c=Double.parseDouble("【代码4】");  // textC调用方法获取其中的文本

        equation.setA(a);

        equation.setB(b);

        equation.setC(c);

        textA.setText(""+a);

        textB.setText(""+b);

        textC.setText(""+c);

        showRoots.append("\n 根："+equation.getRootOne());

        showRoots.append("   根："+equation.getRootTwo());

        }

        catch(Exception ex)

        { showRoots.append("\n"+ex+"\n");

        }

        }

        }
