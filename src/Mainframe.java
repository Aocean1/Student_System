import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mainframe {
    static final int WIDTH =400;
    static final int HEIGHT =200;
    JFrame buttonframe;
    public Mainframe()  {
        buttonframe = new JFrame();
        buttonframe.setTitle("学校信息管理系统");

        buttonframe.setSize(WIDTH , HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();

        Dimension screenSize = kit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        int x = (width - WIDTH)/2;
        int y = (height - HEIGHT)/2;
        buttonframe.setLocation(x,y);
        buttonframe.setVisible(true);

        JButton student = new JButton("学生信息系统模块");

        buttonframe.add(student);

        buttonframe.setLayout(new GridLayout(1,1));

        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
                Studentmanageframe studentframe = new Studentmanageframe();
            }
        });
    }
}
