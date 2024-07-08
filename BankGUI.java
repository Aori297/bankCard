 /**
 * Write a description of class BankGUI here.
 *
 * @author (22067574 Shaswat Nibha Maharjan)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
import java.awt.Color;

public class BankGUI implements ActionListener
{
    private JFrame guiFrame;
    private ArrayList<BankCard>arrList = new ArrayList<>();
    
    // Declaring all the elements
        // Debit Elements 
    private JLabel debitLabel, debitCardLabel, debitClientLabel, debitIssuerLabel, debitAccountLabel, debitAmountLabel, debitPinLabel;
    private JTextField debitCardText, debitClientText, debitIssuerText, debitAccountText, debitAmountText, debitPinText;
    private JButton addDebitButton, displayDebitButton;
    
        // Withdraw Elements
    private JLabel withdrawLabel, withCardIDLabel, withDateLabel, balWithdrawLabel, rsLabel, withPinLabel;
    private JTextField withCardIDText, balWithdrawText, withPinText;
    private JComboBox debitDayCombo, debitMonthCombo, debitYearCombo;
    private JButton withProceedButton, withClearButton;
    
        // Credit Elements
    private JLabel creditLabel, creditCardLabel, creditClientLabel, creditIssuerLabel, creditAccountLabel, creditAmountLabel, creditCVCLabel, creditInterestLabel, creditExpirationLabel;
    private JTextField creditCardText, creditClientText, creditIssuerText, creditAccountText, creditAmountText, creditCVCText, creditInterestText;
    private JComboBox creditDayCombo, creditMonthCombo, creditYearCombo;
    private JButton addCreditButton, displayCreditButton;
    
        // Credit Limit
    private JLabel limitLabel, creditCardIDLabel, limitHeadLabel, limitGraceLabel, limitCardCancelLabel ;
    private JTextField creditCardIDText, limitText, limitGraceText, limitCardCancelText;
    private JButton limitProceedButton, limitCancelButton, limitClearButton;
    
        // Clear All
    private JButton clearAllButton;
    
    public BankGUI(){
        // Creating JFrame
        JFrame guiFrame = new JFrame();

        
        // Creating Debit Details Heading
        debitLabel = new JLabel("Debit Details");
            // Creating Card ID for Debit
        debitCardLabel = new JLabel("Card ID");
        debitCardText = new JTextField();
            // Creating Client Name for Debit
        debitClientLabel = new JLabel("Client Name");
        debitClientText = new JTextField();
            // Creating Issuer Bank for Debit
        debitIssuerLabel = new JLabel("Issuer Bank");
        debitIssuerText = new JTextField();
            // Creating Bank Account for Debit
        debitAccountLabel = new JLabel("Bank Account");
        debitAccountText = new JTextField();
            // Creating Balance Amount for Debit
        debitAmountLabel = new JLabel("Balance Amount");
        debitAmountText = new JTextField();
            // Creating Pin Number for Debit
        debitPinLabel = new JLabel("Pin Number");
        debitPinText = new JTextField();
            // Creating buttons of Debit Details
        addDebitButton = new JButton("Add Debit Card Details");
        displayDebitButton = new JButton("Display Details");
        
        
        // Creating Withdraw Heading
        withdrawLabel = new JLabel("Withdraw");
            // Creating Text Field for Card ID
        withCardIDLabel = new JLabel("Card ID");
        withCardIDText = new JTextField();
            // Creating Withdrawal Date Label and Combo Box
        withDateLabel = new JLabel("Withdrawal Date");
        debitDayCombo = new JComboBox();
        for (int d = 1; d <=31; d++){
            debitDayCombo.addItem(d);
        }
        debitMonthCombo = new JComboBox();
        for (int m = 1; m <=12; m++){
            debitMonthCombo.addItem(m);
        }
        debitYearCombo = new JComboBox();
        for (int y = 1999; y <=2023; y++){
            debitYearCombo.addItem(y);
        }
            // Creating Amount to Withdraw
        balWithdrawLabel = new JLabel("Input the amount you want to withdrawal");
        rsLabel = new JLabel("Rs");
        balWithdrawText = new JTextField("");
            // Creating Pin Number for Withdraw
        withPinLabel = new JLabel("Pin Number");
        withPinText = new JTextField("");
            // Creating Buttons for Withdraw
        withProceedButton = new JButton("Proceed");
        withClearButton = new JButton("Clear");
        
        
        // Creating Credit Details Heading
        creditLabel = new JLabel("Credit Details");
            // Creating Card ID for Credit
        creditCardLabel = new JLabel("Card ID");
        creditCardText = new JTextField();
            // Creating Client Name for Credit
        creditClientLabel = new JLabel("Client Name");
        creditClientText = new JTextField();
            // Creating Issuer Bank for Credit
        creditIssuerLabel = new JLabel("Issuer Bank");
        creditIssuerText = new JTextField();
            // Creating Bank Account for Credit
        creditAccountLabel = new JLabel("Bank Account");
        creditAccountText = new JTextField();
            // Creating Balance Amount for Credit
        creditAmountLabel = new JLabel("Balance Amount");
        creditAmountText = new JTextField();
            // Creating CVC Number for Credit
        creditCVCLabel = new JLabel("CVC Number");
        creditCVCText = new JTextField();
            // Creating Interest Rate for Credit
        creditInterestLabel = new JLabel("Interest Rate");
        creditInterestText = new JTextField();
            // Creating Expiration Date for Credit
        creditExpirationLabel = new JLabel("Expiration Date");
        creditDayCombo = new JComboBox();
        for (int d = 1; d <=31; d++){
            creditDayCombo.addItem(d);
        }
        creditMonthCombo = new JComboBox();
        for (int m = 1; m <=12; m++){
            creditMonthCombo.addItem(m);
        }
        creditYearCombo = new JComboBox();
        for (int y = 1999; y <=2023; y++){
            creditYearCombo.addItem(y);
        }
        
            // Creating buttons of Debit Details
        addCreditButton = new JButton("Add Credit Card Details");
        displayCreditButton = new JButton("Display Details");
        
        
        // Creating Credit Limit Heading
        limitHeadLabel = new JLabel("Credit Limit");
            // Creating Card ID for Credit Limit
        creditCardIDLabel = new JLabel("Card ID");
        creditCardIDText = new JTextField();
            // Creating Credit Limit for Limit
        limitLabel = new JLabel("Credit Limit");
        limitText = new JTextField();
            // Creating Grace Limit for Credit Limit
        limitGraceLabel = new JLabel("Grace Period");
        limitGraceText = new JTextField();
            // Creating CardID for Cancel Credit Card
        limitCardCancelLabel = new JLabel("Enter the card id you want to cancel");
        limitCardCancelText = new JTextField();
            // Creating Button for Credit Limit
        limitProceedButton = new JButton("Proceed");
        limitCancelButton = new JButton("Cancel Credit Card");
        limitClearButton = new JButton("Clear");
        
        // Creating Clear All Button
        clearAllButton = new JButton("Clear All");
    
        //Setting the size for Debit Details
        debitLabel.setBounds(138, 43, 145, 25);
            // setBounds for Card ID
        debitCardLabel.setBounds(50, 86, 52, 15);
        debitCardText.setBounds(164, 83, 187, 24);
            // setBounds for Client Name
        debitClientLabel.setBounds(50, 120, 81, 15);
        debitClientText.setBounds(164, 117, 187, 24);
            // setBounds for Issuer Bank
        debitIssuerLabel.setBounds(50, 154, 78, 15);
        debitIssuerText.setBounds(164, 151, 187, 24);
            // setBounds for Balance Amount
        debitAmountLabel.setBounds(50, 188, 106, 15);
        debitAmountText.setBounds(164, 185, 187, 24);
            // setBounds for Bank Account
        debitAccountLabel.setBounds(50, 222, 86, 15);
        debitAccountText.setBounds(164, 219, 186, 24);
            // setBounds for Pin Number
        debitPinLabel.setBounds(50, 256, 78, 15);
        debitPinText.setBounds(164, 253 , 186, 24);
            // setBounds for Buttons
        addDebitButton.setBounds(50, 289, 194, 24);
        displayDebitButton.setBounds(268, 309, 128, 24);
        
        
        // Setting the size for Withdraw
        withdrawLabel.setBounds(173, 379, 90, 21);
            // setBounds for CardID
        withCardIDLabel.setBounds(55, 370, 107, 15);
        withCardIDText.setBounds(55, 388, 76, 24);
            // setBounds for Withdrawal Date and Combo Box
        withDateLabel.setBounds(55, 425, 107, 15);
        debitDayCombo.setBounds(184, 422, 60, 24);
        debitMonthCombo.setBounds(253, 422, 60, 24);
        debitYearCombo.setBounds(322, 422, 60, 24);
            // setBounds for Balance Withdraw
        balWithdrawLabel.setBounds(55, 453, 251, 15);
        rsLabel.setBounds(73, 482, 21, 15);
        balWithdrawText.setBounds(104, 479, 164, 24);
            // setBounds for Pin Number
        withPinLabel.setBounds(55, 514, 78, 15);
        withPinText.setBounds(141, 512, 154, 24);
            // setBounds for Buttons
        withProceedButton.setBounds(55, 545, 92, 24);
        withClearButton.setBounds(322, 556, 78, 24);
        
        
        //Setting the size for Credit Details
        creditLabel.setBounds(593, 38, 145, 25);
            // setBounds for Card ID
        creditCardLabel.setBounds(501, 80, 52, 15);
        creditCardText.setBounds(602, 77, 187, 24);
            // setBounds for Client Name
        creditClientLabel.setBounds(501, 110, 81, 15);
        creditClientText.setBounds(602, 106, 187, 24);
            // setBounds for Issuer Bank
        creditIssuerLabel.setBounds(501, 140, 78, 15);
        creditIssuerText.setBounds(602, 136, 187, 24);
            // setBounds for Balance Amount
        creditAmountLabel.setBounds(501, 169, 106, 15);
        creditAmountText.setBounds(602, 166, 187, 24);
            // setBounds for Bank Account
        creditAccountLabel.setBounds(501, 199, 86, 15);
        creditAccountText.setBounds(602, 196, 187, 24);
            // setBounds for Pin Number
        creditCVCLabel.setBounds(502, 229, 87, 15);
        creditCVCText.setBounds(602, 226, 187, 24);
            // setBounds for Pin Number
        creditInterestLabel.setBounds(502, 259, 84, 15);
        creditInterestText.setBounds(602, 256, 187, 24);
            // setBounds for Pin Number
        creditExpirationLabel.setBounds(502, 288, 100, 15);
        creditDayCombo.setBounds(602, 286, 60, 24);
        creditMonthCombo.setBounds(671, 286, 60, 24);
        creditYearCombo.setBounds(740, 286, 60, 24);
            // setBounds for Buttons
        addCreditButton.setBounds(502, 318, 182, 24);
        displayCreditButton.setBounds(714, 334, 120, 24);
        
        
        // Setting the size for Credit Limit
        limitHeadLabel.setBounds(646, 400, 111, 21);
            // setBounds for Card ID
        creditCardIDLabel.setBounds(521, 393, 107, 15);
        creditCardIDText.setBounds(521, 410, 76, 24);
            // setBounds for Credit Limit    
        limitLabel.setBounds(521, 447, 75, 15);
        limitText.setBounds(631, 444, 173, 24);
            // setBounds for Grace Period
        limitGraceLabel.setBounds(521, 479, 86, 15);
        limitGraceText.setBounds(631, 475, 173, 24);
            // setBounds for Card ID for Cancel Credit Card
        limitCardCancelLabel.setBounds(539, 563, 231, 16);
        limitCardCancelText.setBounds(539, 586, 62, 24);
            // setBounds for Buttons
        limitProceedButton.setBounds(521, 511, 97, 24);
        limitCancelButton.setBounds(618, 586, 157, 24);
        limitClearButton.setBounds(772, 547, 78, 24);
        
        // Setting Clear All Button
        clearAllButton.setBounds(406, 600, 83, 24);
        
        // Showing Debit Details in the frame
        guiFrame.add(debitLabel);
        guiFrame.add(debitClientLabel);
        guiFrame.add(debitClientText);
        guiFrame.add(debitCardLabel);
        guiFrame.add(debitCardText);
        guiFrame.add(debitIssuerLabel);
        guiFrame.add(debitIssuerText);
        guiFrame.add(debitAccountLabel);
        guiFrame.add(debitAccountText);
        guiFrame.add(debitAmountLabel);
        guiFrame.add(debitAmountText);
        guiFrame.add(debitPinLabel);
        guiFrame.add(debitPinText);
        guiFrame.add(addDebitButton);
        guiFrame.add(displayDebitButton);
        
        // Showing Withdraw in the frame
        guiFrame.add(withdrawLabel);
        guiFrame.add(withCardIDLabel);
        guiFrame.add(withCardIDText);
        guiFrame.add(withDateLabel);
        guiFrame.add(debitDayCombo);
        guiFrame.add(debitMonthCombo);
        guiFrame.add(debitYearCombo);
        guiFrame.add(balWithdrawLabel);
        guiFrame.add(rsLabel);
        guiFrame.add(balWithdrawText);
        guiFrame.add(withPinLabel);
        guiFrame.add(withPinText);
        guiFrame.add(withProceedButton);
        guiFrame.add(withClearButton);
        
        // Showing Credit Details in the frame
        guiFrame.add(creditLabel);
        guiFrame.add(creditClientLabel);
        guiFrame.add(creditClientText);
        guiFrame.add(creditCardLabel);
        guiFrame.add(creditCardText);
        guiFrame.add(creditIssuerLabel);
        guiFrame.add(creditIssuerText);
        guiFrame.add(creditAccountLabel);
        guiFrame.add(creditAccountText);
        guiFrame.add(creditAmountLabel);
        guiFrame.add(creditAmountText);
        guiFrame.add(creditCVCLabel);
        guiFrame.add(creditCVCText);
        guiFrame.add(creditInterestLabel);
        guiFrame.add(creditInterestText);
        guiFrame.add(creditExpirationLabel);
        guiFrame.add(creditDayCombo);
        guiFrame.add(creditMonthCombo);
        guiFrame.add(creditYearCombo);
        guiFrame.add(addCreditButton);
        guiFrame.add(displayCreditButton);
        
        // Showing Credit Limit in the frame
        guiFrame.add(limitHeadLabel);
        guiFrame.add(creditCardIDLabel);
        guiFrame.add(creditCardIDText);
        guiFrame.add(limitLabel);
        guiFrame.add(limitText);
        guiFrame.add(limitGraceLabel);
        guiFrame.add(limitGraceText);
        guiFrame.add(limitCardCancelLabel);
        guiFrame.add(limitCardCancelText);
        guiFrame.add(limitProceedButton);
        guiFrame.add(limitCancelButton); 
        guiFrame.add(limitClearButton);
        
        // Showing Clear All Button
        guiFrame.add(clearAllButton);
        
        // Action Listener for Debit Section
        addDebitButton.addActionListener(this);
        displayDebitButton.addActionListener(this);
        withClearButton.addActionListener(this);
        withProceedButton.addActionListener(this);
        
        // Action Listener for Credit Section
        addCreditButton.addActionListener(this);
        displayCreditButton.addActionListener(this);
        limitProceedButton.addActionListener(this);
        limitClearButton.addActionListener(this);
        limitCancelButton.addActionListener(this);
        
        
        // Clear All Button
        clearAllButton.addActionListener(this);
        
        
        // Creating ArrayList
        ArrayList BankCard = new ArrayList();
        
        // Setting Colors for Buttons
        withClearButton.setBackground(new Color(183, 15, 10));
        limitClearButton.setBackground(new Color(183, 15, 10));
        clearAllButton.setBackground(new Color(128, 0, 0));
        
        // Colors
        JPanel guiPanel = new JPanel();
        guiPanel.setBackground(new Color(209, 215, 206));
        guiPanel.setBounds(0, 0, 890, 690);
        guiFrame.add(guiPanel);
        
        guiFrame.setSize(890, 690);
        guiFrame.setLayout(null);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Bank GUI");
        guiFrame.setResizable(false);
        guiFrame.setVisible(true);
    }
    
    public static void main(String[] args){
        BankGUI obj = new BankGUI();
    }

    public void actionPerformed(ActionEvent e){
        // below three buttons clears the GUI text field
        if(e.getSource() == withClearButton){
            withCardIDText.setText("");
            balWithdrawText.setText("");
            withPinText.setText("");
        }
        
        if(e.getSource() == limitClearButton){
            creditCardIDText.setText("");
            limitText.setText("");
            limitGraceText.setText("");
        }
        
        if(e.getSource() == clearAllButton){
            debitCardText.setText("");
            debitClientText.setText("");
            debitIssuerText.setText("");
            debitAccountText.setText("");
            debitAmountText.setText("");
            debitPinText.setText("");
            withCardIDText.setText("");
            balWithdrawText.setText("");
            withPinText.setText("");
            
            creditCardText.setText("");
            creditClientText.setText("");
            creditIssuerText.setText("");
            creditAccountText.setText("");
            creditAmountText.setText("");
            creditCVCText.setText("");
            creditInterestText.setText("");
            creditCardIDText.setText("");
            limitText.setText("");
            limitGraceText.setText("");
            limitCardCancelText.setText("");
        }
        
        // below two buttons displays the details in terminal
        if(e.getSource() == displayDebitButton){
            for(BankCard obj: arrList){
                // checking if the object is of type DebitCard or CreditCard
                if (!(obj instanceof DebitCard)) {
                        continue;
                    }
                obj.display();
            }
        }
        
        if(e.getSource() == displayCreditButton){
            for(BankCard obj: arrList){
                // checking if the object is of type DebitCard or CreditCard
                if (!(obj instanceof CreditCard)) {
                        continue;
                    }
                obj.display();
            }
        }
        
        // below three buttons withdraws, sets credit limit and cancels credit limit.
        if(e.getSource() == withProceedButton){
            try{
                boolean test = false;
                int cardID = Integer.parseInt(withCardIDText.getText());
                
                String day = debitDayCombo.getSelectedItem().toString();
                String month = debitMonthCombo.getSelectedItem().toString();
                String year = debitYearCombo.getSelectedItem().toString();
                String date = day+"/"+month+"/"+year; 
                
                int balanceAmount = Integer.parseInt(balWithdrawText.getText());
                int pinNumber = Integer.parseInt(withPinText.getText());
                for (BankCard obj: arrList){
                    // checking if the object is of type DebitCard or CreditCard
                    if (!(obj instanceof DebitCard)) {
                        continue;
                    }
                    // checking if the cardID exists or not
                    if (obj.getcardID() == cardID){
                        test = true;
                        int w = ((DebitCard)obj).withdraw(balanceAmount, date, pinNumber);
                        if(w == 1){
                            JOptionPane.showMessageDialog(null, "Pin Number is incorrect.");
                        }
                        else if(w == 2){
                            JOptionPane.showMessageDialog(null, "Insufficient Balance.");
                        }
                        else if(w == 0){
                            JOptionPane.showMessageDialog(null, "Withdraw Successful.");
                        }
                    }
                }
                // Checking if a debit card is added or not
                if(arrList.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted a debit card.");
                }
                
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted correct data or every text field is filled.");
            }
        }
        
        if(e.getSource() == limitProceedButton){
            try{
                boolean test = false;
                
                int cardID = Integer.parseInt(creditCardIDText.getText());
                
                int creditLimit = Integer.parseInt(limitText.getText());
                int GracePeriod = Integer.parseInt(limitGraceText.getText());
                // checking if the object is of type DebitCard or CreditCard
                for (BankCard obj: arrList){
                    if (!(obj instanceof CreditCard)) {
                        continue;
                    }
                    // checking if the cardID exists or not
                    if (((CreditCard)obj).getcardID() == cardID){
                        test = true;
                        ((CreditCard)obj).setcreditLimit(creditLimit, GracePeriod);
                        JOptionPane.showMessageDialog(null, "Credit Limit set successfully.");
                    }
                }
                // Checking if a credit card is added or not
                if(arrList.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted a credit card.");
                }
                
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted correct data or every text field is filled.");
            }
        }
        
        if(e.getSource() == limitCancelButton){
            try{
                boolean test = false;
                int cardID = Integer.parseInt(limitCardCancelText.getText());
                for(BankCard obj: arrList){
                    if (!(obj instanceof CreditCard)) {
                        continue;
                    }
                    if (obj.getcardID() == cardID){
                        test = true;
                        ((CreditCard)obj).cancelCreditCard();
                        JOptionPane.showMessageDialog(null, "Credit Cancelled");
                    }
                }
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter the Card ID.");
            }
        }
        
        // These two button adds the details to the cards
        if (e.getSource() == addDebitButton){
            try{
                int cardID = Integer.parseInt(debitCardText.getText());
                
                String clientName = debitClientText.getText();
                String issuerBank = debitIssuerText.getText();
                String bankAccount = debitAccountText.getText();
                int balanceAmount = Integer.parseInt(debitAmountText.getText());
                int pinNumber = Integer.parseInt(debitPinText.getText());
                DebitCard debitCard = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber);
                boolean check = false;
                for (BankCard obj: arrList){
                    if (!(obj instanceof DebitCard)) {
                        check = true;
                        continue;
                    } 
                    if (((DebitCard)obj).getcardID() == cardID){
                        JOptionPane.showMessageDialog(null, "The Card ID was already detected in the system.");
                        check = false;
                        break;
                    }
                    else{
                        check = true;
                    }
                }
                if((arrList.isEmpty()) || (check)){
                    arrList.add(debitCard);
                    JOptionPane.showMessageDialog(null, "Debit Card successfully added.");
                }
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            }
        }   
    
        if (e.getSource() == addCreditButton){
            try{
                int cardID = Integer.parseInt(creditCardText.getText());
                String clientName = creditClientText.getText();
                String issuerBank = creditIssuerText.getText();
                String bankAccount = creditAccountText.getText();
                int balanceAmount = Integer.parseInt(creditAmountText.getText());
                int cvcNumber =  Integer.parseInt(creditCVCText.getText());
                int interestRate = Integer.parseInt(creditInterestText.getText());
                String day = creditDayCombo.getSelectedItem().toString();
                String month = creditMonthCombo.getSelectedItem().toString();
                String year = creditYearCombo.getSelectedItem().toString();
                String expDate = day+"/"+month+"/"+year;
                
                CreditCard creditCard = new CreditCard(cardID, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expDate);
                boolean check = false;
                for (BankCard obj: arrList){
                    if (!(obj instanceof CreditCard)) {
                        check = true;
                        continue;
                    }
                    if (((CreditCard)obj).getcardID() == cardID){
                        JOptionPane.showMessageDialog(null, "The Card ID was already detected in the system.");
                        check = false;
                        break;
                    }
                    else{
                        check = true;
                    }
                }
                if((arrList.isEmpty()) || (check)){
                    arrList.add(creditCard);
                    JOptionPane.showMessageDialog(null, "Credit Card successfully added.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            }
        }
    }
}
