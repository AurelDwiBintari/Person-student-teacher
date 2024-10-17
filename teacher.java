import java.time.Year;
public class teacher extends person {
    private String Subject;
    private int yearin;

    //access modifier tipedata nama method
    public int lamamengajar(){
        int yearnow = year.now().getValue;
        int hasil = yearnow - yearin;
        return hasil;
    }
    public teacher(){
        super();
        this.Subject = "";
        this.yearin = 0;
    }
    public teacher(String name,int age,String subject,int yearin) {
        super(name, age);
        this.Subject = subject;
        this.yearin = yearin;
    }
    public String getSubject(){
        return this.Subject;
    }
    public void setSubject(String Subject){
        this.Subject = Subject;
    }
    public void print(){
        super.print();
        System.out.println("Subject ;"+Subject);
        System.out.println("lama mengajar ;"+lamamengajar());
    }

    
}
