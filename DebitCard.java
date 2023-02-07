/**
 * Write a description of class BankCard here.
 *
 * @author (22067574 Shaswat Nibha Maharjan)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    // declaring all the attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    // creating constructor
    public DebitCard(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        // calling super class
        super(cardID, issuerBank, bankAccount, balanceAmount);
        // initializing attributes
        setclientName(clientName);
        this.pinNumber = pinNumber; 
        this.hasWithdrawn = false; 
    }
    
    // providing accessor method for pinNumber
         public int getpinNumber()
    {
        return this.pinNumber;
    }
    
    // providing accessor method for withdrawalAmount
    public int getwithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    // providing accessor method for dateOfWithdrawal
    public String getdateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    // providing accessor method for hasWithdrawn
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    // providing mutator method for withdrawalAmount
    public void setwithdrawalAmount(int withdrawalAmount)
    {
        withdrawalAmount = withdrawalAmount;
    }
    
    /* creating method named withdraw 
    it checks if the pin number is valid and sufficient amount is present*/
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        // to check if the PIN number matches or not
        if(pinNumber != getpinNumber()){
            System.out.println("PIN Number is incorrect.");
            
            // checking if there is sufficient balance to withdrawal
        } else if (withdrawalAmount > super.getbalanceAmount()){
            System.out.println("You dont have sufficient balance.");
            
            // deducting balance if the above two conditions are met
        } else {
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.withdrawalAmount = withdrawalAmount;
            this.hasWithdrawn = true;
            super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);
        }
    }
    
    /* creating display method with the same signature as the display method in BankCard 
       i.e. same method name and number of parameters*/
    public void display()
    {
        // displaying required attribute values 
        if(hasWithdrawn == true){
            // calling display method of BankCard
            super.display();
            // displaying data with suitable annotations
            System.out.println("pinNumber: "+pinNumber);
            System.out.println("withdrawalAmount: "+withdrawalAmount);
            System.out.println("dateOfWithdrawal: "+dateOfWithdrawal);
        } else {
            System.out.println("balanceAmount: "+getbalanceAmount());
        }
    }
}
