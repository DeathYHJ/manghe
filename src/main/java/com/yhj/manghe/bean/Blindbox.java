package com.yhj.manghe.bean;

import lombok.Data;

/**
 * @package: com.yhj.manghe.bean
 * @ClassName: Blindbox  盲盒实体类
 * @author: yhj.
 * @date : 2022-01-19 16:53
 **/

@Data
public class Blindbox {
    private Integer id;  //盲盒id
    private String boxname;  //盲盒标题
    private String introduce;  //盲盒介绍
    private Integer availableQuantity;  //可用数量
    private Integer totalQuantity;  //总数量
    private Integer integral;  //所需积分
    private String author;  //作者
    private String photo;  //盲盒图片
}
