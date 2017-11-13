package and.mfh.jbc.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        String [] subjects = {"English","Bangla","Math", "Physics", "Chemistry","Biology"};

        ListView listView = findViewById(R.id.listViewImage);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.list_element,R.id.elementName, subjects);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                TextView textView = (TextView) view;
//                Toast.makeText(getApplicationContext(),textView.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
