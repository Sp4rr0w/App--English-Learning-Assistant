package com.example.android_viewpager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class kewen extends Activity {
	private Button btkw1;
	private Button btkw2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kewen);
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
		
		btkw1=(Button) findViewById(R.id.kewenButton1);
		btkw2=(Button) findViewById(R.id.kewenButton2);
		
		btkw1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				/*
				 * ��һ�������������Ķ���this
				 * �ڶ���������Ŀ���ļ�
				 * */
				Intent intent=new Intent(kewen.this,kewen1.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});
		btkw2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				/*
				 * ��һ�������������Ķ���this
				 * �ڶ���������Ŀ���ļ�
				 * */
				Intent intent=new Intent(kewen.this,kewen2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});

}}
