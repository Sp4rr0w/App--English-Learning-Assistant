package com.example.android_viewpager;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

	public class DanciList2 extends Activity{
		private Button bt1;
		private Button bt2;
		private Button bt3;
		private Button bt4;
		private Button bt5;
		
		private String content="���";
		Button mBtnShareToSina;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO �Զ����ɵķ������
			super.onCreate(savedInstanceState);
			setContentView(R.layout.danci);
			/*
			 * �ڶ���ҳ��ʲôʱ�����һ��ҳ�洫���ݣ����button
			 * �ش�����һ��ҳ���ʵ������һ��Intent����
			 * */
			/*bt1=(Button) findViewById(R.id.button1);
			bt1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO �Զ����ɵķ������
					Intent data=new Intent();//ֻ�ǻش����ݣ���ָ��Ŀ���ˡ�
					data.putExtra("data", content);
					setResult(2,data);//��������2
					finish();
				}
			});*/
			bt2=(Button) findViewById(R.id.Button2);
			bt3=(Button) findViewById(R.id.Button3);
			bt4=(Button) findViewById(R.id.Button4);
			bt5=(Button) findViewById(R.id.Button5);
			
			bt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO �Զ����ɵķ������
					/*
					 * ��һ�������������Ķ���this
					 * �ڶ���������Ŀ���ļ�
					 * */
					Intent intent=new Intent(DanciList2.this,DanciFayin.class);
					//intent.setAction("aaa.bbb.ccc");
					intent.addCategory("android.intent.category.DEFAULT");
					startActivity(intent);
					
				}
			});
			bt3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO �Զ����ɵķ������
					/*
					 * ��һ�������������Ķ���this
					 * �ڶ���������Ŀ���ļ�
					 * */
					Intent intent=new Intent(DanciList2.this,DanciFayin2_pen.class);
					//intent.setAction("aaa.bbb.ccc");
					intent.addCategory("android.intent.category.DEFAULT");

					startActivity(intent);
					
				}
			});
			bt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO �Զ����ɵķ������
					/*
					 * ��һ�������������Ķ���this
					 * �ڶ���������Ŀ���ļ�
					 * */
					Intent intent=new Intent(DanciList2.this,DanciFayin3_pencil.class);
					//intent.setAction("aaa.bbb.ccc");
					intent.addCategory("android.intent.category.DEFAULT");

					startActivity(intent);
					
				}
			});
			bt5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO �Զ����ɵķ������
		/*
		 * ��һ�������������Ķ���this
		 * �ڶ���������Ŀ���ļ�
		 * */
		Intent intent=new Intent(DanciList2.this,DanciFayin4_eraser.class);
		//intent.setAction("aaa.bbb.ccc");
		intent.addCategory("android.intent.category.DEFAULT");

		startActivity(intent);
		
	}
});
			
			ShareSDK.initSDK(getApplicationContext());
			mBtnShareToSina=(Button) this.findViewById(R.id.share_sina);
			mBtnShareToSina.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// һ������
					OnekeyShare oneKeyShare=new OnekeyShare();
					oneKeyShare.setTitle("Ӣ��ѧϰ���ַ���");
					oneKeyShare.setText("��ѧϰӢ����?��Ӣ��ѧϰ����APP!");
					//oneKeyShare.setImagePath("");
					//��ʾ�����б�
					oneKeyShare.show(DanciList2.this);
				
				}
			});
		}
		@Override
		public boolean onKeyDown(int keyCode, KeyEvent event) {
			//soundpool.play(soundmap.get(5), 1, 1, 0, 0, 1);		//���Ű�����
			//return true;
			if (keyCode == KeyEvent.KEYCODE_BACK) {
			      //Toast.makeText(this, "���˼�", Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(DanciList2.this,MainActivity.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			      return false;}
			else if (keyCode == KeyEvent.KEYCODE_HOME) {
			      Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
			      return true;
			    }
			return super.onKeyDown(keyCode, event);
		}
	}
