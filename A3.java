import java.util.Scanner;

public class A3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Input//
        String InvestorName = scan.nextLine();
        Double TGP = scan.nextDouble();
        int HP = scan.nextInt();
        
        //Final//
        final Double GOLD_PRICE_PER_GRAM = 385.50;
        final Double MINTING_FEE_PER_BAR = 45.00;
        final Double YEARLY_VAULT_FEE = 15.00;  
        
        //Calculation//
        int year = HP/12;
        int month = HP%12;
        int totalbar = (int)(TGP/10);
        Double loosegrams = TGP%10;
        Double GoldValue = (TGP*GOLD_PRICE_PER_GRAM);
        Double MintingFee = (totalbar*MINTING_FEE_PER_BAR);
        Double VaultFee = (year*YEARLY_VAULT_FEE);
        Double TotalCost = (GoldValue+MintingFee+VaultFee);
        
        //Output//
        System.out.println("--- AURAGOLD SUMMARY ---");
        System.out.println("Name: " + InvestorName);
        System.out.println("Duration: " + year + " Years, " + month + " Months");
        System.out.printf("Gold: %.2f grams%n%n" , TGP );
        System.out.println("10g Bars: " + totalbar );
        System.out.printf("Loose Grams: %.2f%n%n", loosegrams );
        System.out.printf("Gold Value: RM %,.2f%n" , GoldValue );
        System.out.printf("Minting Fee: RM %,.2f%n" , MintingFee );
        System.out.printf("Vault Fee: RM %,.2f%n" ,VaultFee );
        System.out.println("------------------------");
        System.out.printf("Total Cost: RM %,.2f%n" , TotalCost);
        System.out.println("------------------------");

        scan.close();
    }
}