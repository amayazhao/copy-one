package com.zhao.copyone.model.bean;

import java.util.List;

/**
 * Created by 39424 on 2017/3/12.
 */

public class ContentListBean {
    /**
     * id : 9070
     * category : 0
     * display_category : 6
     * item_id : 1581
     * title : 绘画
     * forward : 许多人相信，没有注定的人生，所有的事基本上是一连串的巧合。然而，即使抱持如是信念的人也会有这样的结论：在生命中的某一段时期，当他们回头审视，发现多年来被视为巧合的事，其实是不可避免的。
     * img_url : http://image.wufazhuce.com/FgV1sJRhHYefN8FNRkJJIXpKbI97
     * like_count : 3166
     * post_date : 2017-01-08 06:00:00
     * last_update_date : 2017-01-04 18:22:59
     * author : {"user_id":"7654034","user_name":"黄集伟","desc":"黄集伟，专栏作者，曾有\u201c阅读笔记\u201d系列、\u201c语词笔记\u201d系列、《孤岛访谈录》等闲书出版。","wb_name":"","is_settled":"0","settled_type":"0","summary":"黄集伟，专栏作者。","fans_total":"9","web_url":"http://image.wufazhuce.com/FvVmWbqlle7jlUCTeozoval9NyBH"}
     * video_url :
     * audio_url :
     * audio_platform : 2
     * start_video :
     * volume : VOL.1555
     * pic_info : 大木耳Hammer Chen
     * words_info : 奥尔罕·帕慕克
     * subtitle :
     * number : 0
     * serial_id : 0
     * serial_list : []
     * movie_story_id : 0
     * ad_id : 0
     * ad_type : 0
     * ad_pvurl :
     * ad_linkurl :
     * ad_makettime :
     * ad_closetime :
     * ad_share_cnt :
     * ad_pvurl_vendor :
     * content_id : 1581
     * content_type : 0
     * content_bgcolor : #FFFFFF
     * share_url : http://m.wufazhuce.com/one/1581
     * share_info : {"url":"http://m.wufazhuce.com/one/1581","image":"http://image.wufazhuce.com/FgV1sJRhHYefN8FNRkJJIXpKbI97","title":"VOL.1555","content":"许多人相信，没有注定的人生，所有的事基本上是一连串的巧合。然而，即使抱持如是信念的人也会有这样的结论：在生命中的某一段时期，当他们回头审视，发现多年来被视为巧合的事，其实是不可避免的。"}
     * orientation : 0
     * music_name : 来来回回
     * audio_author : 陈楚生
     */

    private String id;
    private int category;
    private int display_category;
    private String item_id;
    private String title;
    private String forward;
    private String img_url;
    private int like_count;
    private String post_date;
    private String last_update_date;
    private AuthorBean author;
    private String video_url;
    private String audio_url;
    private int audio_platform;
    private String start_video;
    private String volume;
    private String pic_info;
    private String words_info;
    private String subtitle;
    private int number;
    private int serial_id;
    private int movie_story_id;
    private int ad_id;
    private int ad_type;
    private String ad_pvurl;
    private String ad_linkurl;
    private String ad_makettime;
    private String ad_closetime;
    private String ad_share_cnt;
    private String ad_pvurl_vendor;
    private String content_id;
    private String content_type;
    private String content_bgcolor;
    private String share_url;
    private ShareInfoBean share_info;
    private String orientation;
    private String music_name;
    private String audio_author;
    private List<?> serial_list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getDisplay_category() {
        return display_category;
    }

    public void setDisplay_category(int display_category) {
        this.display_category = display_category;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public int getAudio_platform() {
        return audio_platform;
    }

    public void setAudio_platform(int audio_platform) {
        this.audio_platform = audio_platform;
    }

    public String getStart_video() {
        return start_video;
    }

    public void setStart_video(String start_video) {
        this.start_video = start_video;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPic_info() {
        return pic_info;
    }

    public void setPic_info(String pic_info) {
        this.pic_info = pic_info;
    }

    public String getWords_info() {
        return words_info;
    }

    public void setWords_info(String words_info) {
        this.words_info = words_info;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSerial_id() {
        return serial_id;
    }

    public void setSerial_id(int serial_id) {
        this.serial_id = serial_id;
    }

    public int getMovie_story_id() {
        return movie_story_id;
    }

    public void setMovie_story_id(int movie_story_id) {
        this.movie_story_id = movie_story_id;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public int getAd_type() {
        return ad_type;
    }

    public void setAd_type(int ad_type) {
        this.ad_type = ad_type;
    }

    public String getAd_pvurl() {
        return ad_pvurl;
    }

    public void setAd_pvurl(String ad_pvurl) {
        this.ad_pvurl = ad_pvurl;
    }

    public String getAd_linkurl() {
        return ad_linkurl;
    }

    public void setAd_linkurl(String ad_linkurl) {
        this.ad_linkurl = ad_linkurl;
    }

    public String getAd_makettime() {
        return ad_makettime;
    }

    public void setAd_makettime(String ad_makettime) {
        this.ad_makettime = ad_makettime;
    }

    public String getAd_closetime() {
        return ad_closetime;
    }

    public void setAd_closetime(String ad_closetime) {
        this.ad_closetime = ad_closetime;
    }

    public String getAd_share_cnt() {
        return ad_share_cnt;
    }

    public void setAd_share_cnt(String ad_share_cnt) {
        this.ad_share_cnt = ad_share_cnt;
    }

    public String getAd_pvurl_vendor() {
        return ad_pvurl_vendor;
    }

    public void setAd_pvurl_vendor(String ad_pvurl_vendor) {
        this.ad_pvurl_vendor = ad_pvurl_vendor;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getContent_bgcolor() {
        return content_bgcolor;
    }

    public void setContent_bgcolor(String content_bgcolor) {
        this.content_bgcolor = content_bgcolor;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public ShareInfoBean getShare_info() {
        return share_info;
    }

    public void setShare_info(ShareInfoBean share_info) {
        this.share_info = share_info;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public String getAudio_author() {
        return audio_author;
    }

    public void setAudio_author(String audio_author) {
        this.audio_author = audio_author;
    }

    public List<?> getSerial_list() {
        return serial_list;
    }

    public void setSerial_list(List<?> serial_list) {
        this.serial_list = serial_list;
    }

    public static class AuthorBean {
        /**
         * user_id : 7654034
         * user_name : 黄集伟
         * desc : 黄集伟，专栏作者，曾有“阅读笔记”系列、“语词笔记”系列、《孤岛访谈录》等闲书出版。
         * wb_name :
         * is_settled : 0
         * settled_type : 0
         * summary : 黄集伟，专栏作者。
         * fans_total : 9
         * web_url : http://image.wufazhuce.com/FvVmWbqlle7jlUCTeozoval9NyBH
         */

        private String user_id;
        private String user_name;
        private String desc;
        private String wb_name;
        private String is_settled;
        private String settled_type;
        private String summary;
        private String fans_total;
        private String web_url;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getWb_name() {
            return wb_name;
        }

        public void setWb_name(String wb_name) {
            this.wb_name = wb_name;
        }

        public String getIs_settled() {
            return is_settled;
        }

        public void setIs_settled(String is_settled) {
            this.is_settled = is_settled;
        }

        public String getSettled_type() {
            return settled_type;
        }

        public void setSettled_type(String settled_type) {
            this.settled_type = settled_type;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getFans_total() {
            return fans_total;
        }

        public void setFans_total(String fans_total) {
            this.fans_total = fans_total;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }
    public static class ShareInfoBean {
        /**
         * url : http://m.wufazhuce.com/one/1581
         * image : http://image.wufazhuce.com/FgV1sJRhHYefN8FNRkJJIXpKbI97
         * title : VOL.1555
         * content : 许多人相信，没有注定的人生，所有的事基本上是一连串的巧合。然而，即使抱持如是信念的人也会有这样的结论：在生命中的某一段时期，当他们回头审视，发现多年来被视为巧合的事，其实是不可避免的。
         */

        private String url;
        private String image;
        private String title;
        private String content;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
