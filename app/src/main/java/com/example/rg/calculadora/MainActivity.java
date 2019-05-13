package com.example.rg.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    //Botones de los numeros
    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    //Botones de los operadores
    private Button mas, menos, div, mult,pot,raiz,porcentaje,factorial;
    //Boton de encendido/apagado
    private Button b_on_off;
    private Button punto;
    private Button igual;
    private Button del;
    private Button parent_abrir,parent_cerrar;

    //panel con el resultado y la operacion actual
    private TextView panel;
    private String historial="";
    private boolean encendida=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        b_on_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!encendida) {
                    panel.setText("0");
                    encendida=true;
                }
                else {
                    panel.setText("");
                    encendida=false;
                }
            }
        });

            bt0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt0.getText().toString());
                    else if (!panel.getText().toString().equals("")) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt0.getText().toString());
                    }
                }
            });

            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt1.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt1.getText().toString());
                    }
                }
            });

            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt2.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt2.getText().toString());
                    }
                }
            });

            bt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt3.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt3.getText().toString());
                    }
                }
            });

            bt4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt4.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt4.getText().toString());
                    }
                }
            });

            bt5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt5.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt5.getText().toString());
                    }
                }
            });
            bt6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt6.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt6.getText().toString());
                    }
                }
            });
            bt7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt7.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt7.getText().toString());
                    }
                }
            });

            bt8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt8.getText().toString());
                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt8.getText().toString());
                    }
                }
            });
            bt9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (panel.getText().toString().equals("0"))
                        panel.setText(bt9.getText().toString());

                    else if (encendida) {
                        historial = panel.getText().toString();
                        panel.setText(historial + bt9.getText().toString());
                        //Toast.makeText(MainActivity.this,panel.getText(),Toast.LENGTH_LONG).show();
                    }
                }
            });


            del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (encendida) {
                        String act;
                        act = panel.getText().toString();
                        act = act.substring(0, act.length() - 1);

                        if (act.length() == 0)
                            panel.setText("0");
                        else
                            panel.setText(act);
                    }
                }
            });

           del.setOnLongClickListener(new View.OnLongClickListener() {
               @Override
               public boolean onLongClick(View v) {
                   panel.setText("0");
                   return false;
               }
           });

            mas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                    if (!esSimbolo(panel.getText().toString())) {
                        historial = panel.getText().toString();
                        panel.setText(historial + mas.getText().toString());
                    }
                }
            });
            menos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                    if (!esSimbolo(panel.getText().toString())) {
                        historial = panel.getText().toString();
                        panel.setText(historial + menos.getText().toString());
                    }
                }
            });
            mult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (encendida)
                    if (!esSimbolo(panel.getText().toString())) {
                        historial = panel.getText().toString();
                        panel.setText(historial + "*");
                    }
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                    if (!esSimbolo(panel.getText().toString()) && !panel.getText().toString().equals("")) {
                        historial = panel.getText().toString();
                        panel.setText(historial + div.getText().toString());
                    }
                }
            });
            punto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                    if (!esSimbolo(panel.getText().toString())) {
                        historial = panel.getText().toString();
                        panel.setText(historial + punto.getText().toString());
                    }
                }
            });

            parent_abrir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida) {
                        if (!panel.getText().toString().equals("0")) {
                            historial = panel.getText().toString();
                            panel.setText(historial + parent_abrir.getText().toString());
                        } else if (panel.getText().toString().equals("0"))
                            panel.setText(parent_abrir.getText().toString());
                    }
                }
            });

            parent_cerrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                        if (!esSimbolo(panel.getText().toString())) {
                            historial = panel.getText().toString();
                            panel.setText(historial + parent_cerrar.getText().toString());
                        }

                }
            });

            porcentaje.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                        if (!esSimbolo(panel.getText().toString())) {
                            historial = panel.getText().toString();
                            panel.setText(historial + porcentaje.getText().toString());
                        }

                }
            });

            raiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                        if (!panel.getText().toString().equals("√")&&!panel.getText().equals("0")) {
                            historial = panel.getText().toString();
                            panel.setText(historial + "sqrt");
                        }
                        else if(panel.getText().equals("0"))
                            panel.setText("sqrt");
                }
            });

            pot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                        if (!esSimbolo(panel.getText().toString())) {
                            historial = panel.getText().toString();
                            panel.setText(historial + pot.getText().toString());
                        }
                }
            });

            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida){
                        if(!esSimbolo(panel.getText().toString())){
                            historial = panel.getText().toString();
                            panel.setText(historial + factorial.getText().toString());
                        }
                    }
                }
            });


            igual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(encendida)
                    if (!(panel.getText().toString().equals("0")) && !panel.getText().toString().equals("")) {
                        //Usar expresion libreria
                        Expression expression = new Expression();


                        expression.setExpressionString(panel.getText().toString());
                        Double h;
                        h = expression.calculate();
                        //Toast.makeText(MainActivity.this,h.toString(),Toast.LENGTH_LONG).show();
                        panel.setText(h.toString());

                    }
                }
            });


    }
    public boolean esSimbolo(String s){
        return ((s.charAt(s.length()-1)=='+'
                || s.charAt(s.length()-1)=='/'
                ||s.charAt(s.length()-1)=='-'
                ||s.charAt(s.length()-1)=='*'
                ||s.charAt(s.length()-1)=='.'
                ||s.charAt(s.length()-1)=='%'
                ||s.charAt(s.length()-1)=='^'
                ||s.charAt(s.length()-1)=='√'
                ));
    }

    public void setUI(){

        bt0 = (Button) findViewById(R.id.button_cero2);
        bt1 = (Button) findViewById(R.id.button_uno);
        bt2 = (Button) findViewById(R.id.button_dos);
        bt3 = (Button) findViewById(R.id.button_tres2);
        bt4 = (Button) findViewById(R.id.button_cuatro);
        bt5 = (Button) findViewById(R.id.button_cinco);
        bt6 = (Button) findViewById(R.id.button_seis);
        bt7 = (Button) findViewById(R.id.button_siete);
        bt8 = (Button) findViewById(R.id.button_ocho);
        bt9 = (Button) findViewById(R.id.button_nueve);

        mas = (Button) findViewById(R.id.button_mas);
        menos = (Button) findViewById(R.id.button_menos);
        div = (Button) findViewById(R.id.button_div2);
        mult = (Button) findViewById(R.id.button_mult);
        factorial = (Button)findViewById(R.id.factorial);

        igual = (Button)findViewById(R.id.button_igual);
        del = (Button)findViewById(R.id.button_del);
        parent_abrir = (Button)findViewById(R.id.parentesis_abre);
        parent_cerrar = (Button)findViewById(R.id.parentesis_cierra);
        porcentaje = (Button)findViewById(R.id.button_porcentaje);
        pot=(Button)findViewById(R.id.pow);
        raiz=(Button) findViewById(R.id.raiz);

        b_on_off = (Button)findViewById(R.id.button_on_off) ;
        punto = (Button) findViewById(R.id.button_punto2);
        panel = (TextView) findViewById(R.id.textView_resultado);
    }
}
