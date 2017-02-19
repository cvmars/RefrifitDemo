package com.retrofitdemo;

import java.util.List;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public class FindContent {


    public String msg;
    public int code;

    public DataBean data;

    public static class DataBean {
        public int total;
        public int totalPage;
        public int pageSize;

        public List<QuotesListBean> quotesList;

        public static class QuotesListBean {
            public String content;
            public String uid;
            public String address;
            public String show_address;
            public String comment;
            public String prise;
            public String gmt_create;
            public String type;
            public String video;
            public Object activity;
            public String username;
            public String avatar;
            public int quote_id;
            public String relation;
            public String share_url;
            public boolean prised;
            public List<ImagesBean> images;
            public List<?> discus;

            public static class ImagesBean {
                public String width;
                public String height;
                public String url;
                public String url_xl;
                public String url_l;
                public String url_m;
                public List<?> labels_info;
            }
        }
    }
}
