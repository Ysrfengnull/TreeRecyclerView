package com.baozi.demo.moudle.newslist;

import com.baozi.demo.R;
import com.baozi.demo.moudle.newslist.bean.NewsItemBean;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.factory.ItemHelperFactory;
import com.baozi.treerecyclerview.model.TreeItem;
import com.baozi.treerecyclerview.model.TreeItemGroup;

import java.util.List;

/**
 * @author jlanglang  2017/7/5 17:15
 * @版本 2.0
 * @Change
 */

public class NewsItem extends TreeItemGroup<NewsItemBean> {
    @Override
    protected List<TreeItem> initChildsList(NewsItemBean data) {
        List<TreeItem> treeItemList = ItemHelperFactory.createTreeItemList(data.getImageBeanList(), this);
        treeItemList.add(ItemHelperFactory.createTreeItem(data.getFootBean()));
        return treeItemList;
    }

    @Override
    protected int initLayoutId() {
        return R.layout.item_news_title;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {

    }
}
