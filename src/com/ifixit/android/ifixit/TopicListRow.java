package com.ifixit.android.ifixit;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TopicListRow extends LinearLayout {
   private TextView mTopicName;
   private TopicNode mTopic;

   public TopicListRow(Context context) {
      super(context);      

      LayoutInflater inflater = (LayoutInflater)context.getSystemService(
       Context.LAYOUT_INFLATER_SERVICE);
      inflater.inflate(R.layout.topic_list_row, this, true);        

      mTopicName = (TextView)findViewById(R.id.topic_title);
   }

   public void setTopic(TopicNode topic) {
      mTopic = topic;
      mTopicName.setText(mTopic.getName());
   }
}