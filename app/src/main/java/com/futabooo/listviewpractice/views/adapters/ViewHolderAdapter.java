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

public class ViewHolderAdapter extends ArrayAdapter<DummyContent.DummyItem> {

  public ViewHolderAdapter(Context context, List<DummyContent.DummyItem> list) {
    super(context, 0, list);
  }

  @Override public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;

    if (convertView == null) {
      convertView = View.inflate(getContext(), R.layout.item, null);
      holder = new ViewHolder(convertView);
      convertView.setTag(holder);
    } else {
      holder = (ViewHolder) convertView.getTag();
    }

    holder.thumbnail.setImageResource(R.mipmap.ic_launcher);
    holder.title.setText(getItem(position).toString());

    return convertView;
  }

  private static class ViewHolder {
    private ImageView thumbnail;
    private TextView title;

    public ViewHolder(View view) {
      this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
      this.title = (TextView) view.findViewById(R.id.title);
    }
  }
}
