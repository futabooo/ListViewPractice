package com.futabooo.listviewpractice.views.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.futabooo.listviewpractice.R;
import com.futabooo.listviewpractice.dummy.DummyContent;
import java.util.List;

public class ReuseAdapter extends ArrayAdapter<DummyContent.DummyItem> {

  public ReuseAdapter(Context context, List<DummyContent.DummyItem> list) {
    super(context, 0, list);
  }

  @Override public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
      convertView = View.inflate(getContext(), R.layout.item, null);
    }

    ImageView thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
    thumbnail.setImageResource(R.mipmap.ic_launcher);

    TextView title = (TextView) convertView.findViewById(R.id.title);
    title.setText(getItem(position).toString());

    return convertView;
  }
}
