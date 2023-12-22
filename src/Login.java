import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Login extends JPanel   {
    static  final int WIDTH =300;
    static  final int HEIGHT = 150;
    JFrame loginframe;

    public void add(Component c, GridBagConstraints constraints,int x,int y,int w,int h)    {
        constraints.gridx =x;
        constraints.gridy =y;
        constraints.gridwidth =w;
        constraints.gridheight =h;
        add(c,constraints);
    }
    Login() {

        loginframe = new JFrame("信息管理系统");

        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout lay =new GridBagLayout();
        setLayout(lay);

        loginframe.add(this,BorderLayout.WEST);
        loginframe.setSize(WIDTH,HEIGHT);

        Toolkit kit =Toolkit.getDefaultToolkit();

        Dimension screenSize = kit.getScreenSize();
        int width =screenSize.width;
        int height =screenSize.height;
        int x = (width - WIDTH) / 2;
        int y = (height - HEIGHT) / 2;
        loginframe.setLocation(x,y);
        JButton ok = new JButton("登录");
        JButton cancel = new JButton("放弃");

        JLabel title = new JLabel("信息系统登录窗口");
        JLabel name = new JLabel("用户名");
        JLabel password = new JLabel("密码");

        final  JTextField nameinput = new JTextField(15);
        final JPasswordField passwordinput = new JPasswordField(15);
        passwordinput.setEchoChar('*');

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.weightx = 3;
        constraints.weighty = 4;

        add(title,constraints,0,0,4,1);
        add(name,constraints,0,1,1,1);
        add(password,constraints,0,2,1,1);
        add(nameinput,constraints,2,1,1,1);
        add(passwordinput,constraints,2,2,1,1);
        add(ok,constraints,0,3,1,1);
        add(cancel,constraints,2,3,1,1);
        loginframe.setResizable(false);
        loginframe.setVisible(true);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
                String nametext = nameinput.getText();

                String passwordtext = passwordinput.getText();

                String str = passwordtext;

                boolean x = (nametext.equals("talang"));
                boolean y = (str.equals("123456"));
                boolean z =(x && y);
                if(z == true)   {
                    JOptionPane.showMessageDialog(null,"登陆成功！");
                    loginframe.dispose();
                    //Mainframe main = new Mainframe();
                } else if (z == false) {
                    JOptionPane.showMessageDialog(null,"用户名或密码错误，请重新登录！");
                    nameinput.setText("");
                    passwordinput.setText("");
                }
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
                loginframe.dispose();
            }
        });
    }
}


