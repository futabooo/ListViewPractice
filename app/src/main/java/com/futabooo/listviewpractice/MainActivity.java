package com.futabooo.listviewpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button button1 = (Button) findViewById(R.id.activity_main_button_1);
    button1.setOnClickListener(this);

    Button button2 = (Button) findViewById(R.id.activity_main_button_2);
    button2.setOnClickListener(this);

    Button button3 = (Button) findViewById(R.id.activity_main_button_3);
    button3.setOnClickListener(this);

    Button button4 = (Button) findViewById(R.id.activity_main_button_4);
    button4.setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.activity_main_button_1:
      case R.id.activity_main_button_2:
      case R.id.activity_main_button_3:
      case R.id.activity_main_button_4:
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("button", v.getId());
        startActivity(intent);
        break;
    }
  }
}
