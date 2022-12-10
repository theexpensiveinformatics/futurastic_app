package tei.krushang.futurasticapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout box1,linbox1;
    ImageButton imageButton1,imageButton2,imageButton3,imageButton4;
    TextView main1,txt1,tei;
    CardView cardv,cardv2,cardv3,cardv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1=(LinearLayout) findViewById(R.id.box1);
        linbox1=(LinearLayout) findViewById(R.id.linbox1);
        imageButton1=(ImageButton)findViewById(R.id.imageButton1);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        main1=(TextView)findViewById(R.id.main1);
        txt1=(TextView)findViewById(R.id.txt1);
        cardv=(CardView)findViewById(R.id.cardv);
        cardv2=(CardView)findViewById(R.id.cardv2);
        cardv3 =(CardView)findViewById(R.id.cardv3);
        cardv4=(CardView)findViewById(R.id.cardv4);
        tei=(TextView)findViewById(R.id.tei);


        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cars.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String >(cardv,"c1");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,city.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String >(cardv2,"c2");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent2,options.toBundle());
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,robots.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String >(cardv3,"c3");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent3,options.toBundle());
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,tech.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String >(cardv4,"c4");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent4,options.toBundle());



            }
        });

        tei.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://znap.link/theexpensiveinformatics";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}