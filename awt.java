import java.awt.*;

public class awt extends Frame {
    
    public awt(){
        Button button = new Button("Click Me");
        button.setBounds(30, 100, 300, 50);
        
        add(button);

        setTitle("A GUI with AWT");
        setSize(300, 300);
        

        setLayout(null);
        setVisible(true);
    }    
}
