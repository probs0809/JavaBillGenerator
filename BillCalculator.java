/**
 * BillCalculator
 */
public class BillCalculator {

    public static int getBill(int consumed_units, int FREE_UNIT, int RATE_PER_UNIT, int FIXED_RENT, int LIMIT, double SUB_CHARGE){
        int billAmount = 0;
        billAmount += (consumed_units-FREE_UNIT)*RATE_PER_UNIT + FIXED_RENT;
        if(billAmount > LIMIT){
            billAmount += (int)(billAmount * SUB_CHARGE);
        }
        return billAmount;
    }

    public static void getBillTable(String type, String name, int consumed_units, int FREE_UNIT, int RATE_PER_UNIT, int FIXED_RENT, int LIMIT, double SUB_CHARGE){
        
        System.out.println(type+" \t "+ name+" \t\t "+consumed_units+" \t\t\t "+FREE_UNIT+" \t\t Rs."+RATE_PER_UNIT+" \t\t Rs."+FIXED_RENT+" \t Rs."+LIMIT+" \t\t X"+SUB_CHARGE+" \t\t Rs."+ BillCalculator.getBill(consumed_units, FREE_UNIT, RATE_PER_UNIT, FIXED_RENT, LIMIT, SUB_CHARGE));
        
    }

}