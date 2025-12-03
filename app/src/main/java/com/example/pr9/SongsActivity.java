package com.example.pr9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
public class SongsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.songs);
    }
    public void onClickStepsActivity(View view) {
        Intent intent = new Intent(this, KaraokeSongActivity.class);
        startActivity(intent);
    }
}