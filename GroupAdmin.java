package observer;

import java.util.ArrayList;

public class GroupAdmin implements Sender{
    UndoableStringBuilder usb= new UndoableStringBuilder();
    ArrayList<Member> members = new ArrayList<Member>();

    public void register(Member obj)
    {
        members.add(obj);
        obj.update(usb);
    }


    public void unregister(Member obj)
    {
        members.remove(obj);
    }


    public void insert(int offset, String obj)
    {
        usb.insert()
    }


    public void append(String obj)
    {

    }


    public void delete(int start, int end)
    {

    }


    public void undo()
    qqqqqq{

    }
}
