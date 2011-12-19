/**
 * 
 */
package com.hascode.tutorial.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class AnimatedButton extends Button {

	public AnimatedButton(Context context) {
		super(context);
		final Animation buttonAnimation = AnimationUtils.loadAnimation(
				this.getContext(), R.anim.animation);
		this.setOnTouchListener(new OnTouchListener() {

			@Override public boolean onTouch(View v, MotionEvent event) {
				AnimatedButton.this.startAnimation(buttonAnimation);
				return false;
			}
		});
	}
}
