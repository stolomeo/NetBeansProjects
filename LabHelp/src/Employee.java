
public class Employee {
    // Declare class attributes
    private String sFirstName;
    private String sLastName; 
    private String sDoB;
    private double dBonus1;
    private double dBonus2;

    
    // Declare constants
    private static final int BONUSES = 2;

    public Employee() {
    }

    public Employee(String sFirstName, String sLastName, String sDoB, double dBonus1, double dBonus2) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sDoB = sDoB;
        this.dBonus1 = dBonus1;
        this.dBonus2 = dBonus2;

    }

    public String getFirstName() {
        return sFirstName;
    }

    public void setFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getLastName() {
        return sLastName;
    }

    public void setLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getDoB() {
        return sDoB;
    }

    public void setDoB(String sDoB) {
        this.sDoB = sDoB;
    }

    public double getBonus1() {
        return dBonus1;
    }

    public void setBonus2(double dBonus2) {
        this.dBonus2 = dBonus2;
    }

    public double getBonus2() {
        return dBonus2;
    }

    public void setBonus1(double dBonus1) {
        this.dBonus1 = dBonus1;
    }
    public double compBonusAvg(){
        double dAvg = 0;
        dAvg = (dBonus1 + dBonus2)/BONUSES;
        return dAvg;
    }            
    
}
