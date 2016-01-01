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
			// TODO �Զ����ɵķ������
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
					     tv.setText("��Ƶ������..."); 
					    } catch (Exception e) {  
					    	tv.setText("��Ƶ�����쳣...");  
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
					      tv.setText("��Ƶֹͣ����...");  
					     }  
					    } catch (Exception e) {  
					        tv.setText("��Ƶֹͣ�����쳣...");  
					     e.printStackTrace();  
					    }  
					      
					   }           
					        });
			 
			mp.setOnCompletionListener(  
			          new MediaPlayer.OnCompletionListener()   
			        {   
			          // @Override   
			          /*�����ļ���������¼�*/ 
			          public void onCompletion(MediaPlayer arg0)   
			          {   
			            try   
			            {   
			              /*�����Դ��MediaPlayer�ĸ�ֵ��ϵ  
			               * ����Դ����Ϊ������������*/ 
			              mp.release();   
			              /*�ı�TextViewΪ���Ž���*/ 
			              tv.setText("��Ƶ��������!");   
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
	          /*���Ǵ������¼�*/ 
	          public boolean onError(MediaPlayer arg0, int arg1, int arg2)  
	          {  
	            // TODO Auto-generated method stub  
	            try 
	            {  
	              /*��������ʱҲ�����Դ��MediaPlayer�ĸ�ֵ*/ 
	              mp.release();  
	              tv.setText("���ŷ����쳣!");  
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