import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent.*;
import java.awt.event.WindowListener.*;

class awt1{
awt1()
{
	Frame f= new Frame();
	Frame d= new Frame();
	Label l= new Label("\b Courier Service \b ");
	Label l1=new Label("Senders Name                     : ");
	TextField t1=new TextField();
	Label l2=new Label("Phone No         : ");
	TextField t2=new TextField();
	Label l3=new Label("Destination           : ");
	TextField t3=new TextField();
	Label l4= new Label(" Receiver's Place: ");
	Button b=new Button("Order");
	Choice c1=new Choice();
	Label l5=new Label("Receiver's Name         :");
	TextField t5=new TextField();
	Label fin=new Label();
	Label fin1=new Label();
	Label l6=new Label("Date    : ");
	TextField t6=new TextField();
	Label l7=new Label("Mode Of Transport        : ");
	Choice c2=new Choice();
	Label l8=new Label("Timing       :");
	Choice c3=new Choice();
	Label l9=new Label("Weight Of Package(In Kgs/gms)                    : ");
	TextField t9=new TextField();
	Label l10=new Label("Package/Letter                     : ");
	Choice c4=new Choice();
	Button k=new Button("click to confirm Place Order");
	TextField t11=new TextField("Order Confirmed");
	
	 k.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Details :" + ("\nName : " + t1.getText()) +( "\n Date: " + t6.getText())+ ( "\n Destination : " + t3.getText());
		
            fin1.setText(data);   
         }
       });


	
	 b.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Your Courier Is Ordered Succesfully : "+ c1.getItem(c1.getSelectedIndex());
		
            fin.setText(data);   
         }

       });
		

	c1.add("Home");
	c1.add("Work Place");
	c1.add("College");
	

	c2.add("Speed Post");
	c2.add("Regular");
	c2.add("Electrical");

	c3.add("7.00 am to 8.00 pm");
	c3.add("7.00 am to 12.30 pm");
	c3.add("6.00 am to 6.00 pm");

	c4.add("Packets");
	c4.add("Letters");
	

	l.setBounds(20,40,200,30);
	l5.setBounds(20,70,250,30);
	l1.setBounds(20,100,120,30);
	t1.setBounds(140,105,190,20);

	l2.setBounds(20,130,120,30);
	t2.setBounds(140,135,190,20);

	l9.setBounds(20,160,120,30);
	t9.setBounds(140,165,190,20);
	
	l5.setBounds(20,160,120,30);
	t5.setBounds(140,165,190,20);

	l3.setBounds(20,190,120,30);
	t3.setBounds(140,195,190,20);

	l10.setBounds(20,220,120,30);
	c4.setBounds(140,225,105,30);

	l6.setBounds(20,250,120,30);
	t6.setBounds(140,255,190,20);

	l4.setBounds(20,280,120,30);
	c1.setBounds(140,285,105,30);

	l8.setBounds(20,310,120,30);
	c3.setBounds(140,315,105,30);

	l7.setBounds(20,340,120,30);
	c2.setBounds(140,345,105,30);

	b.setBounds(70,390,110,30);
	fin.setBounds(50,440,330,30);
	fin1.setBounds(50,470,330,30);
	k.setBounds(70,390,110,30);
	t11.setBounds(140,195,190,20);
	


	f.add(l);
	f.add(l5);
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(l3);
	f.add(t3);
	f.add(l4);
	f.add(c1);
	f.add(l6);
	f.add(t6);
	f.add(l7);
	f.add(c2);
	f.add(l8);
	f.add(c3);
	f.add(l9);
	f.add(t9);
	f.add(l10);
	f.add(c4);
	f.add(b);
	f.add(fin);
	f.add(fin1);


	f.setSize(700,600);
	f.setTitle("COURIER MANAGEMENT SYSTEM");
	f.setLayout(null);
	f.setVisible(true);
	d.setSize(400,100);
	d.setTitle("Order Statment");
	d.setVisible(true);
	d.add(k);
	



	d.addWindowListener(new WindowAdapter()
 
{
	public void windowClosing(WindowEvent e) 
   {
		System.exit(0);
		
	}

});
}

public static void main(String args[]) {   
            new awt1();
		 


}  
  
}    
