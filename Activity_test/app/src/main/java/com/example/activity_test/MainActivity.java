package com.example.activity_test;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    String msg = "yanliu: ";
    private Button bt1;
    @Override
    /** 当活动第一次被创建时调用 */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        ActivityControler.addActivity(this);

        if(savedInstanceState != null){

        }

        bt1 = findViewById(R.id.button001);
        bt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("https://www.baidu.com"));
                //startActivity(intent);

                //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               //startActivity(intent);
                finish();
                Intent intent = new Intent();
                intent.setAction("com.example.activity_test.ACTION_START001");
                Bundle bundle = new Bundle();
                bundle.putDouble("PI", 3.1415926);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    /** 当活动即将可见时调用 */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** 当活动可见时调用 */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /** 当其他活动获得焦点时调用 */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /** 当活动不再可见时调用 */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** 当活动将被销毁时调用 */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
