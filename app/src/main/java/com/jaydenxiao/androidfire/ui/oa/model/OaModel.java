package com.jaydenxiao.androidfire.ui.oa.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jaydenxiao.androidfire.api.Api;
import com.jaydenxiao.androidfire.api.HostType;
import com.jaydenxiao.androidfire.bean.User;
import com.jaydenxiao.androidfire.ui.oa.contract.OaContract;
import com.jaydenxiao.androidfire.ui.oa.contract.OaContract.Model;
import com.jaydenxiao.common.basebean.BaseRespose;
import com.jaydenxiao.common.baserx.RxSchedulers;

import okhttp3.ResponseBody;
import rx.Observable;


/**
 * Created by yyh on 2017-05-19.
 */

public class OaModel implements OaContract.Model {

    @Override
    public Observable<JSONObject> getMessageDetailData(String id) {
        return Api.getDefault(HostType.OA_TEST)
                .getMessageDetail(id).compose(RxSchedulers.<JSONObject>io_main());
    }
}
