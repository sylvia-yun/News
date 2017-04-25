package ming2.com.example.news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ming2.com.example.news.adapter.NewsAdapter;
import ming2.com.example.news.newsBean.NewsBean;
import ming2.com.example.news.utilList.UtilList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        //1、布局
        //2、找到各个控件
        ListView listView= (ListView) findViewById(R.id.lv_news);
        //3、获取新闻列的数据封装起来
        ArrayList<NewsBean> allNews=UtilList.AllInfo(mContext);
        //4、创建一个adapter适配器
        NewsAdapter newsAdapter=new NewsAdapter(allNews,mContext);
        listView.setAdapter(newsAdapter);
        //5、设置点击事件
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //1、获得bean对象
        NewsBean bean= (NewsBean) parent.getItemAtPosition(position);
        String murl=bean.url;
        //2、点击跳转到网络地址
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(murl));
        startActivity(intent);
    }
}
