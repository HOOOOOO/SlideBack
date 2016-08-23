package com.hochan.slideactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hochan.slideactivity.slideback.IntentUtils;
import com.hochan.slideactivity.slideback.SlidingActivity;

/**
 * Created by chenjishi on 14-3-17.
 */
public class DetailActivity extends SlidingActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		setTitle("DetailActivity");
	}

	public void onButtonClicked(View v) {
		Intent intent = new Intent(this, ImageActivity.class);
		IntentUtils.getInstance().startActivity(this, intent);
	}
}
