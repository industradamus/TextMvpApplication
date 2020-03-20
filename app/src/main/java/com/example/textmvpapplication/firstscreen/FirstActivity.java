package com.example.textmvpapplication.firstscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.textmvpapplication.R;
import com.example.textmvpapplication.secondscreen.SecondActivity;

public class FirstActivity extends AppCompatActivity implements FirstActivityContract.View {

    private FirstActivityPresenter presenter;
    private ProgressBar progressBar;
    private TextView textView;
    private View nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        textView = findViewById(R.id.text_view);
        nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClickNext();
            }
        });

        presenter = new FirstActivityPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attach(this);

        presenter.loadData();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.deAttach();
    }

    @Override
    public void showLoader() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoader() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void handleError() {
        Log.d("XXX", "Error");
    }

    @Override
    public void updateUi(String message) {
        textView.setText(message);
    }

    @Override
    public void openSecondActivity() {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
