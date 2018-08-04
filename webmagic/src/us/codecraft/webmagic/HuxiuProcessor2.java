package us.codecraft.webmagic;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @author code4crafter@gmail.com <br>
 */
public class HuxiuProcessor2 implements PageProcessor {
    @Override
    public void process(Page page) {
        
    }

    @Override
    public Site getSite() {
        return Site.me().setDomain("www.huxiu.com");
    }

    public static void main(String[] args) {
        Spider.create(new HuxiuProcessor2()).addUrl("http://www.huxiu.com/").run();
    }

}
