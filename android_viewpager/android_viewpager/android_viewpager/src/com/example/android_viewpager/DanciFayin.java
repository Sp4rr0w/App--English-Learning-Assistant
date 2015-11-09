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
			private String content="你好";
			@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO 自动生成的方法存根
				super.onCreate(savedInstanceState);
				setContentView(R.layout.danc);
				/*
				 * 第二个页面什么时候给第一个页面传数据：点击button
				 * 回传到第一个页面的实际上是一个Intent对象
				 * */
				/*bt1=(Button) findViewById(R.id.button1);
				bt1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO 自动生成的方法存根
						Intent data=new Intent();//只是回传数据，不指定目标了。
						data.putExtra("data", content);
						setResult(2,data);//返回码是2
						finish();
					}
				});*/
}
}