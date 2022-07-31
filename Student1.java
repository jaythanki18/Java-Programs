public class Student1 {
    private int stdId;
    private String  stdName;
    private long cellNo;
    private String emailId;
    public Student1(int StdId,String stdName,long cellNo,String emailId)
    {
        this(StdId,stdName,cellNo);
        this.emailId = emailId;
        System.out.printf("%s\n",emailId);
    }
    public Student1(int stdId,String stdName,long cellNo)
    {
        this(stdId,stdName);
        this.cellNo = cellNo;
        System.out.printf("%d\n",cellNo);
    }
    public Student1(int stdId, String stdName)
    {
        this(stdId);
        this.stdName = stdName;
        System.out.printf("%s\n",stdName);
    }
    public Student1(int stdId)
    {
        this.stdId = stdId;
        System.out.printf("%d\n",stdId);
    }
    public Student1()
    {
        System.out.printf("I am no argument constructor\n");
    }
    static{   }
    public String getEmailId(){ return emailId;}
    public void setEmailId(){ this.emailId = emailId;}
    public long getCellNo(){ return cellNo;}
    public void setCellNo(){ this.cellNo = cellNo;}
    public String getStdName(){ return stdName;}
    public void setStdName(String stdName){ this.stdName = stdName;}
    public int getStdId(){ return stdId ;}
    public void setStdId(int stdId) { this.stdId = stdId;}

}