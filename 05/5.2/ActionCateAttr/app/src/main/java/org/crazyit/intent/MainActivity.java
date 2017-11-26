package org.crazyit.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.util.Set;


public class MainActivity extends Activity
{
	// 定义一个Action常量
	final static String CRAZYIT_ACTION =
			"org.crazyit.intent.action.CRAZYIT_ACTION";
	// 定义一个Category常量
	final static String CRAZYIT_CATEGORY =
			"org.crazyit.intent.category.CRAZYIT_CATEGORY";
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button bn = (Button) findViewById(R.id.bn);
		bn.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent intent = new Intent();
				// 设置Action属性
				intent.setAction(MainActivity.CRAZYIT_ACTION);
				// 添加Category属性
				intent.addCategory(MainActivity.CRAZYIT_CATEGORY);
				startActivity(intent);
			}
		});
		Set<String> cates = getIntent().getCategories();
		Toast.makeText(this, cates.toString(), Toast.LENGTH_LONG).show();
	}
}

