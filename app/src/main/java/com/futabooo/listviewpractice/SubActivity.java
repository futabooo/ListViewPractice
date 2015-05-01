package com.futabooo.listviewpractice;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.futabooo.listviewpractice.fragments.ItemFragment;

public class SubActivity extends ActionBarActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub);
    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction()
          .add(R.id.content, ItemFragment.newInstance(
              getIntent().getIntExtra("button", R.id.activity_main_button_1)))
          .commit();
    }
  }
}
