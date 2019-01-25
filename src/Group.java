import java.util.*;

public class Group  {
    private List<IFigures> list = new ArrayList();
    private List<Group> childGroups = new ArrayList();

    public void add(Group group) {
        childGroups.add(group);
    }

    public void addFigures(IFigures ... figures) {
        for (IFigures f : figures) {
            list.add(f);
        }

    }
    public void remove(IFigures figure) {
        list.remove(figure);
    }

    public IFigures find(int size, String color) {
        IFigures figure = null;
        for (IFigures iFigure : list) {

            if (size == iFigure.getSize() && color == iFigure.getColor()) {
                figure == iFigure;
            }
        }
        return figure;
    }
}
