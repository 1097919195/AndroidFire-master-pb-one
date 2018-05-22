package com.jaydenxiao.androidfire.ui.main.contract;

import com.alibaba.fastjson.JSONObject;
import com.jaydenxiao.androidfire.bean.BkDept;
import com.jaydenxiao.androidfire.bean.BkDeptData;
import com.jaydenxiao.androidfire.bean.BkInfo;
import com.jaydenxiao.androidfire.bean.BkOrderData;
import com.jaydenxiao.androidfire.bean.BkSearchData;
import com.jaydenxiao.androidfire.bean.BkSendData;
import com.jaydenxiao.androidfire.bean.BkTSendData;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import rx.Observable;

/**
 * 虚拟信箱Contract
 * Created by yyh on 2017-05-27.
 */

public interface VirtualBoxesContract {

    interface Model extends BaseModel {
        Observable<JSONObject> getAllDeptData();

        Observable<BkDeptData> getBkDeptData(int deptBox);

        Observable<BkSearchData> getBkSearchData(String bkName,String domesticPostCode,int category,int year, int pageNumber,int pageSize);

        Observable<BkSendData> getBkSendData(int category,int year,String domesticPostCode);

        Observable<BkOrderData> getBkOrderData(int orderId);

        Observable<JSONObject> getdisplayData(int idint,int eAddrint,int valueint);

        Observable<BkTSendData> getTSendData();
    }

    interface View extends BaseView {
        void returngetAllDeptData(JSONObject jsonObject);

        void returngetBkDeptData(BkDeptData bkDeptData);

        void returngetBkSearchData(BkSearchData bkSearchData);

        void returngetBkSendData(BkSendData bkSendData);

        void returngetBkOrderData(BkOrderData bkOrderData);

        void returngetdisplayData(String result);

        void returngetTSendData(BkTSendData bkTSendData);
    }

    abstract static class Presenter extends BasePresenter<View, Model> {
        public abstract void getAllDeptDataRequest();

        public abstract void getBkDeptDataRequest(int deptBox);

        public abstract void getBkSearchDataRequest(String bkName,String domesticPostCode,int category,int year, int pageNumber,int pageSize);

        public abstract void getBkSendDataRequest(int category,int year,String domesticPostCode);

        public abstract void getBkOrderDataRequest(int orderId);

        public abstract void getdisplayDataRequest(int idint,int eAddrint,int valueint);

        public abstract void getTSendDataRequest();
    }
}
