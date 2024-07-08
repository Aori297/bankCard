/**
 * Write a description of class BankCard here.
 *
 * @author (22067574 Shaswat Nibha Maharjan)
 * @version (1.0.0)
 */
public class BankCard
{   
    // declaring attributes
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    // making constructor
    public BankCard(){}
    public BankCard(int cardID, String issuerBank, String bankAccount, int balanceAmount)
    {
        // assiging the values of the parameter to the attributes
        this.cardID = cardID;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        // assigning empty string to clientName
        this.clientName = " ";
    }
    
    // providing accessor method for cardID
    public int getcardID()
    {
        return this.cardID;
    }
    
    // providing accessor method for clientName
    public String getclientName()
    {
        return this.clientName;
    }
    
    // providing accessor method for issuerBank
    public String getissuerBank()
    {
        return this.issuerBank;
    }
    
    // providing accessor method for bankAccount
    public String getbankAccount()
    {
        return this.bankAccount;
    }
    
    // providing accessor method for balanceAmount
    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }
    
     // providing mutator method for clientName
    public void setclientName(String newclientName)
    {
        clientName = newclientName;
    }
    
    // providing mutator method for balanceAmount
    public void setbalanceAmount(int newbalanceAmount)
    {
        balanceAmount = newbalanceAmount;
    }
    
    // creating method
    public void display()
    {
        // displaying output
        System.out.println("------------------------");
        System.out.println("cardID: "+this.cardID);
        System.out.println("issuerBank: "+this.issuerBank);
        System.out.println("bankAccount: "+this.bankAccount);
        // System.out.println("balanceAmount: "+this.balanceAmount);
        // checking if clientName is empty or not
        if(clientName != " "){
            // displaying clientName as if it is not empty
            System.out.println("clientName: "+this.clientName);
        }
        else{
                System.out.println("clientName is empty");
        }
    }
}


