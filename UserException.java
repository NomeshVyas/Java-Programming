class UserDefiendException extends Exception{
    public UserDefiendException(String str){
        System.out.println(str);
    }
}

public class UserException {
    public static void main(String args[]){
        try {
            throw new UserDefiendException("this is UserDefined Exception");
        } catch (UserDefiendException e) {
            System.out.println("caught the exception");
        }
    }
}