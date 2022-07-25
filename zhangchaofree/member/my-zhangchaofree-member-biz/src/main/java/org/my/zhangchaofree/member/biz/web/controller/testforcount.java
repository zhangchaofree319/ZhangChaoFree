package org.my.zhangchaofree.member.biz.web.controller;

public class testforcount {

    private static long count = 0;

    public static void main(String[] args) {
        new Thread(()->{
            while (count < 10000000000L){
                count++;
            }
        }).run();

        new Thread(()->{
            while (count < 10000000000L){
                count++;
            }
        }).run();
        System.out.println(count);
//调用'run()'可能应该被替换为'start()'。调用方法thread .start()在专用线程中执行run()方法的内容

    }

}
