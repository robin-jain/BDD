import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        String a1 = "one";
        String a2 = "one";
        Object [] var1=new Object[]{a1,a2};

        System.out.println(Arrays.toString(new String[]{Arrays.toString(var1)}));
    }
}
