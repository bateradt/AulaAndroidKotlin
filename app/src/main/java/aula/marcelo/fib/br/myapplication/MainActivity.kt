package aula.marcelo.fib.br.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_novo.*

import java.util.logging.Logger

class MainActivity : AppCompatActivity() { //, View.onClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_novo)

        var vlrDolar = 3.83
        var vlrRublo = 0.058
        var vlrEuro = 4.34
        var vlrPesoChi = 0.0057
        var vlrPesoCuba = 3.83
        var vlrFranco = 3.84

        var btnDolar = btn_Dolar
        var btnEuro = btn_Euro
        var btnPesoChileno = btn_PesoChileno
        var btnPesoCubano = btn_PesoCubano
        var btnFranco = btn_Franco
        var btnRublo = btn_Rublo

        var txtResultado = txt_resultado
        var edtValor = edt_valorconversao

        //btnDolar.setOnClickListener()

        btnDolar.setOnClickListener {
            //Toast.makeText(this, "Ola click", Toast.LENGTH_LONG).show()

           txtResultado.setText("Valor em " + btnDolar.text +  " = " + calculaConversao(edtValor.text.toString().toDouble(), vlrDolar));
        }

        btnEuro.setOnClickListener {
            txtResultado.setText("Valo em " + btnEuro.text +  " = " + calculaConversao(edtValor.text.toString().toDouble(), vlrEuro));
        }

        btnPesoChileno.setOnClickListener {
            txtResultado.setText("Valo em " + btnPesoChileno.text +  " = " + calculaConversao(edtValor.text.toString().toDouble(), vlrPesoChi));
        }

        btnPesoCubano.setOnClickListener {
            txtResultado.setText("Valo em " + btnPesoCubano.text +  " = " + calculaConversao(edtValor.text.toString().toDouble(), vlrPesoCuba));
        }

        btnFranco.setOnClickListener {
            txtResultado.setText("Valo em " + btnFranco.text +  " = " +calculaConversao(edtValor.text.toString().toDouble(), vlrFranco));
        }

        btnRublo.setOnClickListener {
            txtResultado.setText("Valo em " + btnRublo.text +  " = " + calculaConversao(edtValor.text.toString().toDouble(), vlrRublo));
        }

        btn_TodosValores.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)

            var vlConvertido = "Valor em Dolar " + calculaConversao(edtValor.text.toString().toDouble(), vlrDolar)
            vlConvertido =  vlConvertido +  "\n Valor em Euro " + calculaConversao(edtValor.text.toString().toDouble(), vlrEuro)
            vlConvertido =  vlConvertido + "\n Valor em Peso Chileno " + calculaConversao(edtValor.text.toString().toDouble(), vlrPesoChi)
            vlConvertido =  vlConvertido + "\n Valor em Peso Cubano " + calculaConversao(edtValor.text.toString().toDouble(), vlrPesoCuba)
            vlConvertido = vlConvertido + "\n Valor em Franco Suiço " + calculaConversao(edtValor.text.toString().toDouble(), vlrFranco)
            vlConvertido = vlConvertido + "\n Valor em Rublo " + calculaConversao(edtValor.text.toString().toDouble(), vlrRublo)

            intent.putExtra("valores", vlConvertido)

            startActivity(intent)

        }


        Logger.getLogger(MainActivity::class.java.name).info("Teste com log cat");
        Log.d("aula", "Ola log modo debug");
    }

    fun calculaConversao(pValor : Double, pValorConversao : Double) : Double {
      return pValor / pValorConversao;
    }

    //inner class BotoesClicks : View.OnClickListener {
    //    override fun onClick(v: View?) {
    //    if (R.id.btn_Dolar == v.id) {

    //    }


      //  }
   // }


    //override fun onClick(p0: View?) {
    //    Toast.makeText(this, "Ola click", Toast.LENGTH_LONG).show()
    //}


    override fun onStart() {
        Log.i("Metodo", "Passou no método onStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("Metodo", "Passou no método onRestart")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("Metodo", "Passou no método onRestart");
        super.onResume()
    }

    override fun onPause() {
        Log.i("Metodo", "Passou no método onPause");
        super.onPause()
    }

    override fun onStop() {
        Log.i("Metodo", "Passou no método onStop");
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Metodo", "Passou no método onDestroy");
        super.onDestroy()
    }

}
