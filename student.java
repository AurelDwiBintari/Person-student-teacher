public class student {
    private int studentNumber;
    private int score;
    private String major;

    public int getstudentNumber(){
        return this.studentNumber;
    }
    public void setstudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public int getscore(){
        return this.score;
    }
    public void setscore(int score){
        this.score = score;
    }
    public String getmajor(){
        return this.major;
    }
    public void setmajor(String major){
        this.major = major;
    }
        public student(){
            super();
            studentNumber = 0;
            score = 0;
            major = "";
        }
        public student(int studentNumber,int score,String major){
            System.out.println("StudentNumber :"+studentNumber);
            System.out.println("Score :"+score);
            System.out.println("major :"+major);

        }
    
}
