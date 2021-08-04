import com.sun.source.tree.ModifiersTree;

public class Modifiers { // private default protected public
    private String name;
    private Modifiers(){}


    public static void foo(){
       Modifiers modifiers = new Modifiers();
    }
     public void show(){
        foo();
     }
}
