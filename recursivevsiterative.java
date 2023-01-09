public class recursivevsiterative {


  
    static double IterativeCall(double base, int exponent) {
        double retVal = 1.0;
        if(exponent < 0){
            return (1.0/IterativeCall(base, -exponent));
        }
        else{
            for(int i=0; i< exponent;i++){
                retVal*=base;
            }
        }
        return retVal;
    }

    static double RecursiveCall(double base, int exponent) {
        if(exponent <0){
            return (1.0/IterativeCall(base, -exponent));
        }
        else if(exponent==0){
            return 1.0;
        }
        else{
            return (base * RecursiveCall(base, exponent-1));
        }
    }

  public static void main(String[] args) {
    double base = 3.14159265359;
    int exponent = 1000;
    long iterativeStartTime;
    long iterativeEndTime;
    long recursiveStartTime;
    long recursiveEndTime;

    for(int i=0; i<exponent;i++){
        iterativeStartTime = System.nanoTime();
        IterativeCall(base, i);
        iterativeEndTime = System.nanoTime();
        recursiveStartTime = System.nanoTime();
        RecursiveCall(base, i);
        recursiveEndTime = System.nanoTime();
    
    }
  }
}