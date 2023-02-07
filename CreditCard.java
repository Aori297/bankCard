/**
 * Write a description of class BankCard here.
 *
 * @author (22067574 Shaswat Nibha Maharjan)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    // declaring attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    // creating constructor 
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        // calling the super class constructor
        super(cardID, issuerBank, bankAccount, balanceAmount);
        // setting the client name using the super class setter method
        super.setclientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    // providing accessor method for cvcNumber
    public int getcvcNumber()
    {
        return this.cvcNumber;
    }
    
    // providing accessor method for creditLimit
    public double getcreditLimit()
    {
        return this.creditLimit;
    }
    
    // providing accessor method for interesetRate
    public double getinterestRate()
    {
        return this.interestRate;
    }
    
    // providing accessor method for expirationDate
    public String getexpirationDate()
    {
        return this.expirationDate;
    }
    
    // providing accessor method for gracePeriod
    public int getgracePeriod()
    {
        return this.gracePeriod;
    }
    
    //providing accessor method for isGranted
    public boolean getisGranted()
    {
        return this.isGranted;
    }

    /* creating method
    it checks if the credit limit is granted based on the balance amount*/
    public void setcreditLimit(double creditLimit, int gracePeriod)
    {
        if (creditLimit <= 2.5 * super.getbalanceAmount())
        {
            this.isGranted = true;
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
        } else {
            System.out.println("Credit not granted.");
        }
    }

    /* creating method 
    it remove the client's credit card details*/
    public void cancelCreditCard()
    {
        cvcNumber = 0;
        creditLimit= 0;
        gracePeriod = 0;
        isGranted = false;
    }
    
    /* creating display method with the same signature as the display method in BankCard*/
    public void display() 
    {
        // checking isGranted is set to true or false
        if (isGranted = true){
            // calling display method of BankCard
            super.display();
            // displaying required details
            System.out.println("CVC number: " +this.cvcNumber);
            System.out.println("Credit Limit: " +this.creditLimit);
            System.out.println("Grace Period: " +this.gracePeriod);
            System.out.println("Expiration Date: " +this.expirationDate);
            System.out.println("Interest Rate: " +this.interestRate);
        } else {
            super.display();
            System.out.println("CVC number: " +cvcNumber);
            System.out.println("Expiration Date: " +expirationDate);
            System.out.println("Interest Rate: " +interestRate);
        }
    }
}
