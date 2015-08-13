package com.example.papaya.calculadora;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private Button bAC,bCE;
    private Button bMas,bMenos,bPor,bDiv,bIgu;

    private int cantOperaAnt;
    private int contadorCE;

    private boolean hayOperadorAnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorCE=0;
        cantOperaAnt = 0;

        hayOperadorAnt = false;

        b1 = (Button) findViewById(R.id.btnUno);
        b2 = (Button) findViewById(R.id.btnDos);
        b3 = (Button) findViewById(R.id.btnTres);
        b4 = (Button) findViewById(R.id.btnCuatro);
        b5 = (Button) findViewById(R.id.btnCinco);
        b6 = (Button) findViewById(R.id.btnSeis);
        b7 = (Button) findViewById(R.id.btnSiete);
        b8 = (Button) findViewById(R.id.btnOcho);
        b9 = (Button) findViewById(R.id.btnNueve);
        b0 = (Button) findViewById(R.id.btnCero);

        bAC = (Button) findViewById(R.id.btnAC);
        bCE = (Button) findViewById(R.id.btnCE);


        bIgu.setOnClickListener(this);

        EditText texto = (EditText) findViewById(R.id.editText);
        texto.setKeyListener(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view)
    {
        CharSequence text1 = "!No pueden ingresar dos operadores!";
        if(view.getId() == R.id.btnUno)
        {


                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"1");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;

        }

        else if(view.getId() == R.id.btnDos)
        {


            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"2");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }

        else if(view.getId() == R.id.btnTres)
        {


                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"3");
            hayOperadorAnt = false;
            int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;

        }
        else if(view.getId() == R.id.btnCuatro)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"4");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnCinco)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"5");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnSeis)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"6");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnSiete)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"7");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnOcho)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"8");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnNueve)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"9");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }
        }
        else if(view.getId() == R.id.btnCero)
        {
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+"0");
                hayOperadorAnt = false;
                int temp = cantOperaAnt;
                cantOperaAnt = (temp-1<0)?cantOperaAnt:cantOperaAnt--;
            }

        }

        else if(view.getId() == R.id.btnAC)
        {
            EditText text = (EditText)findViewById(R.id.editText);
            text.setText("");
            hayOperadorAnt = false;
        }

        else if(view.getId() == R.id.btnCE)
        {
            EditText text = (EditText)findViewById(R.id.editText);
            String campo = text.getText().toString();
            String nuevoCampo = campo.substring(0,campo.length()-1);
            text.setText(nuevoCampo);

        }

        else if(view.getId() == R.id.btnPlus)
        {
            if(hayOperadorAnt)
            {
                excepcion(text1);
            }

            else
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+" + ");
                hayOperadorAnt = true;
            }
        }

        else if(view.getId() == R.id.btnMinus)
        {
            if(hayOperadorAnt)
            {
                excepcion(text1);
            }
            else
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+" - ");
                hayOperadorAnt = true;
            }
        }

        else if(view.getId() == R.id.btnMulp)
        {
            if(hayOperadorAnt)
            {
                excepcion(text1);
            }
            else
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+" * ");
                hayOperadorAnt = true;
            }
        }

        else if(view.getId() == R.id.btnDiv)
        {
            if(hayOperadorAnt)
            {
                excepcion(text1);
            }
            else
            {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText(text.getText()+" / ");
                hayOperadorAnt = true;
            }
        }

        else if(view.getId() == R.id.btnIgual){
            TextView text = (TextView)findViewById(R.id.txtResultado);
            EditText entrada = (EditText)findViewById(R.id.editText);
            try{
                char caracter = entrada.getText().toString().charAt(1);
                if (caracter =='+'||caracter =='-'||caracter =='*'||caracter =='/'){
                    CharSequence text2 ="La operación no puede iniciar con un operador";
                    excepcion(text2);
                }
                else {
                text.setText("Resultado: "+resultado(entrada.getText().toString()));
                entrada.setText("");
                contadorCE=0;
                cantOperaAnt=0;
                }
            }
            catch (NumberFormatException e)
            {

            }
        }
    }

    public void excepcion(CharSequence text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public int resultado(String cadena)
    {
        String[] datos = cadena.split(" ");
        CharSequence text3="Operación Inválida";
        int operaciones = datos.length/2;
        int parcial=0;
        parcial = Integer.parseInt(datos[0]);


        for (int i = 1; i < operaciones+1;i++)
        {
            String operacion = datos[2*i-1];
            int operador=0;
            try
            {
                operador = Integer.parseInt(datos[2*i]);
            }
            catch (NumberFormatException e)
            {
                excepcion(text3);
            }

            if(operacion.equals("+"))
            {
                parcial+=operador;
            }

            else if(operacion.equals("-"))
            {
                parcial-=operador;
            }

            else if(operacion.equals("*")) {
                parcial*= operador;
            }

            else
            {
                parcial/=operador;
            }
        }
        return parcial;
    }
}
