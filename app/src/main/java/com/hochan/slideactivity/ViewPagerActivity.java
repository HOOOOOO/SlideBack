package com.hochan.slideactivity;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.hochan.slideactivity.slideback.SlidingActivity;

import java.util.ArrayList;

public class ViewPagerActivity extends SlidingActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_pager);

		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

		final ArrayList<View> views = new ArrayList<>();
		final View view1 = new View(getApplicationContext());
		view1.setBackgroundResource(R.color.colorPrimary);
		views.add(view1);
		View view2 = new View(getApplicationContext());
		view2.setBackgroundResource(android.R.color.holo_blue_bright);
		views.add(view2);
		View view3 = new View(getApplicationContext());
		view3.setBackgroundResource(R.color.colorAccent);
		views.add(view3);

		viewPager.setAdapter(new PagerAdapter() {
			@Override
			public int getCount() {
				return views.size();
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				container.addView(views.get(position), new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
						ViewGroup.LayoutParams.MATCH_PARENT));
				return views.get(position);
			}

			@Override
			public void destroyItem(ViewGroup container, int position, Object object) {
				container.removeView(views.get(position));
			}

			@Override
			public boolean isViewFromObject(View view, Object object) {
				return view == object;
			}
		});
	}
}
