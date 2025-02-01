public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){ //for rows
            for(int j=0;j<=n-i;j++) //for columns
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
    
}
//output
*****
****
***
**
*

