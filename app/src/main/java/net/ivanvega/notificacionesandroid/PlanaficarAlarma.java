package net.ivanvega.notificacionesandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PlanaficarAlarma extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarma repetida", Toast.LENGTH_LONG).
                show();
    }


}
