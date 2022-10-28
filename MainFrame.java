import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainFrame extends JFrame {
    DayPanel monday;
    DayPanel tuesday;
    DayPanel wednesday;
    DayPanel thursday;
    DayPanel friday;
    DayPanel saturday;
    DayPanel sunday;
    public DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
    public LocalDate mondayDate = LocalDate.now().minusDays(currentDay.getValue()-1);
    MainFrame(String appTitle, int sizeX, int sizeY){
        super(appTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5,5));
        this.add(new JPanel(),BorderLayout.NORTH);
        JPanel center = new JPanel();
        this.add(center, BorderLayout.CENTER);
        center.setLayout(new GridLayout(1,7));


        System.out.println(currentDay.getValue());

        monday = new DayPanel(150,400, "monday "+mondayDate,Color.lightGray);
        center.add(monday);


        tuesday = new DayPanel(150,400, "tuesday "+mondayDate.plusDays(1),Color.lightGray);
        center.add(tuesday);


        wednesday = new DayPanel(150,400,"wednesday "+mondayDate.plusDays(2),Color.lightGray);
        center.add(wednesday);


        thursday = new DayPanel(150,400,"thursday "+mondayDate.plusDays(3),Color.lightGray);
        center.add(thursday);


        friday = new DayPanel(150,400,"friday "+mondayDate.plusDays(4),Color.lightGray);
        center.add(friday);


        saturday = new DayPanel(150,400,"saturday "+mondayDate.plusDays(5),Color.lightGray);
        center.add(saturday);


        sunday = new DayPanel(150,400,"sunday "+mondayDate.plusDays(6),Color.lightGray);
        center.add(sunday);
        currentDay();
        this.pack();
        this.setSize(sizeX,sizeY);
    }
    public void currentDay(){
        switch (currentDay){
            case MONDAY -> monday.setBackground(Color.WHITE);
            case TUESDAY -> tuesday.setBackground(Color.WHITE);
            case WEDNESDAY -> wednesday.setBackground(Color.WHITE);
            case THURSDAY -> thursday.setBackground(Color.WHITE);
            case FRIDAY -> friday.setBackground(Color.WHITE);
            case SATURDAY -> saturday.setBackground(Color.WHITE);
            case SUNDAY -> sunday.setBackground(Color.WHITE);
        }
    }
}
