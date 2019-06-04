package sg.edu.rp.soi.p07quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView lv;
    ArrayAdapter<String> aa;
    ArrayList <String> al;
    String type ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        lv = findViewById(R.id.lv);

        al = new ArrayList<>();
        al.add("Apple");
        al.add("Ball");
        al.add("Cat");



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        type ="Logcat";
                        break;

                    case 1:
                        type = "Toast";
                        //Toast.makeText(MainActivity.this, "Item Clicked: "+al, Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Logcat")){
                    Log.d("Item Clicked: "+ al.get(position));
                }else{
                    Toast.makeText(MainActivity.this, "Item Clicked: "+al.get(position), Toast.LENGTH_SHORT).show();
                }
            }
        });

        aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al );
        lv.setAdapter(aa);



    }
}
