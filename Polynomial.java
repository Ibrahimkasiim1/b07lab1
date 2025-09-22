public class Polynomial {
    private double[] coff;

    public Polynomial() {
        this.coff=new double[]{0};
        coff[0] =0;
    }
    public Polynomial(double[] coeffs) {
        coff = coeffs;
    }

    //ad two polynomials
    public Polynomial add(Polynomial other) {
        int maxLength =Math.max(coff.length, other.coff.length);
        double[] result = new double[maxLength];
        
        for (int i=0; i <maxLength; i++) {
            double a = 0;
            double b= 0;
            if (i< coff.length) {
                a = coff[i];
                //

            }
            
            if (i <other.coff.length) {

                b = other.coff[i];
            }
            
            result[i] =a+b;
        }
        
        return new Polynomial(result);
    }

    // eval the polynomial at x
    public double evaluate(double x) {
        double result=0;
        for (int i =0; i< coff.length; i++) { // loop through the coff
            result+= coff[i] * Math.pow(x, i);
        }
        return result;
    }

    //check if value is a root
    public boolean hasRoot(double x) {
        return Math.abs(evaluate(x))< 0.01;
    }
}
