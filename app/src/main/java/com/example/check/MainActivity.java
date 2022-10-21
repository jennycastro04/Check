package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private CheckBox suma, resta, division, potencia, raiz, ninguna, todas, multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        suma=findViewById(R.id.cbsuma);
        resta=findViewById(R.id.cbresta);
        multi=findViewById(R.id.cbmulti);
        division=findViewById(R.id.cbdivision);
        raiz=findViewById(R.id.cbraiz);
        potencia=findViewById(R.id.cbpoten);
        todas=findViewById(R.id.cbtodas);
        ninguna=findViewById(R.id.cbninguna);
    }
    public void Operacion(View view){
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        int sum = vl1 + vl2;
        int res = vl1 - vl2;
        int mu = vl1 * vl2;
        double div = (double)vl1 / vl2;
        double pot = Math.pow(vl1, vl2);
        double ra1 = Math.sqrt(vl1);
        double ra2 = Math.sqrt(vl2);
        if(suma.isChecked()==true){
            String msj = String.valueOf(sum);
            tv1.setText(msj);
        }
        if (resta.isChecked()==true){
            String msj = String.valueOf(res);
            tv1.setText(msj);
        }
        if (multi.isChecked()==true){
            String msj = String.valueOf(mu);
            tv1.setText(msj);
        }
        if (division.isChecked()==true){
            if(vl2!=0){
                String msj = String.valueOf(div);
                tv1.setText(msj);
            }else{
                tv1.setText("No se puede dividir entre 0");
            }

        }

        if (potencia.isChecked()==true){
            String msj = String.valueOf(pot);
            tv1.setText(msj);
        }
        if (raiz.isChecked()==true){
            String msj = "La raiz del primer valor: "+ra1+"\n La raiz para el segundo valor: "+ra2;
            tv1.setText(msj);
        }
        if (todas.isChecked()==true){
            String msj = "La suma es: "+sum+ ", La resta es: "+res+", La multiplicación es: "+mu+", La division es: "+div+", La potencia es: "+pot+"" +
                    ", La raiz #1: "+ra1+", La raiz #2: "+ra2;
            tv1.setText(msj);
        }
        if (ninguna.isChecked()==true){
            String msj = "No se hará ninguna operación";
            tv1.setText(msj);
        }
    }
}