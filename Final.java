public class Final
{
    public static void main(String args[])
    {
        Primen pobj= new Primen();
        pobj.setNumber(143);
        pobj.compute();

        Divisibility dobj = new Divisibility();
        dobj.setNumerator(56);
        dobj.setDenominator(89);
        dobj.checkdivisibility();

        Sum1 sobj = new Sum1();
        sobj.SetA(20);
        sobj.setB(30);
        sobj.computesum();

        Fact fobj = new Fact();
        fobj.findFact(5);
    }
}
