package com.hochan.slideactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hochan.slideactivity.slideback.IntentUtils;
import com.hochan.slideactivity.slideback.SlidingActivity;


/**
 *
 * Created by chenjishi on 15/10/13.
 */
public class ImageActivity extends SlidingActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		setTitle("ImageActivity");
	}

	public void onButton(View v){
		Intent intent = new Intent(this, ViewPagerActivity.class);
		IntentUtils.getInstance().startActivity(this, intent);
	}
}
