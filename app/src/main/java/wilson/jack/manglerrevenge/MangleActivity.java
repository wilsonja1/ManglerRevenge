package wilson.jack.manglerrevenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MangleActivity extends AppCompatActivity {
    private Button resetButton;
    private Button remangleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mangle_activity);

        Intent myIntent = getIntent();
        String pass = myIntent.getStringExtra("firstName");
        String isNice = myIntent.getStringExtra("isNice");


        Bundle bundle = new Bundle();
        bundle.putString("firstName", pass);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            if("yes".equals(isNice)) {
                fragment = new MangleNiceFragment();
            } else {
                fragment = new MangleRudeFragment();
            }
            fragment.setArguments(bundle);
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        resetButton = (Button) findViewById(R.id.reset);
        remangleButton = (Button) findViewById(R.id.remangle);

        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        remangleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


        //FragmentManager fm = getSupportFragmentManager();
        //Fragment fragmentNice = fm.findFragmentById(R.id.fragment_container_nice);
//        Fragment fragmentRude = fm.findFragmentById(R.id.fragment_container_rude);
//        if (fragmentNice == null) {
//            fragmentNice = new MangleNiceFragment();
//            fm.beginTransaction().add(R.id.fragment_container_nice, fragmentNice).commit();
//        }
//
//        Fragment fragmentRude = fm.findFragmentById(R.id.fragment_container_rude);
//        if (fragmentRude == null) {
//            fragmentRude = new MangleRudeFragment();
//            fm.beginTransaction().add(R.id.fragment_container_rude, fragmentRude).commit();
//        }
    }
}
