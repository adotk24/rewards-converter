import java.util.Scanner;

public class RewardValue {
    private final doubleCashValue
    public static final double MilesToCash = 0.0035

    public RewardValue(double CashValue){
        this.CashValue = CashValue
    }
    public RewardValue(int milesValue){
        this.CashValue = convertToCash(milesValue)
    }
    private static int convertToMiles(double cashValue){
        return (int) (cashValue / MilesToCash)
    }
    private static double convertToCash(int milesValue){
        return MilesToCash * milesValue
    }
    public int getMilesValue(){
        return converToMiles(this.CashValue)
    }

}
