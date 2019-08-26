package com.rupali.androdev.assignment1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
     static  int rotate_count=0;
    static final String Rotate_Score="rotate score";
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            rotate_count = savedInstanceState.getInt(Rotate_Score);
        }
        else {
            rotate_count = 0;
        }
        Context context = getApplicationContext();
        CharSequence text = "Screen rotated "+rotate_count+" times";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();

        ImageView icon_1 = findViewById(R.id.img1);
        icon_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Opening Activity";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
                Intent intent=new Intent(v.getContext(),Main2Activity.class);
                startActivity(intent);
            }
        });
        ImageView icon_2 = findViewById(R.id.img2);
        icon_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Opening Activity";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();

                Intent intent=new Intent(v.getContext(),Main3Activity.class);
                startActivity(intent);
            }
        });
        ImageView icon_3 = findViewById(R.id.img3);
        icon_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Opening Activity";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
                Intent intent=new Intent(v.getContext(),Main4Activity.class);
                startActivity(intent);
            }
        });
        ImageView icon_4 = findViewById(R.id.img4);
        icon_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Opening Activity";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
                Intent intent=new Intent(v.getContext(),Main5Activity.class);
                startActivity(intent);
            }
        });

    }
  @Override
   public void onConfigurationChanged(Configuration newConfig)
   {
       super.onConfigurationChanged(newConfig);
       int orientation = newConfig.orientation;
       if (orientation == Configuration.ORIENTATION_PORTRAIT)
       {   rotate_count++;
           Log.d("tag", "Portrait");}
       else if (orientation == Configuration.ORIENTATION_LANDSCAPE)
       { rotate_count++;
           Log.d("tag", "Landscape");}
       else
           Log.w("tag", "other: " + orientation);
   }
   @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(Rotate_Score, rotate_count);
        Log.d("Saved", "Inside onSaveInstance: "+ rotate_count);
        super.onSaveInstanceState(savedInstanceState);
    }
  }
