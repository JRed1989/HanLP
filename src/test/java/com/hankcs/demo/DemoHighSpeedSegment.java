/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/24 23:20</create-date>
 *
 * <copyright file="DemoHighSpeedSegment.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.SpeedTokenizer;

import java.util.List;

/**
 * 演示极速分词，基于DoubleArrayTrie实现的词典正向最长分词，适用于“高吞吐量”“精度一般”的场合
 * @author hankcs
 */
public class DemoHighSpeedSegment
{
    public static void main(String[] args)
    {
//        String text = "江西鄱阳湖干枯，中国最大淡水湖变成大草原";
//        String text = "爱因斯坦是德国物理学家";
        String text = "我购买一套营业房，因开发商需要改为消防通道，不得不退房，这样开发商需赔偿部分补偿费，请问需要交纳个人所得税吗？我们不得已才退房的。";
        HanLP.Config.ShowTermNature = false;
        System.out.println(SpeedTokenizer.segment(text));
        List<Term> list = SpeedTokenizer.segment(text);

        for(Term term : list){
            System.out.print(term.word+" ");
        }

        long start = System.currentTimeMillis();
        int pressure = 1000000;
        for (int i = 0; i < pressure; ++i)
        {
            SpeedTokenizer.segment(text);
        }
        double costTime = (System.currentTimeMillis() - start) / (double)1000;
        System.out.printf("SpeedTokenizer分词速度：%.2f字每秒\n", text.length() * pressure / costTime);
    }
}
