package ashishrpa.session_04_assignment_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private ArrayList<String> al_contactName;
    private ArrayList<Integer> al_imageNumber;
    private TextView contactName1, contactNumber1;
    private ImageView imageView;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactName1 = (TextView)findViewById(R.id.contact_name);
        imageView = (ImageView)findViewById(R.id.image_number);
        gridView = (GridView) findViewById(R.id.gv_contacts);

        al_contactName = new ArrayList<>();
        al_imageNumber = new ArrayList<>();

        al_contactName.add("gingerbread");
        al_contactName.add("honeycomb");
        al_contactName.add("icecream");
        al_contactName.add("jellybean");
        al_contactName.add("kitkat");
        al_contactName.add("lollipop");
        al_contactName.add("gingerbread");
        al_contactName.add("honeycomb");
        al_contactName.add("icecream");
        al_contactName.add("jellybean");
        al_contactName.add("kitkat");
        al_contactName.add("lollipop");
        al_contactName.add("gingerbread");
        al_contactName.add("honeycomb");
        al_contactName.add("icecream");

        al_imageNumber.add(R.drawable.gingerbird);
        al_imageNumber.add(R.drawable.honeycomb);
        al_imageNumber.add(R.drawable.icecream);
        al_imageNumber.add(R.drawable.jellybean);
        al_imageNumber.add(R.drawable.kitkat);
        al_imageNumber.add(R.drawable.lollipop);
        al_imageNumber.add(R.drawable.gingerbird);
        al_imageNumber.add(R.drawable.honeycomb);
        al_imageNumber.add(R.drawable.icecream);
        al_imageNumber.add(R.drawable.jellybean);
        al_imageNumber.add(R.drawable.kitkat);
        al_imageNumber.add(R.drawable.lollipop);
        al_imageNumber.add(R.drawable.gingerbird);
        al_imageNumber.add(R.drawable.honeycomb);
        al_imageNumber.add(R.drawable.icecream);


        adapter = new MyAdapter();
        gridView.setAdapter(adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return al_contactName.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.android_logos,parent,false);
                holder = new ViewHolder();
                holder.bindView(convertView);
                convertView.setTag(holder);
                Log.e("Main_ACTIVITY","convertView is NULL");
            }
            else {
                holder = (ViewHolder)convertView.getTag();
            }
            holder.contactName.setText(al_contactName.get(position));
            holder.imageLogo.setImageResource(al_imageNumber.get(position));
            return convertView;
        }
    }
    public class ViewHolder{
        TextView contactName;
        ImageView imageLogo;
        void bindView(View convertView){
            Log.e("ViewHolder => bindView","Wow! its called...");
            contactName = (TextView)convertView.findViewById(R.id.contact_name);
            imageLogo = (ImageView) convertView.findViewById(R.id.image_number);
        }
    }
}

