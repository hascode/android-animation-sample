package com.hascode.tutorial.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class AnimationActivity extends Activity {
	/** Called when the activity is first created. */
	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		AnimatedButton button = new AnimatedButton(this);
		button.setText("What a button");
		LinearLayout layout = (LinearLayout) findViewById(R.id.root);
		layout.addView(button);
	}
}