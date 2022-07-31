
public class Primen
{
    private int number;

    public void setNumber(int number)
    {
        this.number=number;
    }

    public int getNumber()
    {
        return number;
    }

    public Primen()
    {

    }

    public void compute()
    {
        int i,flag=0;

        if(number==0 || number==1)
        {
            flag=1;
        }

        for(i=2;i<number/2;i++)
        {
            if(number%2==0)
            {
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println(number + " is a Prime Number.");
        }
        else
        {
            System.out.println(number + " is not Prime Number");
        }
    }
}

