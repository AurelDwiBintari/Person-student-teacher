public class parttime {
    private int hoursworked;
    private int setSalary;

    public parttime(){
        super();
        hoursworked = 0;
        setSalary = 0;
    }
    public parttime(int hoursworked, int setSalary){
        this.hoursworked = hoursworked;
        this.setSalary = setSalary;
    }

    public void print(){
        System.out.println("hoursworked :"+hoursworked);
        System.out.println("setSalary :"+setSalary);
    }
}
