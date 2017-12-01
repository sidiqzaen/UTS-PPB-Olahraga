package ppb.infb.ujiantengahsemester.olahraga;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnlist = (Button)findViewById(R.id.btnlist);
        Button btnabout = (Button)findViewById(R.id.btnabout);
        Button btnexit = (Button)findViewById(R.id.btnexit);

        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listolahraga = new Intent(getApplicationContext(), ListOlahraga.class);
                startActivity(listolahraga);
            }
        });

        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(getApplicationContext(), About.class);
                startActivity(about);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
        }
        });
    }
}
