package studio.kucuela.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);







    }


    public void onClick (View view){

        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);

    }

    //KONTROLE ZA MUZIKU KAD SE IZADJE I UDJE U APP









}








