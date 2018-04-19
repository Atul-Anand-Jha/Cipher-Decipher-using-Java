import com.pbl.cipher.Cipher;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="CipherApplet.class" height=200 width=550>
</applet>
*/
public class CipherApplet extends Applet implements ActionListener{
TextField t1;
TextField t2;
TextField t3;
Button e;
Button d;
Button c;
String s,e1,d1;
Cipher ob;

public void init()
{
t1=new TextField(20);

t2=new TextField(20);

t3=new TextField(20);

ob=new Cipher();
e=new Button("Encrypt");
e.setBackground(Color.green);

d=new Button("Decrypt");
d.setBackground(Color.red);
c=new Button(" Reset ");
c.setBackground(Color.blue);
add(t1);
add(t2);
add(t3);
add(e);
add(d);
add(c);
e.addActionListener(this);
d.addActionListener(this);
c.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==e)
{
s=String.valueOf(t1.getText());
e1=ob.encrypt(s);
t2.setText(e1);
}
if(ae.getSource()==d)
{
d1=ob.decrypt(t2.getText());

t3.setText(d1);
}
if(ae.getSource()==c)
{
t1.setText(" ");
t2.setText("");
t3.setText("");
}
}
}
