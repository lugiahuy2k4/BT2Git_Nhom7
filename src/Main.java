import java.awt.*;
import javax.swing.*;

public class Main {
    private static JTextField txtUserName;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BT2-NHOM7 - Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

            JLabel lblUserName = new JLabel("UserName");
            txtUserName = new JTextField(20); // textbox named txtUserName

            // thêm Label Password và textbox txtpassword
            JLabel lblPassword = new JLabel("Password");
            JTextField txtpassword = new JPasswordField(20); // use JPasswordField for masking

            panel.add(lblUserName);
            panel.add(txtUserName);
            panel.add(lblPassword);
            panel.add(txtpassword);

            // thêm nút btnLogin
            JButton btnLogin = new JButton("đăng nhập");
            panel.add(btnLogin);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
