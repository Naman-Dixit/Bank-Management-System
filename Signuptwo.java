import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signuptwo extends JFrame implements ActionListener {

    JLabel religionLabel, category, income, educational, occupation, panNumber, adhaarNumber, seniorCitizen, existingAccount;
    JComboBox<String> religionComboBox, ctgryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    JTextField panTextField, adhaarTextField;
    JRadioButton seniorYes, seniorNo, accountYes, accountNo;
    ButtonGroup seniorCitizenGroup, existingAccountGroup;
    JButton next;

    String formno;

    Signuptwo(String formno) {
        this.formno = formno;

        setLayout(null);
        setTitle("New Account Application Form - Page 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        religionLabel.setBounds(100, 140, 200, 30);
        add(religionLabel);

        String[] arreligion = {"Hindu", "Sikh", "Jain", "Buddhist", "Jewish"};
        religionComboBox = new JComboBox<>(arreligion);
        religionComboBox.setBounds(300, 140, 400, 30);
        add(religionComboBox);

        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 22));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] ctgry = {"General", "OBC", "SC", "ST", "Other"};
        ctgryComboBox = new JComboBox<>(ctgry);
        ctgryComboBox.setBounds(300, 190, 400, 30);
        add(ctgryComboBox);

        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] incomeOptions = {"NULL", "< 1,50,000", "< 2,50,500", "< 6,00,000", "Upto 10,00,000", "> 12,00,000"};
        incomeComboBox = new JComboBox<>(incomeOptions);
        incomeComboBox.setBounds(300, 240, 400, 30);
        add(incomeComboBox);

        educational = new JLabel("Educational Qualification:");
        educational.setFont(new Font("Raleway", Font.BOLD, 22));
        educational.setBounds(100, 290, 300, 30);
        add(educational);

        String[] educationOptions = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationComboBox = new JComboBox<>(educationOptions);
        educationComboBox.setBounds(300, 320, 400, 30);
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationComboBox.setBackground(Color.white);
        add(educationComboBox);

        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        occupation.setBounds(100, 370, 200, 30);
        add(occupation);

        String[] occupationOptions = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationComboBox = new JComboBox<>(occupationOptions);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(300, 370, 400, 30);
        add(occupationComboBox);

        panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        panNumber.setBounds(100, 420, 200, 30);
        add(panNumber);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 420, 400, 30);
        add(panTextField);

        adhaarNumber = new JLabel("Adhaar Number:");
        adhaarNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        adhaarNumber.setBounds(100, 470, 200, 30);
        add(adhaarNumber);

        adhaarTextField = new JTextField();
        adhaarTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adhaarTextField.setBounds(300, 470, 400, 30);
        add(adhaarTextField);

        seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        seniorCitizen.setBounds(100, 520, 200, 30);
        add(seniorCitizen);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300, 520, 100, 30);
        seniorYes.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorYes.setBackground(Color.white);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(450, 520, 100, 30);
        seniorNo.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorNo.setBackground(Color.white);
        add(seniorNo);

        seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(seniorYes);
        seniorCitizenGroup.add(seniorNo);

        existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 22));
        existingAccount.setBounds(100, 570, 250, 30);
        add(existingAccount);

        accountYes = new JRadioButton("Yes");
        accountYes.setBounds(300, 570, 100, 30);
        accountYes.setFont(new Font("Raleway", Font.BOLD, 14));
        accountYes.setBackground(Color.white);
        add(accountYes);

        accountNo = new JRadioButton("No");
        accountNo.setBounds(450, 570, 100, 30);
        accountNo.setFont(new Font("Raleway", Font.BOLD, 14));
        accountNo.setBackground(Color.white);
        add(accountNo);

        existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(accountYes);
        existingAccountGroup.add(accountNo);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(700, 590, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            String religion = (String) religionComboBox.getSelectedItem();
            String category = (String) ctgryComboBox.getSelectedItem();
            String income = (String) incomeComboBox.getSelectedItem();
            String education = (String) educationComboBox.getSelectedItem();
            String occupation = (String) occupationComboBox.getSelectedItem();

            String pan = panTextField.getText();
            String adhaar = adhaarTextField.getText();

            String senior = seniorYes.isSelected() ? "Yes" : (seniorNo.isSelected() ? "No" : null);
            String existing = accountYes.isSelected() ? "Yes" : (accountNo.isSelected() ? "No" : null);

            if (pan.isEmpty() || adhaar.isEmpty() || senior == null || existing == null) {
                JOptionPane.showMessageDialog(null, "Please fill all required fields");
                return;
            }

            try {
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo VALUES('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + adhaar + "', '" + senior + "', '" + existing + "')";
                c.s.executeUpdate(query);

                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error saving data: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Signuptwo("123456"); // Example form number
    }
}
