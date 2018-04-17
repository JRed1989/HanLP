/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/9 13:27</create-date>
 *
 * <copyright file="DemoSuggestor.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.suggest.Suggester;

/**
 * 文本推荐(句子级别，从一系列句子中挑出与输入句子最相似的那一个)
 * @author hankcs
 */
public class DemoSuggester
{
    public static void main(String[] args)
    {
        Suggester suggester = new Suggester();
        String[] titleArray =
        (
                "威廉王子发表演说 呼吁保护野生动物\n" +
                "魅惑天后许佳慧不爱“预谋” 独唱《许某某》\n" +
                "《时代》年度人物最终入围名单出炉 普京马云入选\n" +
                "“黑格比”横扫菲：菲吸取“海燕”经验及早疏散\n" +
                "日本保密法将正式生效 日媒指其损害国民知情权\n" +
                "英报告说空气污染带来“公共健康危机\n”"+
                "海外留学人员从事高新技术开发而取得的工资是否有相关的个人所得税优惠政策\n"+
                "财税[2012]25号文第一条“将上年度计提的担保赔偿准备金余额转为当期收入”的规定，其所表述的上年度赔偿准备余额应该理解为2010年当年的计提余额，还是应理解为截止至2010年底的担保赔偿准备金余额累计？\n"+
                "某员工12月与任职单位解除劳动合同，当月除正常取得工资、薪金所得之外，还取得了一次性补偿金18万元。员工从18万元的补偿金中拿出3万元补缴包括本月在内的以前月份欠交的三险一金（本月应缴2000元，以前欠缴28000元）。在计算个人所得税时，是只能扣除12月当月实际缴纳的三险一金2000元还是可以一次性扣除3万元的三险一金？\n"+
                "企业为员工缴纳补充养老保险，投保时已按工资、薪金所得扣缴了个人所得税，约定5年后保险公司将本金、利息一起返还给企业，再由企业发放给员工。职工取得返还的保险本金及利息收入，是否需要缴纳个人所得税\n"+
                "企业引进了外籍专家，国家把安家费先打入企业账户，企业再发给外籍个人。外籍个人收到的安家费是否要交个人所得税？ \n"+
                "智能机器人，智慧的世界，非常好的世界？ \n"+
                 "某企业A挂靠一B企业施工，工程材料成本和所有税款都交给B企业，A企业只收了一点管理费，清算时作了工程收入结算，另外还需交税吗"


        ).split("\\n");
        for (String title : titleArray)
        {
            suggester.addSentence(title);
        }

        System.out.println(suggester.suggest("陈述", 2));       // 语义
        System.out.println(suggester.suggest("危机公关", 1));   // 字符
        System.out.println(suggester.suggest("mayun", 1));      // 拼音
        System.out.println(suggester.suggest("共健", 1));      // 拼音
        System.out.println(suggester.suggest("外籍个人所得税", 1));      // 拼音
        System.out.println(suggester.suggest("只能机器人，只会", 1));      // 拼音
        System.out.println(suggester.suggest("混说八道", 1));      // 拼音
        System.out.println(suggester.suggest("pujing", 1));      // 拼音


    }
}
