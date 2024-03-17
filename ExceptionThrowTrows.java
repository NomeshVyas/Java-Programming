// public class ExceptionThrowTrows {
//     public static void validate(int age){
//         if(age<18)
//             throw new ArithmeticException("Not Eligible...");
//         else
//             System.out.println("Eligible");
//     }
//     public static void main(String args[]){
//         validate(13);
//         System.out.println("Rest of code...");
//     }
// }

public  class ExceptionThrowTrows {
    public static void main(String[] args) throws Exception {
        myException();
    }
    static void myException() throws Exception{
        throw new Exception("Something went wrong...");
    }
}