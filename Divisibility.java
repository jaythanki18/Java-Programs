public class Divisibility {
        private int numerator;
        private int denominator;

        public Divisibility()
        {

        }

        public void setNumerator(int numerator)
        {
            this.numerator=numerator;
        }

        public void setDenominator(int denominator)
        {
            this.denominator=denominator;
        }

        public int getNumerator()
        {
            return numerator;
        }

        public int getDenominator()
        {
            return denominator;
        }

        public void checkdivisibility()
        {
            if(numerator%denominator==0)
            {
                System.out.println(numerator + " is Divisible by " + denominator + ".");
            }
            else
            {
                System.out.println(numerator + " is not Divisible by " + denominator + ".");
            }
        }
    }

