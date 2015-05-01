package com.futabooo.listviewpractice.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.futabooo.listviewpractice.R;
import com.futabooo.listviewpractice.dummy.DummyContent;
import com.futabooo.listviewpractice.views.adapters.CustomViewAdapter;
import com.futabooo.listviewpractice.views.adapters.NormalAdapter;
import com.futabooo.listviewpractice.views.adapters.ReuseAdapter;
import com.futabooo.listviewpractice.views.adapters.ViewHolderAdapter;

public class ItemFragment extends Fragment {

  private static final String ARGS_KEY = "param";

  private ArrayAdapter<DummyContent.DummyItem> mAdapter;
  private ListView mListView;

  public static ItemFragment newInstance(int i) {
    ItemFragment fragment = new ItemFragment();
    Bundle args = new Bundle();
    args.putInt(ARGS_KEY, i);
    fragment.setArguments(args);
    return fragment;
  }

  /**
   * Mandatory empty constructor for the fragment manager to instantiate the
   * fragment (e.g. upon screen orientation changes).
   */
  public ItemFragment() {
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    switch (getArguments().getInt(ARGS_KEY)) {
      case R.id.activity_main_button_1:
        mAdapter = new NormalAdapter(getActivity(), DummyContent.ITEMS);
        break;
      case R.id.activity_main_button_2:
        mAdapter = new ReuseAdapter(getActivity(), DummyContent.ITEMS);
        break;
      case R.id.activity_main_button_3:
        mAdapter = new ViewHolderAdapter(getActivity(), DummyContent.ITEMS);
        break;
      case R.id.activity_main_button_4:
        mAdapter = new CustomViewAdapter(getActivity(), DummyContent.ITEMS);
        break;
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_item_list, container, false);
    mListView = (ListView) view.findViewById(android.R.id.list);
    mListView.setAdapter(mAdapter);
    return view;
  }
}
