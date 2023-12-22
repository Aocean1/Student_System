import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;
import  javax.swing.*;
class Studentmanageframe extends JPanel {
    static final int WIDTH = 400;
    static final int HEIGHT = 200;
    JFrame studentframe;
    public Studentmanageframe() {
        studentframe = new JFrame();
        studentframe.setTitle("学生信息管理系统");

        studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentframe.setSize(WIDTH , HEIGHT);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        int x = (width - WIDTH)/2;
        int y = (height - HEIGHT)/2;
        studentframe.setLocation(x,y);
        studentframe.setVisible(true);
        studentframe.add(this, BorderLayout.CENTER);

        JButton computerthree = new JButton("计科4233班学生信息系统");

        JLabel title =new JLabel("学生信息系统主界面");
        JLabel banket1 = new JLabel();
        JLabel banket2 = new JLabel();
        GridBagLayout lay = new GridBagLayout();
        setLayout(lay);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.weightx = 2;
        constraints.weighty = 5;
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1,3));
        jp.add(banket1);
        jp.add(title);
        jp.add(banket2);

        studentframe.add(jp, BorderLayout.NORTH);

        add(computerthree, constraints ,0,3,1,1);

        computerthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
                String sql = "select * from studentinfo where class2 = '三班' and major = '计算机科学与技术' ";
                Studentinfo studentinformation = new Studentinfo("计科4233班学生信息系统", sql);
            }
        });
    }

    public void add(Component c,GridBagConstraints constraints, int x ,int y ,int w, int h) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        add(c , constraints);
    }
}
