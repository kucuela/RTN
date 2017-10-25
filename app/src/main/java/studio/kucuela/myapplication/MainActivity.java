package studio.kucuela.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextClock;
import android.widget.TextView;
import android.app.Activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




import static studio.kucuela.myapplication.R.id.editText11;
import static studio.kucuela.myapplication.R.id.parent;
import static studio.kucuela.myapplication.R.id.spinner3;
import static studio.kucuela.myapplication.R.id.textView;
import static studio.kucuela.myapplication.R.id.textView100;
import static studio.kucuela.myapplication.R.id.textView200;
import static studio.kucuela.myapplication.R.id.textview300;
import static studio.kucuela.myapplication.R.id.textview400;
import static studio.kucuela.myapplication.R.id.textview500;
import static studio.kucuela.myapplication.R.id.textview600;
import static studio.kucuela.myapplication.R.id.textview700;
import static studio.kucuela.myapplication.R.id.textview800;
import static studio.kucuela.myapplication.R.id.textview900;
import static studio.kucuela.myapplication.R.id.textview1000;



import static studio.kucuela.myapplication.R.id.time;



public class MainActivity extends AppCompatActivity {



    TextView textView100;
    TextView textView200;
    TextView textView300;
    TextView textView400;
    TextView textView500;
    TextView textView600;
    TextView textView700;
    TextView textView800;
    TextView textView900;
    TextView textView1000;


    private TextView info;
    private EditText input;

    Spinner sp;
    ArrayAdapter<String> adapter;
    String numbers[] = { "-","Bojana", "Bojana iz Slankamena", "Bojana iz Krčedina", "Bojana Čorbašilov (Kazahstan)", "Divna Maletin", "Bojana predstavnik Vodenih Ljudi", "Karumba",
            "Tengba", "Pemba", "Minahonda", "Jajanda", "Svetozar", "Jorganče", "Sreten iz kupatila", "Gospodin sa bubama", "Advokat Krtinić", "Odvjetnik Krtilić", "Kazuhiro", "Šojićiro",
            "Hirokazu", "Mario Japanac", "General Rivotril", "General Rivotrilko", "Generalko Rivotrilko", "Generalčić Rivotrilčić", "Dona Esperansa","Desanka sa ogledalima"};


    Spinner sp1;
    ArrayAdapter<String> adapter1;
    String numbers1[] = { "-","Savino Selo", "Kucura", "Vrbas", "Despotovo", "Beograd", "Novi Sad", "Negde u prirodi", "Odbijam da Vam dam lokaciju"};

    Spinner sp2;
    ArrayAdapter<String> adapter2;
    String numbers2[] = { "-","Kučuela domaća tip A", "Kučuela domaća tip B", "Kučuela standardna", "Zorka Crnogorka", "Kučuela ostalo", "Ekser", "Spid", "Muskatni oraščić", "Alkohol", "Ostalo"};

    Spinner sp6;
    ArrayAdapter<String> adapter6;
    String numbers6[] = { "-","1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5"};

    Spinner sp7;
    ArrayAdapter<String> adapter7;
    String numbers7[] = {"-", "1", "2", "3", "4", "Probilo!"};

    Spinner sp8;
    ArrayAdapter<String> adapter8;
    String numbers8[] = {"-", "More", "Oblaci", "Olujno more", "Olujni oblaci"};

    Spinner sp9;
    ArrayAdapter<String> adapter9;
    String numbers9[] = {"-", "Plava", "Bela", "Žuta", "Narandžasta", "Još uvek je dan"};

    Spinner sp10;
    ArrayAdapter<String> adapter10;
    String numbers10[] = {"-", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna"};

    Spinner sp10a;
    ArrayAdapter<String> adapter10a;
    String numbers10a[] = {"-", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna"};

    Spinner sp10b;
    ArrayAdapter<String> adapter10b;
    String numbers10b[] = {"-", "Zalepilo me", "Ošajdarilo me", "Zakucalo me", "Išaketalo me", "Istabanalo me", "Urokalo me", "Pritislo me", "Izlopatalo me",};


    Spinner sp11;
    ArrayAdapter<String> adapter11;
    String numbers11[] = {"-", "Visoka", "Standardna", "Niska", "Seoski konstantna"};

    Spinner sp12;
    ArrayAdapter<String> adapter12;
    String numbers12[] = { "-","50", "100", "150", "200", "250", "300", "350", "400", "450","500"};

    Spinner sp13;
    ArrayAdapter<String> adapter13;
    String numbers13[] = {"-", "10", "15", "20", "25", "30", "35", "40"};

    Spinner sp14;
    ArrayAdapter<String> adapter14;
    String numbers14[] = {"-", "Svet je roze!", "Svet je zelen!"};

    Spinner sp15;
    ArrayAdapter<String> adapter15;
    String numbers15[] = {"-", "Jakna", "Papuče"};

    Spinner sp16;
    ArrayAdapter<String> adapter16;
    String numbers16[] = {"Nemam ništa da dodam!"};

    Spinner sp17;
    ArrayAdapter<String> adapter17;
    String numbers17[] = {"-","Konveksno (savijeno)", "Konkavno (kontra-savijeno)"};

    Spinner sp18;
    ArrayAdapter<String> adapter18;
    String numbers18[] = {"-","Dobro","Loše","Depresivno","Besno","Euforično","Histerično","Melanholično","Napaljeno","Gladno","Umorno","Sveže","Bajato"};












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        info = (TextView) findViewById(R.id.textViewZlodi);
        input = (EditText)findViewById(R.id.editText11);

       Intent svc = new Intent(this, BackgroundSoundService.class); startService(svc);

        //




        //izlistati sve textview objekte

        textView100 = (TextView)findViewById(R.id.textView100);
        textView200 = (TextView)findViewById(R.id.textView200);
        textView300 = (TextView)findViewById(R.id.textview300);
        textView400 = (TextView)findViewById(R.id.textview400);
        textView500 = (TextView)findViewById(R.id.textview500);
        textView600 = (TextView)findViewById(R.id.textview600);
        textView700 = (TextView)findViewById(R.id.textview700);
        textView800 = (TextView)findViewById(R.id.textview800);
        textView900 = (TextView)findViewById(R.id.textview900);
        textView1000 = (TextView)findViewById(R.id.textview1000);

        sp = (Spinner) findViewById(R.id.spinner3);
        sp1=(Spinner)findViewById(R.id.spinner4) ;
        sp2=(Spinner)findViewById(R.id.spinner5) ;
        sp6=(Spinner)findViewById(R.id.spinner6) ;
        sp7=(Spinner)findViewById(R.id.spinner7) ;
        sp8=(Spinner)findViewById(R.id.spinner8) ;
        sp9=(Spinner)findViewById(R.id.spinner9) ;
        sp10=(Spinner)findViewById(R.id.spinner10) ;
        sp10a=(Spinner)findViewById(R.id.spinner10a);
        sp11=(Spinner)findViewById(R.id.spinner11) ;
        sp12=(Spinner)findViewById(R.id.spinner12) ;
        sp13=(Spinner)findViewById(R.id.spinner13) ;
        sp14=(Spinner)findViewById(R.id.spinner14) ;
        sp15=(Spinner)findViewById(R.id.spinner15) ;
        sp16=(Spinner)findViewById(R.id.spinner16) ;
        sp17=(Spinner)findViewById(R.id.spinner17) ;
        sp10b=(Spinner)findViewById(R.id.spinner10b) ;
        sp18=(Spinner)findViewById(R.id.spinner18) ;








        // IME
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                        //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });


        //LOKACIJA
        adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers1);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //OPIJAT
        adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers2);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTN
        adapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers6);
        sp6.setAdapter(adapter6);
        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //KACA
        adapter7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers7);
        sp7.setAdapter(adapter7);
        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //MORE
        adapter8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers8);
        sp8.setAdapter(adapter8);
        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //SVETLA
        adapter9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers9);
        sp9.setAdapter(adapter9);
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARAC
        adapter10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10);
        sp10.setAdapter(adapter10);
        sp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARACa
        adapter10a = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10a);
        sp10a.setAdapter(adapter10a);
        sp10a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARACa
        adapter10b = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10b);
        sp10b.setAdapter(adapter10b);
        sp10b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //AKTIV
        adapter11 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers11);
        sp11.setAdapter(adapter11);
        sp11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ZAKRIVLJENOST
        adapter17 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers17);
        sp17.setAdapter(adapter17);
        sp17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNK
        adapter12 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers12);
        sp12.setAdapter(adapter12);
        sp12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNKACA
        adapter13 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers13);
        sp13.setAdapter(adapter13);
        sp13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ROZE
        adapter14 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers14);
        sp14.setAdapter(adapter14);
        sp14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //JAKNA
        adapter15 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers15);
        sp15.setAdapter(adapter15);
        sp15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //STAIMATEDADODATe
        adapter16 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers16);
        sp16.setAdapter(adapter16);
        sp16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        ////STANJE DUHA
        adapter18 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers18);
        sp18.setAdapter(adapter18);
        sp18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

            //ODAVDE KOD





    }


    //KONTROLE ZA MUZIKU KAD SE IZADJE I UDJE U APP
    @Override
    protected void onPause() {
        super.onPause();
        Intent svc = new Intent(this, BackgroundSoundService.class); stopService(svc);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent svc = new Intent(this, BackgroundSoundService.class); stopService(svc);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent svc = new Intent(this, BackgroundSoundService.class); stopService(svc);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent svc = new Intent(this, BackgroundSoundService.class); startService(svc);
    }



    //DUGMAD ZA ON OFF MUZIKU
    public void onClickUgasi (View view) {

        Intent svc = new Intent(this, BackgroundSoundService.class); stopService(svc);




    }

    public void onClickUpali (View view) {

        Intent svc = new Intent(this, BackgroundSoundService.class); startService(svc);


    }

    public void onClickMuzika (View view) {

        Uri uri = Uri.parse("https://www.youtube.com/watch?v=A_wuKp20mIg"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }



    //SHARE DUGME
    public void onClickPodeli (View view) {


        Intent sendIntent = new Intent();
        String date = String.valueOf(android.text.format.DateFormat.format("EE,dd.MMMM, HH:mm", new java.util.Date()));
        String inputText = input.getText().toString();
        info.setText(inputText);

        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "REZULTATI TESTA"+"\n\nVREME: "+date+"\nKORISNIK: " + sp.getSelectedItem().toString()+"\nLOKACIJA: "
                +sp1.getSelectedItem().toString()+"\nOPIJAT: "+sp2.getSelectedItem().toString()
                +"\nSTANJE DUHA: "+sp18.getSelectedItem().toString()+
                "\n\nRTN: "+sp6.getSelectedItem().toString()+"\nKACA: "+sp7.getSelectedItem().toString()+"\nMORE/OBLACI: "
                +sp8.getSelectedItem().toString()+"\nSVETLA: "+sp9.getSelectedItem().toString()+"\nUDARAC: "+sp10b.getSelectedItem().toString()+"\n"+sp10.getSelectedItem().toString()+"/"+sp10a.getSelectedItem().toString()
                +"\nAKTIVNOST: "+sp11.getSelectedItem().toString()+"\nZAKRIVLJENOST: "+sp17.getSelectedItem().toString()+"\n\nRTN PO KRTINIĆEVOJ SKALI: "+sp12.getSelectedItem().toString()+"\nKACA PO KRTINIĆEVOJ SKALI: "
                +sp13.getSelectedItem().toString()+"\nROZE/ZELENO: "+sp14.getSelectedItem().toString()+"\nJAKNA/PAPUČE: "+sp15.getSelectedItem().toString()
                +"\nŠTA IMATE DA DODATE: "+"\n"+sp16.getSelectedItem().toString()+"\n\nOPŠTI UTISAK/NAPOMENE: "+"\n"+input.getText());
        sendIntent.setType("text/plain");

        startActivity(sendIntent);


        Intent svc = new Intent(this, BackgroundSoundService.class); stopService(svc);
        finish();



        /*startActivity(sendIntent);

        startActivity(getIntent());*/



    }


}