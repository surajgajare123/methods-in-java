public class Main{
    static int logic(int x , int y){
        int z;
        if(x>y){
            System.out.print("x * y : ");
            z = x*y;
        }
        else{
            System.out.print("y + x  : ");
            z = x+y;
        }
        return z;
        
    }
    public static void main(String[] args){
        int a = 23;
        int b = 43;
        int c ;
        c = logic(a, b);
        System.out.println(c);
    }
}
