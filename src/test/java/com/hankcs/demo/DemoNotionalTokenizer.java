/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2015/4/6 23:20</create-date>
 *
 * <copyright file="DemoStopword.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NotionalTokenizer;

import java.util.List;

/**
 * 演示自动去除停用词、自动断句的分词器
 * @author hankcs
 */
public class DemoNotionalTokenizer
{
    public static void main(String[] args)
    {
        String text = "财税[2012]25号文第一条“将上年度计提的担保赔偿准备金余额转为当期收入”的规定，其所表述的上年度赔偿准备余额应该理解为2010年当年的计提余额，还是应理解为截止至2010年底的担保赔偿准备金余额累计？";
        // 自动去除停用词
        System.out.println(NotionalTokenizer.segment(text));    // 停用词典位于data/dictionary/stopwords.txt，可以自行修改
        // 自动断句+去除停用词
        for (List<Term> sentence : NotionalTokenizer.seg2sentence(text))
        {
            System.out.println(sentence);
        }
    }
}
