package com.futabooo.listviewpractice.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.futabooo.listviewpractice.R;
import com.futabooo.listviewpractice.dummy.DummyContent;

public class ItemLayout extends LinearLayout {

  ImageView mThumbnail;
  TextView mTitle;

  public ItemLayout(Context context) {
    super(context);
  }

  public ItemLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
    mThumbnail = (ImageView) findViewById(R.id.thumbnail);
    mTitle = (TextView) findViewById(R.id.title);
  }

  public void bindView(DummyContent.DummyItem item) {
    mThumbnail.setImageResource(R.mipmap.ic_launcher);
    mTitle.setText(item.toString());
  }
}
