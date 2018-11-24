package com.example.sys.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 public Button b;
 public EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        et1=findViewById( R.id.e1);
        et2=findViewById( R.id.e2);
        et3=findViewById( R.id.e3 );
        b=findViewById( R.id.b1);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                String s3=et3.getText().toString();
                if (s1.length()==0)
                    et1.setError( "Please enter a Name" );
                if(s2.length()==0)
                    et2.setError( "Please enter a College name" );
                if (s3.length()==0)
                    et3.setError( "Please enter a Branch name" );
                Intent i=new Intent( MainActivity.this,Main2Activity.class );
                i.putExtra( "Name",et1.getText().toString() );
                i.putExtra( "College",et2.getText().toString() );
                i.putExtra( "Branch",et3.getText().toString() );
                startActivity( i );

            }
        } );
    }
}
