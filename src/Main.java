import javax.swing.*;
import java.awt.*;

public class Main {
    private static JTextField txtUserName;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BT2-NHOM7 - Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

            JLabel lblUserName = new JLabel("UserName");
            txtUserName = new JTextField(20); // textbox named txtUserName

            // thêm Label Mật khẩu và textbox txtmatkhau
            JLabel lblPassword = new JLabel("Mật khẩu");
            JTextField txtmatkhau = new JPasswordField(20); // or JTextField if plain

            panel.add(lblUserName);
            panel.add(txtUserName);
            panel.add(lblPassword);
            panel.add(txtmatkhau);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
