import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt2 implements ActionListener{
    Frame frame =new Frame();
    Label label = new Label("Employee id:");
    Label dialogLabel = new Label();

    Button button = new Button("Submit");
    TextField  textField=new TextField();
    Dialog dialog;
    
    public awt2(){
       
        dialog=new Dialog(frame, "Attention", true);
        dialogLabel.setBounds(10, 10, 100, 30);
        dialog.add(dialogLabel);
        label.setBounds(20,80, 80, 30);
        textField.setBounds(20, 100, 80, 30);
        button.setBounds(100, 100, 80, 30); 

        button.addActionListener(this);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(400,300);
        frame.setTitle("Employee Info");
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialogLabel.setText(textField.getText());
        dialog.setVisible(true);
        
    }

    

}
