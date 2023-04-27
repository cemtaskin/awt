import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class awt2 {
    public awt2(){
        Frame frame =new Frame();
        Label label = new Label("Employee id:");
        Button button = new Button("Submit");
        TextField  textField=new TextField();

        label.setBounds(20,80, 80, 30);
        textField.setBounds(20, 100, 80, 30);
        button.setBounds(100, 100, 80, 30); 

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(400,300);
        frame.setTitle("Employee Info");
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
