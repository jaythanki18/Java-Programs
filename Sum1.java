public class Sum1 {
    private int a,b;

    public Sum1()
    {

    }

    public void SetA(int a)
    {
        this.a=a;
    }

    public void setB(int b)
    {
        this.b=b;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public void computesum()
    {
        int sum;
        sum=a+b;
        System.out.println("Sum of " + a + " and " + b + " : " + sum + ".");
    }
}

