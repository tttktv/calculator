package com.example.frfr;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment implements View.OnClickListener{

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button btnRes;
    Button btnDel;
    Button btnPoint;
    Button PlusMin;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View rootView =
                inflater.inflate(R.layout.fragment1, container, false);
        btnAdd = (Button) rootView.findViewById(R.id.buttonPlus);
        btnSub = (Button) rootView.findViewById(R.id.buttonMinus);
        btnMult = (Button) rootView.findViewById(R.id.buttonMult);
        btnDiv = (Button) rootView.findViewById(R.id.buttonDiv);
        btnRes = (Button) rootView.findViewById(R.id.buttonRes);
        btnDel = (Button) rootView.findViewById(R.id.buttonDelete);
        btnPoint = (Button) rootView.findViewById(R.id.buttonPoint);
        PlusMin= (Button) rootView.findViewById(R.id.PlusMin);

        btn0 = (Button) rootView.findViewById(R.id.button0);
        btn1 = (Button) rootView.findViewById(R.id.button1);
        btn2 = (Button) rootView.findViewById(R.id.button2);
        btn3 = (Button) rootView.findViewById(R.id.button3);
        btn4 = (Button) rootView.findViewById(R.id.button4);
        btn5 = (Button) rootView.findViewById(R.id.button5);
        btn6 = (Button) rootView.findViewById(R.id.button6);
        btn7 = (Button) rootView.findViewById(R.id.button7);
        btn8 = (Button) rootView.findViewById(R.id.button8);
        btn9 = (Button) rootView.findViewById(R.id.button9);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnRes.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        PlusMin.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.PlusMin:

                if(MainActivity.tvResult.getText().toString().equals("")) {
                    MainActivity.tvResult.append("-");
                    break;
                }
                if(MainActivity.tvResult.getText().toString().equals("-")) {
                    MainActivity.tvResult.setText(null);
                    break;
                }
                if(!MainActivity.tvResult.getText().toString().equals("")&&(MainActivity.tvResult.getText().toString().charAt(0)!='-'||MainActivity.tvResult.getText().toString().charAt(0)=='-')){
                    MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString())*-1;
                    MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                    if(MainActivity.oper.equals("res")){
                        MainActivity.res=MainActivity.res*(-1);
                    }
                    break;
                }
                break;
            case R.id.buttonPoint:

                if(!MainActivity.tvResult.getText().toString().equals("")&&!MainActivity.tvResult.getText().toString().contains("."))
                    MainActivity.tvResult.append(".");
                break;

            case R.id.button0:
                MainActivity.tvResult.append("0");
                break;
            case R.id.button1:
                MainActivity.tvResult.append("1");
                break;
            case R.id.button2:
                MainActivity.tvResult.append("2");
                break;
            case R.id.button3:
                MainActivity.tvResult.append("3");
                break;
            case R.id.button4:
                MainActivity.tvResult.append("4");
                break;
            case R.id.button5:
                MainActivity.tvResult.append("5");
                break;
            case R.id.button6:
                MainActivity.tvResult.append("6");
                break;
            case R.id.button7:
                MainActivity.tvResult.append("7");
                break;
            case R.id.button8:
                MainActivity.tvResult.append("8");
                break;
            case R.id.button9:
                MainActivity.tvResult.append("9");
                break;

            case R.id.buttonPlus: {
                if (MainActivity.F) {
                    MainActivity.res = Double.parseDouble(MainActivity.tvResult.getText().toString());
                }
                if (!MainActivity.F){
                    MainActivity.b=Double.parseDouble(MainActivity.tvResult.getText().toString());
                    //res=res+b;
                    if (MainActivity.oper.equals("pow")){
                        MainActivity.res=Math.pow(MainActivity.res,MainActivity.b);
                    }
                    if (MainActivity.oper.equals("plus")){
                        MainActivity.res=MainActivity.res+MainActivity.b;
                    }
                    if (MainActivity.oper.equals("minus")){
                        MainActivity.res=MainActivity.res-MainActivity.b;
                    }
                    if (MainActivity.oper.equals("mult")){
                        MainActivity.res=MainActivity.res*MainActivity.b;
                    }
                    if (MainActivity.oper.equals("div")){
                        MainActivity.res=MainActivity.res/MainActivity.b;
                    }
                }
                MainActivity.tvResult.setText(null);
                MainActivity.oper="plus";
                MainActivity.F=false;
                break;
            }

            case R.id.buttonMinus: {
                if (MainActivity.F) {
                    MainActivity.res = Double.parseDouble(MainActivity.tvResult.getText().toString());
                }
                if (!MainActivity.F){
                    MainActivity.b=Double.parseDouble(MainActivity.tvResult.getText().toString());
                    // res=res-b;
                    if (MainActivity.oper.equals("pow")){
                        MainActivity.res=Math.pow(MainActivity.res,MainActivity.b);
                    }
                    if (MainActivity.oper.equals("plus")){
                        MainActivity.res=MainActivity.res+MainActivity.b;
                    }
                    if (MainActivity.oper.equals("minus")){
                        MainActivity.res=MainActivity.res-MainActivity.b;
                    }
                    if (MainActivity.oper.equals("mult")){
                        MainActivity.res=MainActivity.res*MainActivity.b;
                    }
                    if (MainActivity.oper.equals("div")){
                        MainActivity.res=MainActivity.res/MainActivity.b;
                    }
                }
                MainActivity.oper="minus";
                MainActivity.tvResult.setText(null);
                MainActivity.F=false;
                //res=res-c;
                break;
            }

            case R.id.buttonMult:
                if (MainActivity.F) {
                    MainActivity.res = Double.parseDouble(MainActivity.tvResult.getText().toString());
                }
                if (!MainActivity.F){
                    MainActivity.b=Double.parseDouble(MainActivity.tvResult.getText().toString());
                    // res=res-b;
                    if (MainActivity.oper.equals("pow")){
                        MainActivity.res=Math.pow(MainActivity.res,MainActivity.b);
                    }
                    if (MainActivity.oper.equals("plus")){
                        MainActivity.res=MainActivity.res+MainActivity.b;
                    }
                    if (MainActivity.oper.equals("minus")){
                        MainActivity.res=MainActivity.res-MainActivity.b;
                    }
                    if (MainActivity.oper.equals("mult")){
                        MainActivity.res=MainActivity.res*MainActivity.b;
                    }
                    if (MainActivity.oper.equals("div")){
                        MainActivity.res=MainActivity.res/MainActivity.b;
                    }
                }
                MainActivity.oper="mult";
                MainActivity.tvResult.setText(null);
                MainActivity.F=false;
                break;

            case R.id.buttonDiv:
                if (MainActivity.F) {
                    MainActivity.res = Double.parseDouble(MainActivity.tvResult.getText().toString());
                }
                if (!MainActivity.F){
                    MainActivity.b=Double.parseDouble(MainActivity.tvResult.getText().toString());
                    // res=res-b;
                    if (MainActivity.oper.equals("pow")){
                        MainActivity.res=Math.pow(MainActivity.res,MainActivity.b);
                    }
                    if (MainActivity.oper.equals("plus")){
                        MainActivity.res=MainActivity.res+MainActivity.b;
                    }
                    if (MainActivity.oper.equals("minus")){
                        MainActivity.res=MainActivity.res-MainActivity.b;
                    }
                    if (MainActivity.oper.equals("mult")){
                        MainActivity.res=MainActivity.res*MainActivity.b;
                    }
                    if (MainActivity.oper.equals("div")){
                        MainActivity.res=MainActivity.res/MainActivity.b;
                    }
                }
                MainActivity.oper="div";
                MainActivity.tvResult.setText(null);
                MainActivity.F=false;
                break;



            case R.id.buttonRes:
                MainActivity.b=Double.parseDouble(MainActivity.tvResult.getText().toString());
                if (MainActivity.oper.equals("pow")){
                    MainActivity.res=Math.pow(MainActivity.res,MainActivity.b);
                }
                if (MainActivity.oper.equals("plus")){
                    MainActivity.res=MainActivity.res+MainActivity.b;
                }
                if (MainActivity.oper.equals("minus")){
                    MainActivity.res=MainActivity.res-MainActivity.b;
                }
                if (MainActivity.oper.equals("mult")){
                    MainActivity.res=MainActivity.res*MainActivity.b;
                }
                if (MainActivity.oper.equals("div")){
                    MainActivity.res=MainActivity.res/MainActivity.b;
                }
                MainActivity.tvResult.setText(Double.toString(MainActivity.res));
                MainActivity.oper="res";
                MainActivity.F=false;
                break;

            case R.id.buttonDelete:
                MainActivity.tvResult.setText(null);
                MainActivity.res=0;
                MainActivity.b=0;
                MainActivity.F=true;
                MainActivity.oper="";
                break;


        }

    }


}
