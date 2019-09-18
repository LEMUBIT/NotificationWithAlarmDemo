package com.lemubit.lemuel.notificationwithalarmdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class BroadcastNotify extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "lemubitNotify")
                .setSmallIcon(R.drawable.ic_add_alert_black_24dp)
                .setContentTitle("Lemubit Academy Alarm notification")
                .setContentText("Hey students, this is an awesome alarm notification...")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);


        notificationManager.notify(101, builder.build());
    }
}
