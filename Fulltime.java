public class Fulltime extends person {
    private int anualSalary;
    private String unit;
    
    public Fulltime(){
        super();
        anualSalary = 0;
        unit = "";
    }
    public Fulltime(int anualSalary, String unit){
        super.print();
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    public void print(){
        System.out.println("Anual salary :"+anualSalary);
        System.out.println("Unit :"+unit);
    }
}
