package diana.soleil.timestableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    ListView listView;
    ArrayList<Integer> arrayList;
    ArrayAdapter<Integer> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        listView = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<Integer>();
        seekBar.setMin(1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                arrayList.clear();
                for (int l=1;l<10;l++) {
                    int newList = i*l;
                    arrayList.add(newList);
                };
                arrayAdapter = new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);

                listView.setAdapter(arrayAdapter);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}