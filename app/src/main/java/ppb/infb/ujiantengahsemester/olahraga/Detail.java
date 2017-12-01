package ppb.infb.ujiantengahsemester.olahraga;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class Detail extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView = (TextView) findViewById(R.id.op);

        ActionBar detail = getSupportActionBar();

        detail.setDisplayShowHomeEnabled(true);
        detail.setDisplayHomeAsUpEnabled(true);

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button proses = (Button) findViewById(R.id.proses);

        Button plus = (Button) findViewById(R.id.plus);
        Button min = (Button) findViewById(R.id.minus);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                editText.setText("" + counter);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                editText.setText("" + counter);
            }
        });


        Bundle bundle=getIntent().getExtras();
        final String s=bundle.getString("message");
        textView.setText(s);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You will do a sport " + s + "for " + editText.getText().toString() + " hours" , Toast.LENGTH_SHORT).show();
            }
        });


    }

}
