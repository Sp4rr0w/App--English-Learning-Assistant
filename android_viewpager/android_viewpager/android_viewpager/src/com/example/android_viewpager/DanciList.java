package com.example.android_viewpager;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DanciList extends MainActivity{
	private Button bt1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		/*
		 * ͨ�����button1ʵ��ҳ��֮�����ת
		 * 1startActivity�ķ�ʽ��ʵ��
		 * ��ʼ��Intent
		 * */
		/*bt1=(Button) findViewById(R.id.button11);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				
				 * ��һ�������������Ķ���this
				 * �ڶ���������Ŀ���ļ�
				 * 
				Intent intent=new Intent(DanciList.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});*/
		/*
		 * ͨ��startActivityForresult
		 * */
		
	}
	
}
