package ppb.infb.ujiantengahsemester.olahraga;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editnama = (EditText)findViewById(R.id.name);
        final EditText editemail = (EditText)findViewById(R.id.email);
        EditText editpass = (EditText)findViewById(R.id.pass);
        EditText editrepass = (EditText)findViewById(R.id.repass);
        Button btnregist = (Button) findViewById(R.id.btnregister);

        ActionBar regist = getSupportActionBar();

        regist.setDisplayShowHomeEnabled(true);
        regist.setDisplayHomeAsUpEnabled(true);


        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You have signed up with name " +editnama.getText().toString() + " and email " +editemail.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
