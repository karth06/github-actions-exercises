public class Hello{  
    public static void main(String[] args) {
        if(true){
        System.out.println("This should trigger lint errors");
        }else{
        System.out.println("This too");
        }
        int a = 0;
        String sample = "";
        System.out.println("This is a super-long message that will definitely exceed the maximum line length enforced by the style guide!");
    }
    public static String greet() {
        return "Hello Test!";
    }
}