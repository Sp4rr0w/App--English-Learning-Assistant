package com.example.android_viewpager;

import java.util.HashMap;






import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

	public class DanciFayin extends Activity{
		private SoundPool soundpool;	//����һ��SoundPool����
		private HashMap<Integer, Integer> soundmap = new HashMap<Integer, Integer>();	//����һ��HashMap����

			@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO �Զ����ɵķ������
				super.onCreate(savedInstanceState);
				setContentView(R.layout.danc);
				
				Button ruler = (Button) findViewById(R.id.ruler_fayin);
				//Button pen = (Button) findViewById(R.id.pen_fayin);
				//Button pencil = (Button) findViewById(R.id.pencil_fayin);
				//Button eraser = (Button) findViewById(R.id.eraser_fayin);
				//Button crayon = (Button) findViewById(R.id.crayon_fayin);
				soundpool = new SoundPool(2,
						AudioManager.STREAM_SYSTEM, 0);	//����һ��SoundPool���󣬸ö����������5����Ƶ��
				soundmap.put(1, soundpool.load(this, R.raw.ruler, 1));
				
				
				ruler.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						soundpool.play(soundmap.get(1), 1, 1, 0, 0, 1);	//����ָ������Ƶ
					}
				});
				
}
			/*@Override
			public boolean onKeyDown(int keyCode, KeyEvent event) {
				//soundpool.play(soundmap.get(5), 1, 1, 0, 0, 1);		
				//return true;
				if (keyCode == KeyEvent.KEYCODE_BACK) {
				      //Toast.makeText(this, "���˼�", Toast.LENGTH_SHORT).show();
					Intent intent=new Intent(DanciFayin.this,DanciList2.class);
					//intent.setAction("aaa.bbb.ccc");
					intent.addCategory("android.intent.category.DEFAULT");
					startActivity(intent);
				      return false;}
				else if (keyCode == KeyEvent.KEYCODE_HOME) {
				      Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
				      return true;
				    }
				return super.onKeyDown(keyCode, event);
				//return true;
			}*/
			
}