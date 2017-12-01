package wilson.jack.manglerrevenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mangle_activity);

        Intent myIntent = getIntent();
        String pass = myIntent.getStringExtra("firstName");
        String isNice = myIntent.getStringExtra("isNice");


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            if ("yes".equals(isNice)) {
                fragment = new MangleNiceFragment();
            }
            else {
                fragment = new MangleRudeFragment();
            }
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
