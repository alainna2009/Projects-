import java.util.Arrays;

public class IntArray {
    private int length;
    private int[] myArray;
//stores 1 into length and creates array so it has exactly 1 element
    public IntArray(int size){
        length = size;
        myArray = new int[size];

    }
//return the number stored in length 
    public int size(){
        return length;
    }
//stores a random number from 1 through 6. 
    public void fillRand(){
        for(int i =0; i < length; i++){
            myArray[i]=(int)(Math.random()* 6) + 1;
        }
        
    }
//return  whatever value is stored at index; when ran in runner. 
    public int get(int element){
        return myArray[element];
    }

    public void set(int element, int newValue){
        myArray[element]= newValue; 
    }

    // clear()should makee the array empty and reset the length
    public void clear(){
        myArray = new int[0];
        length = 0; 
    }
    //makes the array empty 
    public boolean isEmpty(){
        return length ==0;
    }
//should print something with intrgers 
    public String toString(){
        return Arrays.toString(myArray);
    }
//sort the numbers from smallest to largest 
    public void sort(){
        Arrays.sort(myArray);
    }
}
