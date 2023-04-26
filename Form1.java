import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
//1st step  
public class Form1 extends Flight implements ActionListener {
    public JFrame frame;
    public JButton button;
    public JTextArea tf;// textfields should be define as global operators otherwise cant access them out of main method
    public JTextArea rf;
    public JTextArea df;
    public JLabel lb1;
    public JLabel lb2;
    public JLabel lb3;	
    private static Flight[] f; // initialazing f array of type flight[] 
    public  Form1() { // another method to call array f[] form1(flight []f)
    super("0","0","0",0);// for constructor in flight class 
         f = FlightTest.getf(); // accessing the array f[] in fligttest (global array)
         //System.out.println(f.length);// checking length of f to see wether i have it or not debugging stuff
        frame = new JFrame();// new object of JFrame 
        frame.setTitle("Flight Information System");
        frame.setSize(600,400);// size of frame
        button = new JButton("Display Flights"); // creating obj of class button 
        button.setBounds(0,50,160,25); // size of button
        button.addActionListener(this);  // this when it user click on button 
        tf=new JTextArea(); // creating obj of class textarea 
        rf=new JTextArea();
        df=new JTextArea();
        tf.setBounds(0,150,120,170);// size of textareas 
        rf.setBounds(150,150,120,170);
        df.setBounds(320,150,170,170);
        lb1 =new JLabel("Flight Number"); // creating obj of class jlabel and assigning value
        lb2 =new JLabel("Airline Name");
        lb3 =new JLabel("Flight Origin and Destination");
        lb1.setBounds(0,60,100,170); // size of jlabel 
        lb2.setBounds(150,60,100,170);
        lb3.setBounds(320,60,150,170);
        frame.setLayout(null); // layeout none 
        frame.add(lb1);// adding all those objects to gui to be shown 
        frame.add(lb2);
        frame.add(lb3);
        frame.add(tf);
        frame.add(rf);
        frame.add(df);
        frame.add(button);
        frame.setVisible(true); // set the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// click on exit and end it
    }
public void actionPerformed(ActionEvent e){ 
   String t1="", t2 ="",t3 = "" ; // initilizing values for t1,t2,t3
      for (int i = 0 ; i<=f.length-1;i++) 
    {t1 += f[i].getFlight_Number()+"\n"; // storing flight number in t1 
    t2 += f[i].getAirline_Name()+"\n";// storing airline name in t2
    t3 += f[i].getFlight_Origin()+" TO "+f[i].getDestination_City()+"\n";// storing flight origin and destination city in t3
    }
    tf.setText(t1);// appending the flight number to  its textarea 
    rf.setText(t2);// appending the airline name to  its textarea
    df.setText(t3);// appending the flight origin and destination city to  its textarea

}  
    
}