package com.wizarpos.payment.padui.cashier.activity;

import com.wizarpos.payment.padui.R;
import com.wizarpos.payment.padui.common.BaseViewActivity;
import com.wizarpos.payment.padui.manage.InputPasswordActivity;
import com.wizarpos.payment.padui.manage.OperatorManageActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * 
 * @author hong
 * 收款主界面，包括收款、操作员管理、查询|撤销及设置
 */
public class PaymentChooseMenuActivity extends BaseViewActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
	}
	private void initView(){
		setMainView(R.layout.activity_payment_choose_menu);
		setTitleText("收款");
		findViewById(R.id.btn_cash).setOnClickListener(this);
		findViewById(R.id.btn_manage).setOnClickListener(this);
		findViewById(R.id.btn_query_cancle).setOnClickListener(this);
		findViewById(R.id.btn_setting).setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.btn_cash:
			
			break;
		case R.id.btn_manage:
			startActivity(new Intent(PaymentChooseMenuActivity.this,OperatorManageActivity.class));
			this.finish();
			break;
		case R.id.btn_query_cancle:
			break;
		case R.id.btn_setting:
			startActivity(new Intent(PaymentChooseMenuActivity.this,InputPasswordActivity.class));
			this.finish();
			break;

		default:
			break;
		}
	}
}
