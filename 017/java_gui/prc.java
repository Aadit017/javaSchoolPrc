package java_gui;
import java.awt.*;
class prc extends Frame{
    private static final long serialVersionUID = 1L;
    prc() {
        Button b=new Button("click me");
        b.setBounds(30,100,80,30);// setting button position  
        add(b);//adding button into frame  
        setSize(300,300);//frame size 300 width and 300 height  
        setLayout(null);//no layout manager  
        setVisible(true);
         }
    public static void main(String args[]) {
        prc F =new prc(); } 
    } 