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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        lv = findViewById(R.id.lv);

        al = new ArrayList<>();




        aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al );
        lv.setAdapter(aa);



    }
}
