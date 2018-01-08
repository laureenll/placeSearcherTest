package org.miage.placesearcher;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.helloWordMsg) TextView helloWordMsg;
    @BindView(R.id.ratingBarTest) RatingBar ratingBarTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @Override
    public void onResume() {
        // onResume appelé à chaque chargement de la page
        super.onResume();
        RatingBar ratingBarTest = (RatingBar) findViewById(R.id.ratingBarTest);
        ratingBarTest.setRating(ratingBarTest.getRating()+1);
    }

    @OnClick(R.id.helloWordMsg)
    public void onClickMe() {
        Toast.makeText(getBaseContext(), "click text",
                Toast.LENGTH_SHORT).show();
        RatingBar ratingBarTest = (RatingBar) findViewById(R.id.ratingBarTest);
        ratingBarTest.setRating(ratingBarTest.getRating()-1);
    }

}
