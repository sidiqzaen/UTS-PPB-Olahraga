package ppb.infb.ujiantengahsemester.olahraga;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListOlahraga extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] olahraga={"Foot Ball","Basket Ball","Volley Ball","Badminton","Cricket","Tenis","Table Tenis","Marathon","Swimming"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_olahraga);

        listView=(ListView) findViewById(R.id.olahraga);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,olahraga);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

        ActionBar list = getSupportActionBar();

        list.setDisplayShowHomeEnabled(true);
        list.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String message= (String)((TextView)view).getText();
        //Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ListOlahraga.this, Detail.class);
        intent.putExtra("message", message);
        startActivity(intent);


    }
}