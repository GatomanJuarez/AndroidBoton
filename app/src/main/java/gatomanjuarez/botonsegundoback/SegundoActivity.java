package gatomanjuarez.botonsegundoback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jeobal on 02/05/2017.
 */
public class SegundoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
