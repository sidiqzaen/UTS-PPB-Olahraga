package ppb.infb.ujiantengahsemester.olahraga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    String user;
    String pass;
    String username="admin";
    String password="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edituser = (EditText)findViewById(R.id.editusername);
        final EditText editpass = (EditText)findViewById(R.id.editpass);
        Button btnlogin = (Button)findViewById(R.id.btnlogin);
        Button btnregist = (Button)findViewById(R.id.btnregist);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = edituser.getText().toString();
                pass = editpass.getText().toString();

                if ((user.equals(username)) && (pass.equals(password))){
                    Intent home = new Intent(getApplicationContext(), Home.class);
                    startActivity(home);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Try again, incorect username or password", Toast.LENGTH_LONG).show();

                }
            }
        });

        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regist = new Intent(getApplicationContext(), Register.class);
                startActivity(regist);
            }
        });

    }
}
