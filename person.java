public class person {
    private String name;
    private int age;

    //getter dan setter
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getage(){
        return this.age;
    }
    public void setage(int age){
        this.age = age;
    }

    public person(){
        super();
        name = "";
        age = 0;
    }
    public person (String name,int age){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
}
