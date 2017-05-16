package com.example.dhanya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.*;

public class Main4Activity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,clr,equal,back;
    EditText result;

    int n,ind;
    String res;
    int num;
    double ans;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1=(Button) findViewById(R.id.sin);
        b2=(Button) findViewById(R.id.cos);
        b3=(Button) findViewById(R.id.tan);
        b4=(Button) findViewById(R.id.cosec);
        b5=(Button) findViewById(R.id.sec);
        b6=(Button) findViewById(R.id.cot);
        b7=(Button) findViewById(R.id.one);
        b8=(Button) findViewById(R.id.two);
        b9=(Button) findViewById(R.id.three);
        b10=(Button) findViewById(R.id.four);
        b11=(Button) findViewById(R.id.five);
        b12=(Button) findViewById(R.id.six);
        b13=(Button) findViewById(R.id.seven);
        b14=(Button) findViewById(R.id.eight);
        b15=(Button) findViewById(R.id.nine);
        b16=(Button) findViewById(R.id.zero);
        back=(Button) findViewById(R.id.back);


        clr=(Button) findViewById(R.id.clr);
        equal=(Button) findViewById(R.id.equal);
        result=(EditText) findViewById(R.id.result);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("sin ");
                n=1;
                result.setSelection(result.getText().length());


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("cos ");
                n=2;
                result.setSelection(result.getText().length());

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("tan ");
                n=3;
                result.setSelection(result.getText().length());

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("cosec ");
                n=4;
                result.setSelection(result.getText().length());

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("sec ");
                n=5;
                result.setSelection(result.getText().length());

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("cot ");
                n=6;
                result.setSelection(result.getText().length());

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("1");
                result.setSelection(result.getText().length());



            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
                result.setSelection(result.getText().length());


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
                result.setSelection(result.getText().length());


            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
                result.setSelection(result.getText().length());


            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
                result.setSelection(result.getText().length());


            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
                result.setSelection(result.getText().length());


            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
                result.setSelection(result.getText().length());


            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
                result.setSelection(result.getText().length());


            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
                result.setSelection(result.getText().length());


            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("0");
                result.setSelection(result.getText().length());


            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (n) {
                    case 1:
                            res=result.getText().toString().substring(4);
                        Toast.makeText(Main4Activity.this,res,Toast.LENGTH_SHORT).show();
                        num=Integer.parseInt(res);
                        Toast.makeText(Main4Activity.this,""+(double)num,Toast.LENGTH_SHORT).show();

                        ans=Math.sin((double)num);
                        result.setText(""+ans);
                        result.setSelection(result.getText().length());

                        break;

                    case 2:

                        res=result.getText().toString().substring(4);
                        num=Integer.parseInt(res);
                        ans=Math.cos((double)num);
                        result.setText(""+ans);
                        result.setSelection(result.getText().length());

                        break;
                    case 3:
                        res=result.getText().toString().substring(4);
                        num=Integer.parseInt(res);
                        ans=Math.tan((double)num);
                        result.setText(""+ans);
                        result.setSelection(result.getText().length());

                        break;
                    case 4:
                        res=result.getText().toString().substring(6);
                        num=Integer.parseInt(res);
                        ans=1/Math.sin((double)num);
                        result.setText(""+ans);
                        result.setSelection(result.getText().length());

                        break;
                    case 5:
                        res=result.getText().toString().substring(4);
                        num=Integer.parseInt(res);
                        ans=1/Math.cos((double)num);
                        result.setText(""+ans);
                        result.setSelection(result.getText().length());

                        break;
                    case 6:
                        res=result.getText().toString().substring(4);
                        num=Integer.parseInt(res);
                        ans=1/Math.tan((double)num);
                        result.setSelection(result.getText().length());

                        result.setText(""+ans);
                        break;
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res=result.getText().toString();
                if(res.length()==0){
                    return;
                }

                String s=res.substring(0,res.length()-1);
                result.setText(s);
                result.setSelection(result.getText().length());

            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Main4Activity.this, MainActivity.class));
        finish();
    }
    }
