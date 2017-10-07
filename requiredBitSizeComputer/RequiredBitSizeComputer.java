package requiredBitSizeComputer;


/**
 * Required Bit Size Computer - see task
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu
 * @version  2017/10/07
 */
public class RequiredBitSizeComputer {
    
    /**
     * compute required bit size to code positive number
     * 
     * @param number  the number for that the required bit size shall be computed
     * @return required bit size to compute number
     */
    public int computeBitSize( final long number ){
        assert 0<=number : "negative numbers are NOT supported"; 
        
        int resu = 1;
        
        long remaining  = number;
        while( 1 < remaining ){
            remaining = remaining / 2;                // Die Studenten k(o)ennen ">>=1" noch nicht (wirklich)
            resu++;
        }//while
        
        return resu;
    }//method()
    
}//class
