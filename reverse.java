class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  //looping for the array length 
            System.out.println(arr[i]);  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        for (int i = arr.length-1; i >= 0; i--) {  // loop  in the  reverse order
            System.out.println(arr[i]);  
        }  
    }  
}  
