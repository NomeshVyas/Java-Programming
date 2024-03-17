//// try catch finally
public class ExceptionHandling {
    public static void main(String args[]){
        int arr[] = {10, 50, 20, 40, 30};
        
        System.out.println(arr[0]);
        try {
            System.out.println(arr[-1]);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(arr[2]);
        }
    }
};
