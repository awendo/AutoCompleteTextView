package com.awen.seekcy.autocompletetextview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import com.awen.seekcy.autocompletetextview.R;
import java.lang.reflect.Array;

public class MainActivity extends Activity {
    private String[] str=new String[]{"Android","Java","Jdk"};
    private TextView tv;
    private Button bt;
    private AutoCompleteTextView act;
    private ArrayAdapter<String> ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv);
        bt=(Button)findViewById(R.id.bt);
        act=(AutoCompleteTextView)findViewById(R.id.at);
        ad=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,str);
        act.setAdapter(ad);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act.setText("");
            }
        });
    }
}
