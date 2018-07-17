package sg.edu.rp.dmsd.todolist;

import java.util.Calendar;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class DoList {
    private String list;
    private Calendar date;

    public DoList(String list, Calendar date) {
        this.list = list;
        this.date = date;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);
        return str;
    }
    @Override
    public String toString() {
        return "DoList{" +
                "list='" + list + '\'' +
                ", date='" + getDateString() + '\'' +
                '}';
    }
}

