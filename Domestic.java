public class Domestic {
    final int RATE_PER_UNIT = 5;
    final int FIXED_RENT = 250;
    final int FREE_UNIT = 50;
    final int LIMIT = 2000;
    final double SUB_CHARGE = 0.05;
    int consumed_units;
    String name, type = "Domestic";
    Domestic(int consumed_units, String name){
        this.consumed_units = consumed_units;
        this.name = name;
    }

    public int getBill(){
        BillCalculator.getBillTable(type, name, consumed_units, FREE_UNIT, RATE_PER_UNIT, FIXED_RENT, LIMIT, SUB_CHARGE);
        return BillCalculator.getBill(consumed_units, FREE_UNIT, RATE_PER_UNIT, FIXED_RENT, LIMIT, SUB_CHARGE);
    
    }
}