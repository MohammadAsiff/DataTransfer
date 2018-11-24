package com.example.sys.datatransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        t1=findViewById( R.id.t1);
        String s1=getIntent().getStringExtra("Name");

        String s2=getIntent().getStringExtra( "College" );

        String s3=getIntent().getStringExtra( "Branch" );
        t1.setText( s1+"\n"+s2+"\n"+s3 );

    }
}
