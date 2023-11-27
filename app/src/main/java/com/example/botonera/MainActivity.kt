package com.example.botonera

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var boton_1: FloatingActionButton
    lateinit var boton_2: FloatingActionButton
    lateinit var boton_3: FloatingActionButton
    lateinit var boton_4: FloatingActionButton
    lateinit var boton_5: FloatingActionButton
    lateinit var boton_6: FloatingActionButton
    lateinit var boton_7: FloatingActionButton
    lateinit var boton_8: FloatingActionButton
    lateinit var boton_9: FloatingActionButton
    lateinit var boton_10: FloatingActionButton
    lateinit var boton_11: FloatingActionButton
    lateinit var boton_12: FloatingActionButton
    lateinit var boton_13: FloatingActionButton
    lateinit var boton_14: FloatingActionButton
    lateinit var boton_15: FloatingActionButton
    lateinit var boton_16: FloatingActionButton
    lateinit var boton_17: FloatingActionButton
    lateinit var boton_18: FloatingActionButton
    lateinit var boton_19: FloatingActionButton
    lateinit var boton_20: FloatingActionButton
    lateinit var boton_21: FloatingActionButton
    lateinit var boton_22: FloatingActionButton
    lateinit var boton_23: FloatingActionButton
    lateinit var boton_24: FloatingActionButton

    var media: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_1 = findViewById(R.id.boton_1)
        boton_2 = findViewById(R.id.boton_2)
        boton_3 = findViewById(R.id.boton_3)
        boton_4 = findViewById(R.id.boton_4)
        boton_5 = findViewById(R.id.boton_5)
        boton_6 = findViewById(R.id.boton_6)
        boton_7 = findViewById(R.id.boton_7)
        boton_8 = findViewById(R.id.boton_8)
        boton_9 = findViewById(R.id.boton_9)
        boton_10 = findViewById(R.id.boton_10)
        boton_11 = findViewById(R.id.boton_11)
        boton_12 = findViewById(R.id.boton_12)
        boton_13 = findViewById(R.id.boton_13)
        boton_14 = findViewById(R.id.boton_14)
        boton_15 = findViewById(R.id.boton_15)
        boton_16 = findViewById(R.id.boton_16)
        boton_17 = findViewById(R.id.boton_17)
        boton_18 = findViewById(R.id.boton_18)
        boton_19 = findViewById(R.id.boton_19)
        boton_20 = findViewById(R.id.boton_20)
        boton_21 = findViewById(R.id.boton_21)
        boton_22 = findViewById(R.id.boton_22)
        boton_23 = findViewById(R.id.boton_23)
        boton_24 = findViewById(R.id.boton_24)


        boton_1.setOnClickListener {
            stop()
            play(R.raw.marcha_peronista)
        }
        boton_2.setOnClickListener {
            stop()
            play(R.raw.juez_pueblo_de_mierda)
        }
        boton_3.setOnClickListener {
            stop()
            play(R.raw.marra_porno)
        }
        boton_4.setOnClickListener {
            stop()
            play(R.raw.juntos_por_el_ano)
        }
        boton_5.setOnClickListener {
            stop()
            play(R.raw.milei_estado_pedofilo)
        }
        boton_6.setOnClickListener {
            stop()
            play(R.raw.moreno_que_les_pasa)
        }
        boton_7.setOnClickListener {
            stop()
            play(R.raw.cristina_1)
        }
        boton_8.setOnClickListener {
            stop()
            play(R.raw.cristina_2)
        }
        boton_9.setOnClickListener {
            stop()
            play(R.raw.cristina_3)
        }
        boton_10.setOnClickListener {
            stop()

            play(R.raw.estamos_mejor_que_nunca)
        }
        boton_11.setOnClickListener {
            stop()

            play(R.raw.hasta_aca_llegaste)
        }
        boton_12.setOnClickListener {
            stop()
            play(R.raw.viejos_meados)
        }
        boton_13.setOnClickListener {
            stop()
            play(R.raw.gatito_mimoso)
        }
        boton_14.setOnClickListener {
            stop()
            play(R.raw.no_discuto_con_casta)
        }
        boton_15.setOnClickListener {
            stop()
            play(R.raw.secuestran_chicos)
        }
        boton_16.setOnClickListener {
            stop()
            play(R.raw.te_tengo_pena)
        }
        boton_17.setOnClickListener {
            stop()
            play(R.raw.ya_lo_vas_a_entender)
        }
        boton_18.setOnClickListener {
            stop()
            play(R.raw.muy_interesante)
        }
        boton_19.setOnClickListener {
            stop()
            play(R.raw.habla_demasiado)
        }
        boton_20.setOnClickListener {
            stop()
            play(R.raw.me_dijo_que_me_iba_a_matar)
        }
        boton_21.setOnClickListener {
            stop()
            play(R.raw.no_soy_malo)
        }
        boton_22.setOnClickListener {
            stop()
            play(R.raw.abrupto)
        }
        boton_23.setOnClickListener {
            stop()
            play(R.raw.hey)
        }
        boton_24.setOnClickListener {
            stop()
            play(R.raw.la_droga_es_importante)
        }
    }
    fun play(audio: Int) {
        if (media == null) {
            media = MediaPlayer.create(this, audio)
            media!!.start()
        }
    }

    fun stop() {
        if (media != null) {
            media!!.stop()
            media!!.release()
            media = null
        }
    }

}