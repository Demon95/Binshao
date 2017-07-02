package com.farm.MainActivity;

import com.farm.data.DataQueue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * 
 * @ClassName: AlarmReceiver
 * @Description: ????????????????????????????????��?????????
 * @author HuHood
 * @date 2013-11-25 ????4:44:30
 * 
 */
public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String data = "ER";
		if (intent.getAction().equals("Demo01")) {

			data = intent.getStringExtra("data");
			DataQueue.getInstance().addElement(data);
			Toast.makeText(context, "?????????" + data, 0).show();
			Log.d("Farm", "????????????" + data);
		}
	}

}