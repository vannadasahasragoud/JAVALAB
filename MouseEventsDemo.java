import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventsDemo extends JFrame {
JLabel label;
MouseEventsDemo() {
setTitle("Mouse Events Demo");
label = new JLabel("No Event", SwingConstants.CENTER);
label.setFont(new Font("Arial", Font.BOLD, 20));
add(label);
addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) 
{ 
    label.setText("MouseClicked"); 
}
public void mousePressed(MouseEvent e) 
{ 
    label.setText("MousePressed"); 
}
public void mouseReleased(MouseEvent e) 
{ 
    label.setText("MouseReleased"); 
}
public void mouseEntered(MouseEvent e) 
{ 
    label.setText("MouseEntered"); 
}
public void mouseExited(MouseEvent e) 
{ 
    label.setText("MouseExited"); 
}
});
addMouseMotionListener(new MouseMotionAdapter() {
public void mouseMoved(MouseEvent e) 
{ 
    label.setText("MouseMoved"); }
public void mouseDragged(MouseEvent e) 
{ 
    label.setText("MouseDragged"); }
});
setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new MouseEventsDemo();
}
}