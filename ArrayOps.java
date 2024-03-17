public class ArrayOps {
    public static void main(String[] args) {
        
    }
    public static int findMissingInt(int[] array) {
        // check the minimal number of the array
        int n = array.length;
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    
        // print the array before mix
        System.out.println("print the array before mix");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    //
        // sort the array from the lowest to the highest
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    
        // print the array after mix
        System.out.println("\nprint the array after mix");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    
        // check if there a missing number between min to n
        boolean qacheck = false;
        int numqacheck = min;
        while (!qacheck && numqacheck < n) {
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i + 1] != array[i] + 1) {
                    found = true;
                    numqacheck = array[i] + 1;
                    break;
                }
            }
            if (!found) {
                numqacheck++;
                qacheck = true;
            }
        }
    
        System.out.println("\nprint the missing num: " + numqacheck);
    
        return numqacheck;
    }
    
    

    

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int maxVal = array[0];
        int secMaxVal = Integer.MIN_VALUE;
        for(int i=1; i < array.length; i++){
            if(array[i] > maxVal){
                secMaxVal = maxVal;
                maxVal = array[i]; 
                }
            }
            System.out.println("\nprint the second maximum value: " + secMaxVal);
                return secMaxVal;
        
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int length1 = array1.length;
        int length2 = array2.length;
        

        if (length1 >= length2 ){
    
        
        
        for (int i=0; i<length2; i++){

            for(int j=0; j<= length1;j++){
            if (array2[i] == array1[j])  {
               break;
            }
            if (j==length1) {
                return false;
            }
    
            }
        
            
            }
            return true;
        }

    else
    {
        for (int i=0; i<length1; i++){

            for(int j=0; j<= length2;j++){
            if (array1[i] == array2[j])  {
               break;
            }
            if (j==length1) {
                return false;
            }
    
            }
        
            
            }
            return true;
        }  
    }
    

    

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean x = false;
        for(int i=0;i<array.length; i++){
            if (array[i]< array[i+1]) {
    x = true;
            }
    else x= false;
        }
    


            
        if( x== true){
        return true;
        }
        else {
            return false;
        }
    }

}
