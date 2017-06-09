package com.example.csaper6.musiiiiiiic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final int MS = 1000;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button100;
    private MediaPlayer n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39;
    private MediaPlayer rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        loadMedaiFiles();
    }

    private void loadMedaiFiles() {
        n1= MediaPlayer.create(this, R.raw.scalea);
        n2= MediaPlayer.create(this, R.raw.scaleb);
        n3= MediaPlayer.create(this, R.raw.scalebb);
        n4= MediaPlayer.create(this, R.raw.scalec);
        n5= MediaPlayer.create(this, R.raw.scalecs);
        n6= MediaPlayer.create(this, R.raw.scaled);
        n7= MediaPlayer.create(this, R.raw.scaleds);
        n8= MediaPlayer.create(this, R.raw.scalee);
        n9= MediaPlayer.create(this, R.raw.scalef);
        n10= MediaPlayer.create(this, R.raw.scalefs);
        n11= MediaPlayer.create(this, R.raw.scaleg);
        n12= MediaPlayer.create(this, R.raw.scalegs);
        n13= MediaPlayer.create(this, R.raw.scalehigha);
        n14= MediaPlayer.create(this, R.raw.scalehighb);
        n15= MediaPlayer.create(this, R.raw.scalehighbb);
        n16= MediaPlayer.create(this, R.raw.scalehighc);
        n17= MediaPlayer.create(this, R.raw.scalehighcs);
        n18= MediaPlayer.create(this, R.raw.scalehighd);
        n19= MediaPlayer.create(this, R.raw.scalehighds);
        n20= MediaPlayer.create(this, R.raw.scalehighe);
        n21= MediaPlayer.create(this, R.raw.scalehighf);
        n22= MediaPlayer.create(this, R.raw.scalehighfs);
        n23= MediaPlayer.create(this, R.raw.scalehighg);
        n24= MediaPlayer.create(this, R.raw.scalehighgs);
        n30= MediaPlayer.create(this, R.raw.centuries);
        //n31= MediaPlayer.create(this, R.raw.sandstorm);
        n32= MediaPlayer.create(this, R.raw.celebrate);
        n36= MediaPlayer.create(this, R.raw.hampster);
        //n37= MediaPlayer.create(this, R.raw.nyan);





    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    private void setListeners() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        //button37.setOnClickListener(this);
        button100.setOnClickListener(this);
    }

    private void wireWidgets() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button30 = (Button) findViewById(R.id.button30);
        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        //button37 = (Button) findViewById(R.id.button37);
        button100 = (Button) findViewById(R.id.button100);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            /*case R.id.button1: n1.seekTo(0); n1.start(); rec=n1; break;
            case R.id.button2: n2.seekTo(0); n2.start(); rec=n2; break;
            case R.id.button3: n3.seekTo(0); n3.start(); rec=n3; break;
            case R.id.button4: n4.seekTo(0); n4.start(); rec=n4; break;
            case R.id.button5: n5.seekTo(0); n5.start(); rec=n5; break;
            case R.id.button6: n6.seekTo(0); n6.start(); rec=n6; break;
            case R.id.button7: n7.seekTo(0); n7.start(); rec=n7; break;
            case R.id.button8: n8.seekTo(0); n8.start(); rec=n8; break;
            case R.id.button9: n9.seekTo(0); n9.start(); rec=n9; break;
            case R.id.button10: n10.seekTo(0); n10.start(); rec=n10; break;
            case R.id.button11: n11.seekTo(0); n11.start(); rec=n11; break;
            case R.id.button12: n12.seekTo(0); n12.start(); rec=n12; break;
            case R.id.button13: n13.seekTo(0); n13.start(); rec=n13; break;
            case R.id.button14: n14.seekTo(0); n14.start(); rec=n14; break;
            case R.id.button15: n15.seekTo(0); n15.start(); rec=n15; break;
            case R.id.button16: n16.seekTo(0); n16.start(); rec=n16; break;
            case R.id.button17: n17.seekTo(0); n17.start(); rec=n17; break;
            case R.id.button18: n18.seekTo(0); n18.start(); rec=n18; break;
            case R.id.button19: n19.seekTo(0); n19.start(); rec=n19; break;
            case R.id.button20: n20.seekTo(0); n20.start(); rec=n20; break;
            case R.id.button21: n21.seekTo(0); n21.start(); rec=n21; break;
            case R.id.button22: n22.seekTo(0); n22.start(); rec=n22; break;
            case R.id.button23: n23.seekTo(0); n23.start(); rec=n23; break;
            case R.id.button24: n24.seekTo(0); n24.start(); rec=n24; break;
            case R.id.button25: n25.seekTo(0); n25.start(); rec=n25; break;*/
            case R.id.button30: n30.seekTo(0); n30.start(); rec=n30; break;
            case R.id.button31: n31.seekTo(0); n31.start(); rec=n31; break;
            case R.id.button32: n32.seekTo(0); n32.start(); rec=n32; break;
            case R.id.button36: n36.seekTo(0); n36.start(); rec=n36; break;
            //case R.id.button37: n36.seekTo(0); n37.start(); rec=n37; break;
            case R.id.button33: rec.pause(); break;
            case R.id.button34: rec.start(); break;
            case R.id.button35:{
                int q = ((int)(Math.random() * 29) +1);
                if(q==1)
                {n1.seekTo(0); n1.start(); rec=n1;}
                else if(q==2)
                {n2.seekTo(0); n2.start(); rec=n2;}
                else if(q==3)
                {n3.seekTo(0); n3.start(); rec=n3;}
                else if(q==4)
                {n4.seekTo(0); n4.start(); rec=n4;}
                else if(q==5)
                {n5.seekTo(0); n5.start(); rec=n5;}
            else if(q==6)
            {n6.seekTo(0); n6.start(); rec=n6;}
            else if(q==7)
            {n7.seekTo(0); n7.start(); rec=n7;}
            else if(q==8)
            {n8.seekTo(0); n8.start(); rec=n8;}
            else if(q==9)
            {n9.seekTo(0); n9.start(); rec=n9;}
            else if(q==10)
            {n10.seekTo(0); n10.start(); rec=n10;}
            else if(q==11)
            {n11.seekTo(0); n11.start(); rec=n11;}
            else if(q==12)
            {n12.seekTo(0); n12.start(); rec=n12;}
            else if(q==13)
            {n13.seekTo(0); n13.start(); rec=n13;}
            else if(q==14)
            {n14.seekTo(0); n14.start(); rec=n14;}
            else if(q==15)
            {n15.seekTo(0); n15.start(); rec=n15;}
            else if(q==16)
            {n16.seekTo(0); n16.start(); rec=n16;}
            else if(q==17)
            {n17.seekTo(0); n17.start(); rec=n17;}
            else if(q==18)
            {n18.seekTo(0); n18.start(); rec=n18;}
            else if(q==19)
            {n19.seekTo(0); n19.start(); rec=n19;}
            else if(q==20)
            {n20.seekTo(0); n20.start(); rec=n20;}
            else if(q==21)
            {n21.seekTo(0); n21.start(); rec=n21;}
            else if(q==22)
            {n22.seekTo(0); n22.start(); rec=n22;}
            else if(q==23)
            {n23.seekTo(0); n23.start(); rec=n23;}
            else if(q==24)
            {n24.seekTo(0); n24.start(); rec=n24;}
            else if(q==25)
            {n30.seekTo(0); n30.start(); rec=n30;}
            else if(q==26)
            {n31.seekTo(0); n31.start(); rec=n31;}
            else if(q==27)
            {n32.seekTo(0); n32.start(); rec=n32;}
                else if(q==28)
                {n36.seekTo(0); n36.start(); rec=n36;}
                else if(q==29)
                {n37.seekTo(0); n37.start(); rec=n37;}
            break;}
            case R.id.button100:
                n1.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n2.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                n3.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n4.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n5.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n6.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n7.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n8.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n9.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n10.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }n11.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n12.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n13.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n14.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n15.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }n16.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n17.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n18.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n19.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n20.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }n21.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n22.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n23.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n24.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;



        }
    }
}
