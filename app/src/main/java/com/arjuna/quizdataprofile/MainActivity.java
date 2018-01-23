package com.arjuna.quizdataprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etnama, etemail, etaalamat, ettelepon;
    Button btnhasil;
    TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText)findViewById(R.id.etnama);
        etemail = (EditText)findViewById(R.id.etemail);
        etaalamat = (EditText)findViewById(R.id.etaalamat);
        ettelepon = (EditText)findViewById(R.id.ettelpon);
        btnhasil = (Button) findViewById(R.id.btnhasil);
        txthasil = (TextView) findViewById(R.id.txthasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nnama = etnama.getText().toString();
                String nemail = etemail.getText().toString();
                String ntelp = ettelepon.getText().toString();
                String nalamat = etaalamat.getText().toString();


                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nnama.isEmpty()){
                    //memberikan warning berupa eror
                    etnama.setError("FullName is not Empty");
                }else if (nemail.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etemail.setError("Email is not empty");
                }else if (ntelp.isEmpty()){
                    ettelepon.setError("Phone is not empty");
                }else if (nalamat.isEmpty()){
                    etaalamat.setError("Address is not empty");

                }else {

                    txthasil.setText("Nama :" + nnama + "\nEmail : " + nemail + "\nPhone :" + ntelp + "\nAddress : " + nalamat);
                }
            }
        });
    }
}
