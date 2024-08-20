
public class FuncAndMeth {
    
    public static void methodName(){
        System.out.println("Hello");
    }
    public static int FunctionOutOfClass(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        
        methodName();
        System.out.println(FunctionOutOfClass(10, 20));
    }
}
