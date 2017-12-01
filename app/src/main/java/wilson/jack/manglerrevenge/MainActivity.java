package wilson.jack.manglerrevenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.mangle_nicely);
        mButton2 = (Button) findViewById(R.id.mangle_rudely);
        mEditText = (EditText) findViewById(R.id.name_edit_text);

        mButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText.getText().toString())) {
                    Toast.makeText(MainActivity.this, getString(R.string.name_error), Toast.LENGTH_SHORT).show();
                } else {
                    String pass = mEditText.getText().toString();
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText.getText().toString())) {
                    Toast.makeText(MainActivity.this, getString(R.string.name_error), Toast.LENGTH_SHORT).show();
                } else {
                    String pass = mEditText.getText().toString();
                }
            }
        });
    }
}
