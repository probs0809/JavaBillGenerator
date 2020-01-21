public class Industrial {
    final int RATE_PER_UNIT = 10;
    final int FIXED_RENT = 500;
    final int FREE_UNIT = 100;
    final int LIMIT = 10000;
    final double SUB_CHARGE = 0.1;
    int consumed_units;
    String name, type = "Industrial";
    Industrial(int consumed_units, String name){
        this.consumed_units = consumed_units;
        this.name = name;
    }

    public int getBill(){
        BillCalculator.getBillTable(type, name, consumed_units, FREE_UNIT, RATE_PER_UNIT, FIXED_RENT, LIMIT, SUB_CHARGE);
        return BillCalculator.getBill(consumed_units, FREE_UNIT, RATE_PER_UNIT, FIXED_RENT, LIMIT, SUB_CHARGE);
    }
    
}