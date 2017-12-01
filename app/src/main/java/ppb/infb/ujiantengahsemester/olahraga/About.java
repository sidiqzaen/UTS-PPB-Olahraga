package ppb.infb.ujiantengahsemester.olahraga;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar about = getSupportActionBar();

        about.setDisplayShowHomeEnabled(true);
        about.setDisplayHomeAsUpEnabled(true);

        WebView browser = (WebView)findViewById(R.id.webkit);
        browser.loadData(""+
                "<html>" +
                "<body>" +
                "<p>" +
                "This assignment is made to qualify for graduate course of PPB<br/>" +
                "This app is design by:<br/>" +
                "Sidiq Zaenal Kafi (1406115)<br/>" +
                "Dendi Purnama (1406030)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
