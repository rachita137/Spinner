package tatastrive.application.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;
    TextView t1;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        spinner1 = findViewById( R.id.planets_spinner );
        spinner1.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

s=adapterView.getItemAtPosition(i).toString();
               Toast.makeText( MainActivity.this, "display item:  "+s+ "Item Position:  "+i, Toast.LENGTH_SHORT ).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        } );
    }
}
