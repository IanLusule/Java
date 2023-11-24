// Import the necessary packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

// Create a class that extends JFrame and implements ActionListener
public class RegistrationForm extends JFrame implements ActionListener {

  // Declare the components as instance variables
  private JLabel title, nameLabel, usernameLabel, passwordLabel, emailLabel, phoneLabel, addressLabel, message;
  private JTextField nameField, usernameField, emailField, phoneField;
  private JPasswordField passwordField;
  private JTextArea addressArea;
  private JButton submitButton, resetButton, closeButton;
  private JPanel panel;

  // Declare the connection, statement, and result set variables
  private Connection con;
  private Statement stmt;
  private ResultSet rs;

  // Create a constructor that initializes the components with default values
  public RegistrationForm() {
    // Set the title, size, layout, and default close operation of the frame
    setTitle("Registration Form");
    setSize(400, 500);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create the components
    title = new JLabel("Registration Form");
    title.setFont(new Font("Arial", Font.BOLD, 18));
    title.setHorizontalAlignment(SwingConstants.CENTER);

    nameLabel = new JLabel("Name:");
    usernameLabel = new JLabel("Username:");
    passwordLabel = new JLabel("Password:");
    emailLabel = new JLabel("Email:");
    phoneLabel = new JLabel("Phone:");
    addressLabel = new JLabel("Address:");

    nameField = new JTextField(10);
    usernameField = new JTextField(10);
    passwordField = new JPasswordField(10);
    emailField = new JTextField(10);
    phoneField = new JTextField(10);
    addressArea = new JTextArea(5, 10);
    addressArea.setLineWrap(true);

    submitButton = new JButton("Submit");
    submitButton.addActionListener(this);
    resetButton = new JButton("Reset");
    resetButton.addActionListener(this);
    closeButton = new JButton("Close");
    closeButton.addActionListener(this);

    message = new JLabel("");
    message.setForeground(Color.RED);

    panel = new JPanel();
    panel.setLayout(new GridLayout(8, 2, 6, 6));

    // Add the components to the panel
    panel.add(nameLabel);
    panel.add(nameField);
    panel.add(usernameLabel);
    panel.add(usernameField);
    panel.add(passwordLabel);
    panel.add(passwordField);
    panel.add(emailLabel);
    panel.add(emailField);
    panel.add(phoneLabel);
    panel.add(phoneField);
    panel.add(addressLabel);
    panel.add(addressArea);
    panel.add(submitButton);
    panel.add(resetButton);
    panel.add(closeButton);
    panel.add(message);

    // Add the title and the panel to the frame
    add(title, BorderLayout.NORTH);
    add(panel, BorderLayout.CENTER);

    // Make the frame visible
    setVisible(true);

    // Establish the connection to the database
    try {
      // Load the driver class
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Create the connection object
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");

      // Create the statement object
      stmt = con.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Define the actionPerformed method that will handle the button clicks
  public void actionPerformed(ActionEvent ae) {
    // Get the source of the action
    Object source = ae.getSource();

    // If the source is the submit button
    if (source == submitButton) {
      // Get the values from the text fields and the text area
      String name = nameField.getText();
      String username = usernameField.getText();
      String password = new String(passwordField.getPassword());
      String email = emailField.getText();
      String phone = phoneField.getText();
      String address = addressArea.getText();

      // Validate the input
      if (name.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
        // Display an error message
        message.setText("Please fill all the fields");
      } else {
        // Insert the values into the registration table
        try {
          // Prepare the SQL query
          String query = "INSERT INTO registration VALUES (?, ?, ?, ?, ?, ?)";

          // Create the prepared statement object
          PreparedStatement ps = con.prepareStatement(query);

          // Set the values for the parameters
          ps.setString(1, name);
          ps.setString(2, username);
          ps.setString(3, password);
          ps.setString(4, email);
          ps.setString(5, phone);
          ps.setString(6, address);

          // Execute the query
          int result = ps.executeUpdate();

          // Check the result
          if (result > 0) {
            // Display a success message
            message.setText("Registration successful");
          } else {
            // Display a failure message
            message.setText("Registration failed");
          }

          // Close the prepared statement
          ps.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    // If the source is the reset button
    if (source == resetButton) {
      // Clear the text fields and the text area
      nameField.setText("");
      usernameField.setText("");
      passwordField.setText("");
      emailField.setText("");
      phoneField.setText("");
      addressArea.setText("");

      // Clear the message
      message.setText("");
    }

    // If the source is the close button
    if (source == closeButton) {
      // Exit the program
      System.exit(0);
    }
  }

  // Create the main method that will launch the application
  public static void main(String[] args) {
    // Create an object of the RegistrationForm class
    RegistrationForm rf = new RegistrationForm();
  }
}
