import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Circle circle = new Circle("BLACK", 5);
        StringBuilder sb = new StringBuilder();
        Class clazz =  circle.getClass();
        Method[] m = clazz.getDeclaredMethods();
        String  tab = "\t";
        String nuw = "\n";

//        tab += tab;
        sb.append("<").append(clazz.getName()).append(">").append(nuw + tab);

        for (Field f : clazz.getDeclaredFields()) {

            String fieldType = f.getAnnotatedType().getType().getTypeName().replaceFirst("java.lang.","");
            
            sb.append("<").append(fieldType).append(" " + f.getName()).append(">").append("how to put here a value?");
               f = circle.getClass().getDeclaredField(f.getName());


               f.setAccessible(true);
               String nm = (String) f.get(circle); // exception ...
               // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String


               sb.append(nm).append("</").append(fieldType).
               append(">").append(nuw + tab);


            //  System.out.println(f.getName());
            //  System.out.println(f.getAnnotatedType().getType().getTypeName().replaceFirst("java.lang.",""));
        }









        for (Method met : m) {
            sb.append("<").append(met.getName()).append(">").append(nuw + tab);
            sb.append("</").append(met.getName()).append(">").append(nuw + tab);
        }
//        sb.append("</").append()

        System.out.println(sb.toString());

    }
}
