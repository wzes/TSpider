package com.wzes.tspider.module.spider;

import com.wzes.tspider.service.listener.OnCrawlListener;

import java.util.List;

/**
 * @author Create by xuantang
 * @date on 1/29/18
 *
 * 一个规则对应一个文件
 */
public class ExtractRule {
    private List<Item> items;
    private OnCrawlListener onCrawlListener;
}
