package ming2.com.example.news.adapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ming2.com.example.news.R;
import ming2.com.example.news.newsBean.NewsBean;
import ming2.com.example.news.utilList.UtilList;

/**
 * Created by 云 on 2017/4/20.
 */

public class NewsAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList list;   //特别注意
    //创建构造器来传进数据
    public NewsAdapter(ArrayList<NewsBean> list, Context context){
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        //1、复用对象
        if(convertView!=null){
            view=convertView;
        }else {
            view=View.inflate(context, R.layout.item_news,null);
        }

        //2、获取view上的子控件对象
        ImageView item_img_icon= (ImageView) view.findViewById(R.id.img);
        TextView item_tv_title= (TextView) view.findViewById(R.id.tv_title);
        TextView item_tv_des= (TextView) view.findViewById(R.id.tv_des);

        //3、获取position位置对应的list集合中的新闻数据
        NewsBean bean= (NewsBean) list.get(position);
        //4、将数据传给子控件进行显示
        item_img_icon.setImageDrawable(bean.img);
        item_tv_title.setText(bean.title);
        item_tv_des.setText(bean.des);

        return view;
    }
}
