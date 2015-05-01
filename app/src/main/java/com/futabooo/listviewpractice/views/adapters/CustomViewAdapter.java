package com.futabooo.listviewpractice.views.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.futabooo.listviewpractice.R;
import com.futabooo.listviewpractice.dummy.DummyContent;
import com.futabooo.listviewpractice.views.widgets.ItemLayout;
import java.util.List;

public class CustomViewAdapter extends ArrayAdapter<DummyContent.DummyItem> {

  public CustomViewAdapter(Context context, List<DummyContent.DummyItem> list) {
    super(context, 0, list);
  }

  @Override public View getView(int position, View convertView, ViewGroup parent) {
    ItemLayout view;
    if (convertView == null) {
      view = (ItemLayout) View.inflate(getContext(), R.layout.item_custom, null);
    } else {
      view = (ItemLayout) convertView;
    }

    view.bindView(getItem(position));

    return convertView;
  }
}
