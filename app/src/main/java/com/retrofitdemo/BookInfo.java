package com.retrofitdemo;

import java.util.List;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class BookInfo {


    @Override
    public String toString() {
        return "BookInfo{" +
                "rating=" + rating +
                ", subtitle='" + subtitle + '\'' +
                ", pubdate='" + pubdate + '\'' +
                ", origin_title='" + origin_title + '\'' +
                ", image='" + image + '\'' +
                ", binding='" + binding + '\'' +
                ", catalog='" + catalog + '\'' +
                ", pages='" + pages + '\'' +
                ", images=" + images +
                ", alt='" + alt + '\'' +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", alt_title='" + alt_title + '\'' +
                ", author_intro='" + author_intro + '\'' +
                ", summary='" + summary + '\'' +
                ", price='" + price + '\'' +
                ", author=" + author +
                ", tags=" + tags +
                ", translator=" + translator +
                '}';
    }

    /**
     * max : 10
     * numRaters : 356
     * average : 7.0
     * min : 0
     */

    public RatingBean rating;
    /**
     * rating : {"max":10,"numRaters":356,"average":"7.0","min":0}
     * subtitle :
     * author : ["[日] 片山恭一"]
     * pubdate : 2005-1
     * tags : [{"count":141,"name":"片山恭一","title":"片山恭一"},{"count":67,"name":"日本","title":"日本"},{"count":64,"name":"日本文学","title":"日本文学"},{"count":39,"name":"小说","title":"小说"},{"count":33,"name":"满月之夜白鲸现","title":"满月之夜白鲸现"},{"count":15,"name":"爱情","title":"爱情"},{"count":9,"name":"純愛","title":"純愛"},{"count":7,"name":"外国文学","title":"外国文学"}]
     * origin_title :
     * image : https://img3.doubanio.com/mpic/s1747553.jpg
     * binding : 平装
     * translator : ["豫人"]
     * catalog :

     * pages : 180
     * images : {"small":"https://img3.doubanio.com/spic/s1747553.jpg","large":"https://img3.doubanio.com/lpic/s1747553.jpg","medium":"https://img3.doubanio.com/mpic/s1747553.jpg"}
     * alt : https://book.douban.com/subject/1220562/
     * id : 1220562
     * publisher : 青岛出版社
     * isbn10 : 7543632608
     * isbn13 : 9787543632608
     * title : 满月之夜白鲸现
     * url : https://api.douban.com/v2/book/1220562
     * alt_title :
     * author_intro :
     * summary : 那一年，是听莫扎特、钓鲈鱼和家庭破裂的一年。说到家庭破裂，母亲怪自己当初没有找到好男人，父亲则认为当时是被狐狸精迷住了眼，失常的是母亲，但出问题的是父亲……。
     * price : 15.00元
     */

    public String subtitle;
    public String pubdate;
    public String origin_title;
    public String image;
    public String binding;
    public String catalog;
    public String pages;
    /**
     * small : https://img3.doubanio.com/spic/s1747553.jpg
     * large : https://img3.doubanio.com/lpic/s1747553.jpg
     * medium : https://img3.doubanio.com/mpic/s1747553.jpg
     */

    public ImagesBean images;
    public String alt;
    public String id;
    public String publisher;
    public String isbn10;
    public String isbn13;
    public String title;
    public String url;
    public String alt_title;
    public String author_intro;
    public String summary;
    public String price;
    public List<String> author;
    /**
     * count : 141
     * name : 片山恭一
     * title : 片山恭一
     */

    public List<TagsBean> tags;
    public List<String> translator;

    public static class RatingBean {
        public int max;
        public int numRaters;
        public String average;
        public int min;
    }

    public static class ImagesBean {
        public String small;
        public String large;
        public String medium;
    }

    public static class TagsBean {
        public int count;
        public String name;
        public String title;
    }
}
