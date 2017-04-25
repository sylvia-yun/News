package ming2.com.example.news.utilList;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.util.ArrayList;

import ming2.com.example.news.R;
import ming2.com.example.news.newsBean.NewsBean;

/**
 * Created by 云 on 2017/4/20.
 */

public class UtilList {
   /* private static Context context;
    //构造器来传递数据
    public UtilList(Context context){
        this.context=context;
    }*/

    public static ArrayList<NewsBean> AllInfo(Context context){
        ArrayList<NewsBean> list=new ArrayList();
        for(int i=0;i<50;i++) {
            NewsBean bean=new NewsBean();
            bean.title = "火影忍者已经重新上架了";
            bean.des = "等了那么多年，还在一直坚持不懈地追求着，网友表示一直支持火影的上线";
            bean.img = context.getResources().getDrawable(R.drawable.icon1);
            bean.url = "http://sina.com";

            NewsBean bean2 = new NewsBean();
            bean2.title = "黄晓明与anglebaby秀恩爱";
            bean2.des = "《奔跑吧》第五季上线，跑了四季的Baby升级为母亲，暂时缺席前几期。但Baby带着" +
                    "小海绵惊喜现身，以mv形式为伐木累加油打气。" +
                    "虽然小海绵只是以侧面出镜，但仍可以看出小baby";
            bean2.img = context.getResources().getDrawable(R.drawable.icon2);
            bean2.url = "http://image.so.com/i?q=小图片&src=tab_www";

            NewsBean bean3 = new NewsBean();
            bean3.title = "女子开车撞男友将其刺死后自杀 恋爱多年没结婚";
            bean3.des = "据山东省菏泽市公安局开发区分局消息，4月20日18时许，" +
                    "在山东省菏泽市开发区广州路，李某某（女，巨野县人）驾驶汽车将郭某某（男，牡丹区人）" +
                    "撞伤后又将郭某某刺死，然后自杀，送医院抢救无效于当晚20时许死亡。" +
                    "目前，案件正在进一步调查处理中";
            bean3.img = context.getResources().getDrawable(R.drawable.icon3);
            bean3.url = "http://www.baidu.com";

            list.add(bean);
            list.add(bean2);
            list.add(bean3);
        }
        return list;

    }

}
