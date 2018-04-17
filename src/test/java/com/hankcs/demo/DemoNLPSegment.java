/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:13</create-date>
 *
 * <copyright file="DemoNLPSegment.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

/**
 * NLP分词
 * @author hankcs
 */
public class DemoNLPSegment
{
    public static void main(String[] args)
    {
        HanLP.Config.enableDebug();
//        List<Term> termList = NLPTokenizer.segment("财税[2012]25号文第一条“将上年度计提的担保赔偿准备金余额转为当期收入”的规定，其所表述的上年度赔偿准备余额应该理解为2010年当年的计提余额，还是应理解为截止至2010年底的担保赔偿准备金余额累计？");
        List<Term> termList = NLPTokenizer.segment("爱因斯坦是德国物理学家");
        System.out.println(termList);
    }
}
