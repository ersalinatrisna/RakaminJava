package FirstProgram;
import java.util.Scanner;
public class percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("enter password :");
        String validPassword = "passwordku";

        //jika benar maka "selamat datang bos"
        //jika salah (else) maka error message show up
        if(password.equals(validPassword)){
            System.out.println("Selamat datang bos!");
        } else {
            System.out.println("Password salah, mohon coba lagi.");
        }
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
