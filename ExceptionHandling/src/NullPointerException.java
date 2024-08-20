public class NullPointerException {


    public static void nullPointExc(String a){
        System.out.println("In nullPointerExc function ");

        try {
            System.out.println(a.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("Program Executed Successfully ! ");
        }
    }


    public static void main(String[] args) {
        String str = null;
        nullPointExc(str);
    }
    
}
