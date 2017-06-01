package la.oja.colgados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarPartidaUnJugador(View v) {
        Intent intento = new Intent(this,JuegoActivity.class);
        startActivity(intento);
    }
}
