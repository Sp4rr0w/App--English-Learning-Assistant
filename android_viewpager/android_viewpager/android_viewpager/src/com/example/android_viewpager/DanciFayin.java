package com.example.android_viewpager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

	public class DanciFayin extends Activity{
			private Button bt1;
			//private Button bt2;
			private String content="���";
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO �Զ����ɵķ������
				super.onCreate(savedInstanceState);
				setContentView(R.layout.danc);
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
}
}