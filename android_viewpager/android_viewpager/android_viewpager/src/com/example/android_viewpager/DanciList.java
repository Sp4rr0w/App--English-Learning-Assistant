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
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		/*
		 * 通过点击button1实现页面之间的跳转
		 * 1startActivity的方式来实现
		 * 初始化Intent
		 * */
		/*bt1=(Button) findViewById(R.id.button11);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				
				 * 第一个参数：上下文对象this
				 * 第二个参数：目标文件
				 * 
				Intent intent=new Intent(DanciList.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});*/
		/*
		 * 通过startActivityForresult
		 * */
		
	}
	
}
