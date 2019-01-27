import java.util.*;

public class Group {
    private static StringBuilder sb;
    private List<IFigures> list = new ArrayList();
    private List<Group> childGroups = new ArrayList();

    public void addGroups(Group... groups) {
        for (Group g : groups) {
            childGroups.add(g);
        }
    }

    public void addFigures(IFigures... figures) {
        for (IFigures f : figures) {
            list.add(f);
        }
    }

    public void remove(IFigures figure) {
        list.remove(figure);
    }

    public void toXml() {
        for (IFigures figure : list) {
            sb.append(figure.toXml(figure));
        }
        if (false == childGroups.isEmpty()) {
            for (Group group : childGroups) {
                group.toXml();
            }
        }
    }

    public void toJson() {
        for (IFigures figure : list) {
            sb.append(figure.toJson(figure));
        }
        if (false == childGroups.isEmpty()) {
            for (Group group : childGroups) {
                group.toJson();
            }
        }
    }

    public static String getSb() {
        return sb.toString();
    }
}
