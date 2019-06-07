package com.nirajsarode.studentassitantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AttendanceMain extends AppCompatActivity {

    int Tlec1 =0;
    int Alec1 = 0;

    int Tlec2 =0;
    int Alec2 = 0;

    int Tlec3 =0;
    int Alec3= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_main);
    }
//First subject
    public void incrementsub1T(View view) {
        Tlec1 = Tlec1 + 1;
        displayQuantityT1(Tlec1);
    }

    public void decrementsub1T(View view) {
        if (Tlec1 == 0) {
            return;
        }
        Tlec1 = Tlec1 - 1;
        displayQuantityT1(Tlec1);
    }

    private void displayQuantityT1(int lec) {
        TextView quantityTextViewT = (TextView) findViewById(R.id.totalsub1);
        quantityTextViewT.setText("" +lec);
        percSub1();
        totalPer();
    }

    public void incrementsub1(View view) {
        Alec1 = Alec1 + 1;
        Tlec1 = Tlec1 + 1;
        displayQuantityA1(Alec1);
        displayQuantityT1(Tlec1);
    }

    public void decrementsub1(View view) {
        if (Alec1 == 0) {
            return;
        }
        Alec1 = Alec1 - 1;
        displayQuantityA1(Alec1);
    }

    private void displayQuantityA1(int Attlec) {
        TextView quantityTextViewA = (TextView) findViewById(R.id.attendedsub1);
        quantityTextViewA.setText("" +Attlec);
        percSub1();
        totalPer();
    }

    public void percSub1() {


        TextView tlect = (TextView) findViewById(R.id.totalsub1);
        int t1 = Integer.parseInt((String) tlect.getText());

        TextView alect = (TextView) findViewById(R.id.attendedsub1);
        int a1 = Integer.parseInt((String) alect.getText());



        float sub1perc = ((float) a1/(float) t1)*100;
        String subperc1f = String.format ("%.2f", sub1perc);

        TextView quantityTextViewPerc = (TextView) findViewById(R.id.percSub1);
        quantityTextViewPerc.setText("" + subperc1f + "%");
    }
    //Second Subject

    public void incrementsub2T(View view) {
        Tlec2 = Tlec2 + 1;
        displayQuantityT2(Tlec2);
    }

    public void decrementsub2T(View view) {
        if (Tlec2 == 0) {
            return;
        }
        Tlec2 = Tlec2 - 1;
        displayQuantityT2(Tlec2);
    }

    private void displayQuantityT2(int lec) {
        TextView quantityTextViewT = (TextView) findViewById(R.id.totalsub2);
        quantityTextViewT.setText("" +lec);
        percSub2();
        totalPer();
    }

    public void incrementsub2(View view) {
        Alec2 = Alec2 + 1;
        Tlec2 = Tlec2 + 1;
        displayQuantityA2(Alec2);
        displayQuantityT2(Tlec2);
    }

    public void decrementsub2(View view) {
        if (Alec2 == 0) {
            return;
        }
        Alec2 = Alec2 - 1;
        displayQuantityA2(Alec2);
    }

    private void displayQuantityA2(int Attlec) {
        TextView quantityTextViewA = (TextView) findViewById(R.id.attendedsub2);
        quantityTextViewA.setText("" +Attlec);
        percSub2();
        totalPer();
    }

    public void percSub2() {


        TextView tlect = (TextView) findViewById(R.id.totalsub2);
        int t2 = Integer.parseInt((String) tlect.getText());

        TextView alect = (TextView) findViewById(R.id.attendedsub2);
        int a2 = Integer.parseInt((String) alect.getText());



        float subperc2 = ((float) a2/(float) t2)*100;
        String subperc2f = String.format ("%.2f", subperc2);

        TextView quantityTextViewPerc = (TextView) findViewById(R.id.percSub2);
        quantityTextViewPerc.setText("" + subperc2f + "%");
    }
//Third Subject

    public void incrementsub3T(View view) {
        Tlec3 = Tlec3 + 1;
        displayQuantityT3(Tlec3);
    }

    public void decrementsub3T(View view) {
        if (Tlec3 == 0) {
            return;
        }
        Tlec3 = Tlec3 - 1;
        displayQuantityT3(Tlec3);
    }

    private void displayQuantityT3(int lec) {
        TextView quantityTextViewT = (TextView) findViewById(R.id.totalsub3);
        quantityTextViewT.setText("" +lec);
        percSub3();
        totalPer();
    }

    public void incrementsub3(View view) {
        Alec3 = Alec3 + 1;
        Tlec3 = Tlec3 + 1;
        displayQuantityA3(Alec3);
        displayQuantityT3(Tlec3);
    }

    public void decrementsub3(View view) {
        if (Alec3 == 0) {
            return;
        }
        Alec3 = Alec3 - 1;
        displayQuantityA3(Alec3);
    }

    private void displayQuantityA3(int Attlec) {
        TextView quantityTextViewA = (TextView) findViewById(R.id.attendedsub3);
        quantityTextViewA.setText("" +Attlec);
        percSub3();
        totalPer();
    }

    public void percSub3() {


        TextView tlect = (TextView) findViewById(R.id.totalsub3);
        int t3 = Integer.parseInt((String) tlect.getText());

        TextView alect = (TextView) findViewById(R.id.attendedsub3);
        int a3 = Integer.parseInt((String) alect.getText());



        float subperc3 = ((float) a3/(float) t3)*100;
        String subperc3f = String.format ("%.2f", subperc3);

        TextView quantityTextViewPerc = (TextView) findViewById(R.id.percSub3);
        quantityTextViewPerc.setText("" + subperc3f + "%");

    }
//Total Attendance

    public void totalPer() {

        TextView tlect = (TextView) findViewById(R.id.totalsub1);
        int t1 = Integer.parseInt((String) tlect.getText());

        TextView alect = (TextView) findViewById(R.id.attendedsub1);
        int a1 = Integer.parseInt((String) alect.getText());


        TextView tlect2 = (TextView) findViewById(R.id.totalsub2);
        int t2 = Integer.parseInt((String) tlect2.getText());

        TextView alect2 = (TextView) findViewById(R.id.attendedsub2);
        int a2 = Integer.parseInt((String) alect2.getText());


        TextView tlect3 = (TextView) findViewById(R.id.totalsub3);
        int t3 = Integer.parseInt((String) tlect3.getText());

        TextView alect3 = (TextView) findViewById(R.id.attendedsub3);
        int a3 = Integer.parseInt((String) alect3.getText());



        float ttperc = ((float) (a1+a2+a3)/(float) (t1+t2+t3))*100;
        String totalper = String.format ("%.2f", ttperc);

        TextView quantityTextViewPerc = (TextView) findViewById(R.id.totalperc);
        quantityTextViewPerc.setText("" + totalper + "%");
    }



}
