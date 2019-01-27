import java.lang.reflect.Field;

public abstract class AbstractFigures implements IFigures {

    private String Color;
    private int size;
    private StringBuilder sb;

    public abstract void draw();
    public abstract void fill(String color);

    public String getColor() {
        return Color;
    }
    public int getSize() {
            return size;
    }

    public String toXml(IFigures figure) {
        sb = new StringBuilder();
        Class clazz = figure.getClass();
        sb.append("<").append(clazz.getName()).append(">");
       // sb.append()

        return null;
    }

    public String toJson(IFigures figure) {
        sb = new StringBuilder();

        return null;
    }
}
