package com.example.android_viewpager;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class listen_read2 extends Activity{
	private MediaPlayer mp;
	private TextView tv; 
	private boolean isPaused = false;  
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO 自动生成的方法存根
			super.onCreate(savedInstanceState);
			setContentView(R.layout.listen_read2);
			
			ImageButton ting1 = (ImageButton)findViewById(R.id.ting1);
			ImageButton ting2 = (ImageButton)findViewById(R.id.ting2);  
			
			tv = (TextView)findViewById(R.id.ting4); 
			
			mp = MediaPlayer.create(this,R.raw.ting2);  
			ting1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 try {       
					     if(mp != null)  
					     {  
					      mp.stop();  
					     }      
					     mp.prepare();  
					     mp.start(); 
					     tv.setText("音频播放中..."); 
					    } catch (Exception e) {  
					    	tv.setText("音频发生异常...");  
					    	e.printStackTrace();  
					    	}      
					}        
			}); 
			ting2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 try {       
						 if(mp !=null)  
					     {  
					      mp.stop();  
					      tv.setText("音频停止播放...");  
					     }  
					    } catch (Exception e) {  
					        tv.setText("音频停止发生异常...");  
					     e.printStackTrace();  
					    }  
					      
					   }           
					        });
			 
			mp.setOnCompletionListener(  
			          new MediaPlayer.OnCompletionListener()   
			        {   
			          // @Override   
			          /*覆盖文件播出完毕事件*/ 
			          public void onCompletion(MediaPlayer arg0)   
			          {   
			            try   
			            {   
			              /*解除资源与MediaPlayer的赋值关系  
			               * 让资源可以为其它程序利用*/ 
			              mp.release();   
			              /*改变TextView为播放结束*/ 
			              tv.setText("音频播发结束!");   
			            }   
			            catch (Exception e)   
			            {   
			              tv.setText(e.toString());   
			              e.printStackTrace();   
			            }   
			          }   
			        });  
			mp.setOnErrorListener(new MediaPlayer.OnErrorListener()  
	        {  
	          @Override 
	          /*覆盖错误处理事件*/ 
	          public boolean onError(MediaPlayer arg0, int arg1, int arg2)  
	          {  
	            // TODO Auto-generated method stub  
	            try 
	            {  
	              /*发生错误时也解除资源与MediaPlayer的赋值*/ 
	              mp.release();  
	              tv.setText("播放发生异常!");  
	            }  
	            catch (Exception e)  
	            {  
	              tv.setText(e.toString());   
	              e.printStackTrace();   
	            }   
	            return false;   
	          }   
	        });
}
}