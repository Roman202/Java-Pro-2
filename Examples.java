package examples;


public class Examples {

    public static void main(String[] args) {
        int arr[] = {23, 6, 7};
        
        try {
        
        System.out.println(arr[3]);
        int x = 100 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Error" + e);
        } catch(Exception e) {
            System.out.println("Error" + e);
        } finally {
            System.out.println("Finalli is working");
        }
        
    }
    
}
