package com.seckawijoki.graduation_project.functions.information;
/**
 * Created by 瑶琴频曲羽衣魂 on 2017/10/31.
 */

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.seckawijoki.graduation_project.R;

import java.util.List;

public class InformationViewPagerAdapter extends PagerAdapter {
  private static final String TAG = "InformationVPAdapter";
  private View []views;
  private LayoutInflater mInflater;
  InformationViewPagerAdapter(LayoutInflater inflater, List<View> list) {
    mInflater = inflater;
    views = new View[5];
  }

  @Override
  public Object instantiateItem(ViewGroup container, int position) {
    Log.d(TAG, "instantiateItem: ");
    View view = views[position];
    if (view == null){
      view = mInflater.inflate(R.layout.list_item_vp_information, container, false);
    }
    container.addView(view);
    ((TextView) view.findViewById(R.id.tv_vp_information)).setText("Information ViewPager Item " + position);
    return view;
  }



  @Override
  public void destroyItem(ViewGroup container, int position, Object object) {
    if (views[position] != null){
      container.removeView(views[position]);
    }
  }

  @Override
  public int getCount() {
    return views.length;
  }

  @Override
  public boolean isViewFromObject(View view, Object object) {
    return view == object;
  }

}