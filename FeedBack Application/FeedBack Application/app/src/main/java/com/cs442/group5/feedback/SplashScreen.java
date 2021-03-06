package com.cs442.group5.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class SplashScreen extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Fabric.with(this, new Crashlytics());
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
	}
}
