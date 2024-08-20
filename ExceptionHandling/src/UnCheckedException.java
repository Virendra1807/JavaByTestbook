public class UnCheckedException {

    // Null Pointer Exception exception
    public static void nullPointExc(String a){
        System.out.println("In nullPointerExc function ");

        try {
            System.out.println("In Try Block we Write Risky Code");
            System.out.println(a.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("Program Executed Successfully ! ");
        }
    }


    // Array Index Out of Bound Exception exception
    public static void ArrIndOutOfBound(int ind){
        int arr[] = {10,20,30,40};

        try {
            System.out.println("Array Element at Index "+ ind + " : "+ arr[ind]);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("In Catch Block");
        }
    }


    public static void main(String[] args) {
        // String str = null;
        // nullPointExc(str);

        ArrIndOutOfBound(8);
    }
    
}
