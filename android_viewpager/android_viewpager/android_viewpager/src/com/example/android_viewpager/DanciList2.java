package com.example.android_viewpager;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

	public class DanciList2 extends Activity{
		private Button bt1;
		private Button bt2;
		private String content="你好";
		Button mBtnShareToSina;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO 自动生成的方法存根
			super.onCreate(savedInstanceState);
			setContentView(R.layout.danci);
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
			bt2=(Button) findViewById(R.id.Button2);
			bt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO 自动生成的方法存根
					/*
					 * 第一个参数：上下文对象this
					 * 第二个参数：目标文件
					 * */
					Intent intent=new Intent(DanciList2.this,DanciFayin.class);
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
					// 一键分享
					OnekeyShare oneKeyShare=new OnekeyShare();
					oneKeyShare.setTitle("英语学习助手分享");
					oneKeyShare.setText("想学习英语吗?来英语学习助手APP!");
					//oneKeyShare.setImagePath("");
					//显示分享列表
					oneKeyShare.show(DanciList2.this);
				
				}
			});
		}
	}
