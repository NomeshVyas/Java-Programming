//// 1. util package
// import java.util.Scanner;

// public class InBuiltPackage {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int maxi = Math.max(a, b);
//         System.out.println("Max " + maxi);
//         sc.close();
//     }
// };


//// 2. awt package
// import java.awt.*;

// public class InBuiltPackage{
//     InBuiltPackage(){
//         Frame fr = new Frame();
//         Label l = new Label("Welcome this is Nomesh Graphics.");
//         fr.add(l);
//         fr.setSize(300, 250);
//         fr.setVisible(true);
//     }
//     public static void main(String args[]){
//         InBuiltPackage tw = new InBuiltPackage();
//     }
// };


//// 3. io package
import java.io.Console;

public class InBuiltPackage{
    public static void main(String args[]){
        Console cons = System.console();
        System.out.println("Enter colour: ");
        String color = cons.readLine();
        System.out.println("your color: "+ color);
    }
};