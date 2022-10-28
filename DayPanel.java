import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DayPanel extends JPanel {
    JButton addBtn;
    JPanel centerPanel;
    JPanel southPanel;
    JTextField inputText;
    JLabel dayDateLabel;
    DayPanel(int width, int height, String dayDate, Color color){
        super();
        this.setLayout(new BorderLayout());
        dayDateLabel = new JLabel(dayDate);
        this.add(dayDateLabel, BorderLayout.NORTH);
       // this.setSize(width, height);
        centerPanel = new JPanel();
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridLayout(10,1));

        southPanel = new JPanel();
        this.add(southPanel, BorderLayout.SOUTH);
        southPanel.setLayout(new BorderLayout());
        inputText = new JTextField();
        southPanel.add(inputText,BorderLayout.CENTER);

        addBtn = new JButton("Add");
        addBtn.setBounds(0,0,150,50);
        southPanel.add(addBtn, BorderLayout.SOUTH);

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEntry(inputText.getText());
                updateUI();
            }
        });
        this.setBackground(color);

    }
    public void addEntry(String textInput){
        centerPanel.add(new JLabel(textInput));
    }
}
