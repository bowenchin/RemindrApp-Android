package com.bowenchin.android.remindr;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by bowenchin on 25/12/2016.
 */
public class IntroActivity extends AppIntro2{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        // Note here that we DO NOT use setContentView();

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Welcome to Remindr", "A simple and minimalistic to-do list, note taking, and reminder app.", R.drawable.ic_launcher_web, getResources().getColor(R.color.primary)));
        addSlide(AppIntroFragment.newInstance("All your notes in one place", "Notes are in one place to avoid confusion and complexity. Long press or swipe away task cards to delete them.", R.drawable.empty_view_illustration, getResources().getColor(R.color.primary_dark)));
        addSlide(AppIntroFragment.newInstance("Light and Dark", "Personalize your experience by choosing between light and dark theme.", R.drawable.start, Color.rgb(0,175,218)));
        addSlide(AppIntroFragment.newInstance("Stay organized", "Stay on top of your tasks with timely reminders.", R.drawable.organized, Color.rgb(108, 207, 222)));
        addSlide(AppIntroFragment.newInstance("Get started", "We hope you enjoy this app!", R.drawable.finish, Color.rgb(54, 64, 162)));


        // Hide Skip/Done button.
        showSkipButton(false);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        //setVibrate(true);
        //setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent i = new Intent(this,TaskListActivity.class);
        startActivity(i);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}