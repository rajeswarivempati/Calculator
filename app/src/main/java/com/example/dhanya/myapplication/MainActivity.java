package com.example.dhanya.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import java.math.*;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, mul, div, sqr, root, per, equal, clr,back;
    EditText result;
    String res;
    int num1, num2, ans, n,ind;
    double re;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        b0 = (Button) findViewById(R.id.zero);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        result=(EditText)findViewById(R.id.result);
        result.setShowSoftInputOnFocus(false);
        back=(Button) findViewById(R.id.back);
        per = (Button) findViewById(R.id.per);
        sqr = (Button) findViewById(R.id.sqr);
        root = (Button) findViewById(R.id.root);
        equal = (Button) findViewById(R.id.equal);
        clr = (Button) findViewById(R.id.clr);
        //Toast.makeText(MainActivity.this, "This is my Toast message!",Toast.LENGTH_LONG).show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.append("1");
                result.setSelection(result.getText().length());

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
                result.setSelection(result.getText().length());

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
                result.setSelection(result.getText().length());

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
                result.setSelection(result.getText().length());

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
                result.setSelection(result.getText().length());

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
                result.setSelection(result.getText().length());

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
                result.setSelection(result.getText().length());

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
                result.setSelection(result.getText().length());

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
                result.setSelection(result.getText().length());

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("0");
                result.setSelection(result.getText().length());

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                num1 = Integer.parseInt(res);
                n = 1;
                result.append("+");
                result.setSelection(result.getText().length());

                res=result.getText().toString();
                ind=res.indexOf("+");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                num1 = Integer.parseInt(res);
                n = 2;
                result.append("-");
                result.setSelection(result.getText().length());

                res=result.getText().toString();
                ind=res.indexOf("-");

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                num1 = Integer.parseInt(res);
                n = 3;
                result.append("*");
                result.setSelection(result.getText().length());

                res=result.getText().toString();
                ind=res.indexOf("*");


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                n = 4;
                num1 = Integer.parseInt(res);
                result.append("/");
                result.setSelection(result.getText().length());

                res=result.getText().toString();
                ind=res.indexOf("/");
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                n = 5;
                num1 = Integer.parseInt(res);
                result.append("%");
                result.setSelection(result.getText().length());

                res=result.getText().toString();
                ind=res.indexOf("%");
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                num1 = Integer.parseInt(res);
                ans = num1 * num1;

                result.setText(ans+"");
                result.setSelection(result.getText().length());


            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = result.getText().toString();
                double num;
                num = Double.parseDouble(res);
                re = Math.sqrt(num);
                result.setText(re+"");
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
                res = result.getText().toString().substring(ind+1);
                num2 = Integer.parseInt(res);
                switch (n) {
                    case 1:
                        ans = num1 + num2;
                        result.setText(ans+"");
                        result.setSelection(result.getText().length());


                        break;
                    case 2:
                        ans = num1 - num2;
                        result.setText(ans+"");
                        result.setSelection(result.getText().length());

                        break;
                    case 3:
                        ans = num1 * num2;
                        result.setText(ans+"");
                        result.setSelection(result.getText().length());

                        break;
                    case 4:
                        try {
                            ans = num1 / num2;
                            result.setText(ans+"");
                            result.setSelection(result.getText().length());

                        }
                        catch (Exception e)
                        {
                            result.setText("infinity");
                            result.setSelection(result.getText().length());

                        }
                        break;
                    case 5:
                        ans = num1 % num2;
                        result.setText(ans+"");
                        result.setSelection(result.getText().length());

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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);//Menu Resource, Menu
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Mode will be changed",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);

                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"It will provide u help",Toast.LENGTH_LONG).show();
                intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"About this calculator",Toast.LENGTH_LONG).show();
                intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
