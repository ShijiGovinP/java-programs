public class pyramidpattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int s=0;s<=n-i;s++){ //for empty spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i*2+1;j++)
            {
                System.out.print("*  ");

            }
            System.out.print("\n");
        }
    }
    
}
