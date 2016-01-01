package com.example.android_viewpager;

import java.util.ArrayList;
import java.util.List;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnPageChangeListener{

	private ViewPager pager;
	private List<View>viewList;
	private List<String>titleList;
	private PagerTabStrip tab;
	//private List<Fragment>fragList;
	private Button view1_bt1;
	private Button view1_bt2;
	private Button view1_bt3;
	
	private Button view2_bt1;
	private Button view2_bt2;
	private Button view2_bt3;
	
	private Button view3_bt1;
	private Button view3_bt2;
	private Button view3_bt3;

	private Context mContext;
	Button mBtnShareToSina;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        
		

		/*ShareSDK.initSDK(getApplicationContext());
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
				oneKeyShare.show(MainActivity.this);
			
			}
		});*/
        

       /* mContext=this;
        bt1=(Button) findViewById(R.id.button11);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				
				 //* 第一个参数：上下文对象this
				 //* 第二个参数：目标文件
				 //* 
				Intent intent=new Intent(mContext,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				//intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});*/
		View view1 = View.inflate(this, R.layout.view1, null);
        View view2 = View.inflate(this, R.layout.view2, null);
        View view3 = View.inflate(this, R.layout.view3, null);
        
		viewList=new ArrayList<View>();
		viewList.add(view1);
		viewList.add(view2);
		viewList.add(view3);
		
		titleList=new ArrayList<String>();
		titleList.add("单词");
		titleList.add("课文");
		titleList.add("双语听力教学");
		
		tab=(PagerTabStrip) findViewById(R.id.tab);
		tab.setBackgroundColor(Color.GRAY);
		tab.setTabIndicatorColor(Color.BLUE);
		tab.setDrawFullUnderline(false);
		tab.setTextColor(Color.GREEN);
		
		
		pager=(ViewPager) findViewById(R.id.pager);
		MyViewPagerAdapter adapter=new MyViewPagerAdapter(viewList, titleList);
		pager.setAdapter(adapter);
		
		view1_bt1=(Button) view1.findViewById(R.id.button11);
		view1_bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view1_bt2=(Button) view1.findViewById(R.id.view1_two);
		view1_bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view1_bt3=(Button) view1.findViewById(R.id.view1_three);
		view1_bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view2_bt1=(Button) view2.findViewById(R.id.view2_one);
		view2_bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,kewen.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view2_bt2=(Button) view2.findViewById(R.id.view2_two);
		view2_bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,kewen.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view2_bt3=(Button) view2.findViewById(R.id.view2_three);
		view2_bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,kewen.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		
		
		
		view3_bt1 = (Button) view3.findViewById(R.id.view3_one);
		view3_bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,listen_read1.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		view3_bt2 = (Button) view3.findViewById(R.id.view3_two);
		view3_bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,listen_read2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		
		view3_bt3 = (Button) view3.findViewById(R.id.view3_three);
		view3_bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,listen_read3.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		
		
		
		/*fragList=new ArrayList<Fragment>();
		fragList.add(new Fragment1());
		fragList.add(new Fragment2());
		fragList.add(new Fragment3());*/
	
//		MyFragmentPagerAdapter adapter2=new MyFragmentPagerAdapter(getSupportFragmentManager(), fragList, titleList);
//		pager.setAdapter(adapter2);		
		
//		
//		MyFragmentPagerAdapter2 adapter3=new MyFragmentPagerAdapter2(getSupportFragmentManager(), fragList, titleList);
//		pager.setAdapter(adapter3);	
		pager.setOnPageChangeListener(this);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
	
		Toast.makeText(this, "这是第"+(arg0+1)+"个界面", Toast.LENGTH_SHORT).show();
	}

	/*@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		//soundpool.play(soundmap.get(5), 1, 1, 0, 0, 1);		//播放按键音
		//return true;
		if (keyCode == KeyEvent.KEYCODE_BACK) {
		     Toast.makeText(this, "后退键", Toast.LENGTH_SHORT).show();
			
		      return false;}
		else if (keyCode == KeyEvent.KEYCODE_HOME) {
		      Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
		      return true;
		    }
		return super.onKeyDown(keyCode, event);
	}*/

}
