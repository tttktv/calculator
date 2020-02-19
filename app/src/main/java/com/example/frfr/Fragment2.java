package com.example.frfr;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment implements View.OnClickListener {
    Button btnSqrt;
    Button PlusMin;
    Button btnSin;
    Button btnCos;
    Button btnTan;
    Button btnPerc;
    Button btnLn;
    Button btnLog;
    Button btnKvad;
    Button btnTen;
    Button btnDrob;
    Button btnPow;
    Button btnSinh;
    Button btnCosh;
    Button btnTanh;
    Button btnPi;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView =
                inflater.inflate(R.layout.fragment2, container, false);
        btnSqrt= (Button) rootView.findViewById(R.id.buttonSqrt);
        btnSin=(Button) rootView.findViewById(R.id.buttonSin);
        btnCos=(Button) rootView.findViewById(R.id.buttonCos);
        btnTan=(Button) rootView.findViewById(R.id.buttonTan);
        btnPerc=(Button) rootView.findViewById(R.id.buttonProc);
        btnLn=(Button) rootView.findViewById(R.id.buttonLn);
        btnLog=(Button) rootView.findViewById(R.id.buttonLog);
        btnKvad=(Button) rootView.findViewById(R.id.buttonKvad);
        btnTen=(Button) rootView.findViewById(R.id.buttonTen);
        btnDrob=(Button) rootView.findViewById(R.id.buttonDrob);
        btnPow=(Button) rootView.findViewById(R.id.buttonPow);
        btnSinh=(Button) rootView.findViewById(R.id.buttonSinh);
        btnCosh=(Button) rootView.findViewById(R.id.buttonCosh);
        btnTanh=(Button) rootView.findViewById(R.id.buttonTanh);
        btnPi=(Button) rootView.findViewById(R.id.buttonPi);

            btnSqrt.setOnClickListener(this);
            btnSin.setOnClickListener(this);
            btnCos.setOnClickListener(this);
            btnTan.setOnClickListener(this);
            btnPerc.setOnClickListener(this);
            btnLn.setOnClickListener(this);
            btnLog.setOnClickListener(this);
            btnKvad.setOnClickListener(this);
            btnTen.setOnClickListener(this);
            btnDrob.setOnClickListener(this);
            btnPow.setOnClickListener(this);
            btnSinh.setOnClickListener(this);
            btnCosh.setOnClickListener(this);
            btnTanh.setOnClickListener(this);
            btnPi.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.buttonPi:{
                MainActivity.tvResult.setText(Double.toString(Math.PI));
                break;
            }
            case R.id.buttonSinh:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.sinh(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.sinh(MainActivity.res);
                }
                break;
            }
            case R.id.buttonCosh:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.cosh(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.cosh(MainActivity.res);
                }
                break;
            }
            case R.id.buttonTanh:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.tanh(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.tanh(MainActivity.res);
                }
                break;
            }

            case R.id.buttonDrob:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=1/MainActivity.a;
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=1/MainActivity.res;
                }
                break;
            }
            case R.id.buttonTen:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.pow(10,MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.pow(10,MainActivity.res);
                }
                break;
            }
            case R.id.buttonKvad:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.pow(MainActivity.a,2);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.pow(MainActivity.res,2);
                }
                break;
            }
            case R.id.buttonLog:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.log10(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.log10(MainActivity.res);
                }
                break;
            }
            case R.id.buttonLn:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.log(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.log(MainActivity.res);
                }
                break;
            }
            case R.id.buttonSqrt:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.sqrt(MainActivity.a);
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.sqrt(MainActivity.res);
                }
                break;
            }
            case R.id.buttonSin:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.sin(Math.toRadians(MainActivity.a));
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.sin(Math.toRadians(MainActivity.res));
                }
                break;
            }
            case R.id.buttonCos:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.cos(Math.toRadians(MainActivity.a));
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.cos(Math.toRadians(MainActivity.res));
                }
                break;
            }
            case R.id.buttonTan:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=Math.tan(Math.toRadians(MainActivity.a));
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=Math.tan(Math.toRadians(MainActivity.res));
                }
                break;
            }
            case R.id.buttonProc:{
                MainActivity.a=Double.parseDouble(MainActivity.tvResult.getText().toString());
                MainActivity.a=MainActivity.a/100;
                MainActivity.tvResult.setText(Double.toString(MainActivity.a));
                if(MainActivity.oper.equals("res")){
                    MainActivity.res=MainActivity.res/100;
                }
                break;
            }

            case R.id.buttonPow: {
                if (MainActivity.F) {
                    MainActivity.res = Double.parseDouble(MainActivity.tvResult.getText().toString());
                }
                if (!MainActivity.F){
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
                }
                MainActivity.tvResult.setText(null);
                MainActivity.oper="pow";
                MainActivity.F=false;
                break;
            }
        }
    }

}
