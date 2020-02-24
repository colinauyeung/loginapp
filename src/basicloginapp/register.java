package basicloginapp;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class register extends JPanel {
	private JTextField username;
	private JTextField password;
	private JTextField comfirmpass;

	/**
	 * Create the panel.
	 */
	public register(JFrame frame, authenticator auth) {
		setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		add(label_4);
		
		JLabel label_5 = new JLabel("");
		add(label_5);
		
		JLabel label_6 = new JLabel("");
		add(label_6);
		
		JLabel label_7 = new JLabel("");
		add(label_7);
		
		JLabel label_8 = new JLabel("");
		add(label_8);
		
		JLabel lblRegisterForAccount = new JLabel("Register ");
		lblRegisterForAccount.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRegisterForAccount.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(lblRegisterForAccount);
		
		JLabel lblForAccount = new JLabel("For account");
		lblForAccount.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(lblForAccount);
		
		JLabel label_10 = new JLabel("");
		add(label_10);
		
		JLabel label_11 = new JLabel("");
		add(label_11);
		
		JLabel label_12 = new JLabel("");
		add(label_12);
		
		JLabel label_13 = new JLabel("");
		add(label_13);
		
		JLabel label_14 = new JLabel("");
		add(label_14);
		
		JLabel label_15 = new JLabel("");
		add(label_15);
		
		JLabel usernamelbl = new JLabel("Username");
		add(usernamelbl);
		
		username = new JTextField();
		add(username);
		username.setColumns(10);
		
		JLabel lblInvalidUsername = new JLabel("Invalid Username");
		lblInvalidUsername.setVisible(false);
		add(lblInvalidUsername);
		
		JLabel label_17 = new JLabel("");
		add(label_17);
		
		JLabel passwordlbl = new JLabel("Password");
		add(passwordlbl);
		
		password = new JTextField();
		add(password);
		password.setColumns(10);
		
		JLabel lblInvalidPassord = new JLabel("Invalid Password");
		lblInvalidPassord.setVisible(false);
		add(lblInvalidPassord);
		
		JLabel label_19 = new JLabel("");
		add(label_19);
		
		JLabel comfrimpasslbl = new JLabel("Confirm\nPassword");
		add(comfrimpasslbl);
		
		comfirmpass = new JTextField();
		add(comfirmpass);
		comfirmpass.setColumns(10);
		
		JLabel lblPasswordsDontMatch = new JLabel("Doesn't match");
		lblPasswordsDontMatch.setVisible(false);
		add(lblPasswordsDontMatch);
		
		JLabel label_21 = new JLabel("");
		add(label_21);
		
		JLabel label_22 = new JLabel("");
		add(label_22);
		
		JButton buttonregister = new JButton("register");
		buttonregister.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String user = username.getText();
				String pass = password.getText();
				String confirm = comfirmpass.getText();
				if(!pass.equals(confirm)) {
					lblPasswordsDontMatch.setVisible(true);
					return;
				}
				String mess = auth.register(user, pass);
				if(mess == "Invalid username" || mess == "Username taken") {
					lblInvalidUsername.setVisible(true);
					return;
				}
				if(mess == "Invalid password") {
					lblInvalidPassord.setVisible(true);
					return;
				}
				login panel = new login(frame, auth);
				frame.setContentPane(panel);
				frame.revalidate();
			}
		});
		add(buttonregister);
		
		JLabel label_23 = new JLabel("");
		add(label_23);
		
		JLabel label_24 = new JLabel("");
		add(label_24);
		
		JLabel label_25 = new JLabel("");
		add(label_25);
		
		JLabel loginlabel = new JLabel("or Login in");
		loginlabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(loginlabel);
		
		JLabel label_26 = new JLabel("");
		add(label_26);
		
		JLabel label_27 = new JLabel("");
		add(label_27);
		
		JLabel label_28 = new JLabel("");
		add(label_28);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				login panel = new login(frame, auth);
				frame.setContentPane(panel);
				frame.revalidate();
				
			}
		});
		add(btnLogin);
		
		JLabel label_29 = new JLabel("");
		add(label_29);

	}

}
