package sg.edu.rp.dmsd.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView lvList;
    ArrayList<DoList> alDoList;
    CustomAdapter caList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewDo);

        alDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        DoList list1 = new DoList("MSA",date1);
        DoList list2 = new DoList("Go for haircut",date2);
        alDoList.add(list1);
        alDoList.add(list2);



        caList = new CustomAdapter(this,R.layout.do_list,alDoList);

        lvList.setAdapter(caList);
    }
}
