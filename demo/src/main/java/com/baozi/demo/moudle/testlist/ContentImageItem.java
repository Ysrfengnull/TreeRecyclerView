package com.baozi.demo.moudle.testlist;

import com.baozi.demo.R;
import com.baozi.demo.moudle.testlist.bean.ContentBean;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.base.BaseItem;

/**
 * Created by baozi on 2017/4/27.
 */

public class ContentImageItem extends BaseItem<ContentBean> {
    @Override
    protected int initLayoutId() {
        return R.layout.testlist_content_image;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.setBackgroundRes(R.id.iv_content, R.mipmap.ic_launcher);
    }
}
