package com.example.android_viewpager;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyViewPagerAdapter extends PagerAdapter{

	private List<View>viewList;
	private List<String>titleList;
	
	public MyViewPagerAdapter(List<View>viewList,List<String>titleList)
	{
		this.viewList=viewList;
		this.titleList=titleList;
	}
	
	//����������ͼ������
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewList.size();
	}
  
	//�ж���ͼ�Ƿ��ɶ������
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0==arg1;
	}
	
	//ʵ����ҳ��
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
    	// TODO Auto-generated method stub
    	container.addView(viewList.get(position));
    	return viewList.get(position);
    }
    
    //ɾ��ҳ��
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    	// TODO Auto-generated method stub
    	container.removeView(viewList.get(position));
    }
    
    @Override
    public CharSequence getPageTitle(int position) {
    	// TODO Auto-generated method stub
    	return titleList.get(position);
    }

}
