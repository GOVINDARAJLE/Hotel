package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CheckBox pizza,dosa,tea,panipuri,coffe,samosa;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        pizza=(CheckBox) findViewById(R.id.pizza);
        tea=(CheckBox) findViewById(R.id.tea);
        coffe=(CheckBox) findViewById(R.id.coffe);
        dosa=(CheckBox) findViewById(R.id.dosa);
        panipuri=(CheckBox) findViewById(R.id.panipuri);
        samosa=(CheckBox) findViewById(R.id.samosa);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int totalamount=0;
            StringBuilder result=new StringBuilder();
            result.append("selected Items");

            if (pizza.isChecked()){
                result.append("\nPizza 100Rs");
                totalamount+=100;
            }
            if (tea.isChecked()){
                result.append("\nTea 10Rs");
                totalamount+=10;
            }
            if (coffe.isChecked()){
                result.append("\nCoffe 60Rs");
                totalamount+=60;
            }
            if (dosa.isChecked()){
                result.append("\nDosa 30Rs");
                totalamount+=30;
            }
            if (panipuri.isChecked()){
                result.append("\nPanipuri 40Rs");
                totalamount+=40;
            }
            if (samosa.isChecked()){
                result.append("\nSamosa 10Rs");
                totalamount+=10;
            }
            result.append("\nTotal: "+totalamount+"Rs");

            Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
        }
    });


    }
}
